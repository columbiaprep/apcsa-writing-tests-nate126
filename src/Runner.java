import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    

    @Test
    public void test() {
        Helmet helmet = new Helmet("Gold");
        assertEquals(1.5, helmet.getWeight(), .1);
        assertEquals("Gold", helmet.getHelmetType());
    } 

    @Test
    public void test2() {
        Boots boots = new Boots(true, "Leather", false); 
        assertEquals(1, boots.getStrMod());
        assertEquals(2, boots.getDexMod());
    }
    

    @Test
    public void test3() { 
        BodyArmor bodyArmor = new BodyArmor("Iron"); 
        assertEquals(2, bodyArmor.getArmorClass());
        assertEquals(0, bodyArmor.getChaMod());
    }

    @Test
    public void test4() { 
        Gauntlets gauntlet = new Gauntlets(1); 
        assertEquals(2, gauntlet.getModifier("strength"));
        assertEquals(-1, gauntlet.getModifier("dexterity"));
    }

    @Test
    public void test5() { 
        Gloves glove = new Gloves("Common", "The Force", true, 20, 500, 10); 
        assertEquals("Common", glove.getRarity());
        assertEquals(500, glove.getGloveCost());
    }

    @Test
    public void test6() { 
        MeleeWeapon melee = new MeleeWeapon("Sword", 10, 15, 30.5, 2.5, 7); 
        assertEquals("Sword", melee.getType());
        assertEquals(7, melee.getSharpness());
    }

    @Test
    public void test7() { 
        Shield shield = new Shield("steel"); 
        assertEquals(2, shield.getStrMod());;
        assertEquals(2, shield.getConMod());
    }
    
    @Test
    public void test8() { 
        Species elf = new Species("Elf"); 
        assertEquals("Elf", elf.getSpecies());
        assertEquals(1, elf.getDexMod());

        Species dwarf = new Species("Dwarf"); 
        assertEquals("Dwarf", dwarf.getSpecies());
        assertEquals(1, dwarf.getDexMod());
        
    }

    @Test
    public void test9() { 
        Role role = new Role("Paladin"); 
        assertEquals(200, role.getChaMod());

    }


}