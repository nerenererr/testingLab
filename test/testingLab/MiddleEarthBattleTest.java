import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MiddleEarthBattleTest {

    @Test
    void goodWins() {
        MiddleEarth.GoodArmy goodArmy = new MiddleEarth.GoodArmy();
        goodArmy.add(MiddleEarth.GoodRace.NUMENOREAN, 4);
        assertEquals(16, goodArmy.totalStrength()); // 4 Numenoreans x value 4 = 16
    }

    @Test
    void evilWins() {
        String result = MiddleEarth.battle(4, 25);
        assertEquals("evil wins", result);
    }

    @Test
    void elfStrengthIsNotTen() {
        MiddleEarth.GoodArmy goodArmy = new MiddleEarth.GoodArmy();
        goodArmy.add(MiddleEarth.GoodRace.ELF, 5);
        assertNotEquals(10, goodArmy.totalStrength()); // 5 Elves x value 5 = 25, not 10
    }

    @Test
    void goodLoses() {
        String result = MiddleEarth.battle(1, 4);
        assertFalse(result.contains("good wins"));
    }

    @Test
    void draw() {
        String result = MiddleEarth.battle(9, 9);
        assertTrue(result.contains("draw"));
    }

    @Test
    void invalidRace() {
        assertThrows(IllegalArgumentException.class, () -> {
            MiddleEarth.EvilRace.valueOf("DRAGON");
        });
    }
}