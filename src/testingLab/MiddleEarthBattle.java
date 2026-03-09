import java.util.HashMap;
import java.util.Map;

public class MiddleEarthBattle {

    enum GoodRace {
        HOBBIT(1),
        SOUTHRON_GOOD(2),
        DWARF(3),
        NUMENOREAN(4),
        ELF(5);

        int value;

        GoodRace(int value) {
            this.value = value;
        }
    }

    enum EvilRace {
        SOUTHRON_EVIL(2),
        ORC(2),
        GOBLIN(2),
        WARG(3),
        TROLL(5);

        int value;

        EvilRace(int value) {
            this.value = value;
        }
    }

    static class GoodArmy {
        private Map<GoodRace, Integer> members = new HashMap<>();

        void add(GoodRace race, int amount) {
            if (members.containsKey(race)) {
                members.put(race, members.get(race) + amount);
            } else {
                members.put(race, amount);
            }
        }

        int totalStrength() {
            int total = 0;
            for (Map.Entry<GoodRace, Integer> entry : members.entrySet()) {
                total += entry.getKey().value * entry.getValue();
            }
            return total;
        }

        @Override
        public String toString() {
            String result = "Army of GOOD:\n";
            for (Map.Entry<GoodRace, Integer> entry : members.entrySet()) {
                result += "  " + entry.getValue() + "x " + entry.getKey() + " (value " + entry.getKey().value + " each)\n";
            }
            result += "  Total strength: " + totalStrength();
            return result;
        }
    }

    static class EvilArmy {
        private Map<EvilRace, Integer> members = new HashMap<>();

        void add(EvilRace race, int amount) {
            if (members.containsKey(race)) {
                members.put(race, members.get(race) + amount);
            } else {
                members.put(race, amount);
            }
        }

        int totalStrength() {
            int total = 0;
            for (Map.Entry<EvilRace, Integer> entry : members.entrySet()) {
                total += entry.getKey().value * entry.getValue();
            }
            return total;
        }

        @Override
        public String toString() {
            String result = "Army of EVIL:\n";
            for (Map.Entry<EvilRace, Integer> entry : members.entrySet()) {
                result += "  " + entry.getValue() + "x " + entry.getKey() + " (value " + entry.getKey().value + " each)\n";
            }
            result += "  Total strength: " + totalStrength();
            return result;
        }
    }

    static void battle(GoodArmy good, EvilArmy evil) {
        System.out.println(good);
        System.out.println(evil);
        System.out.println();

        int strengthGood = good.totalStrength();
        int strengthEvil = evil.totalStrength();

        if (strengthGood > strengthEvil) {
            System.out.println("✅ GOOD wins! (" + strengthGood + " vs " + strengthEvil + ")");
        } else if (strengthEvil > strengthGood) {
            System.out.println("💀 EVIL wins! (" + strengthEvil + " vs " + strengthGood + ")");
        } else {
            System.out.println("⚖️  DRAW! (" + strengthGood + " vs " + strengthEvil + ")");
        }
    }