package testingLab;

public class Main {

	public static void main(String[] args) {
        System.out.println("=== Example 1: 1 Hobbit vs 1 Orc ===");
        GoodArmy good1 = new GoodArmy();
        EvilArmy evil1 = new EvilArmy();
        good1.add(GoodRace.HOBBIT, 1);
        evil1.add(EvilRace.ORC, 1);
        battle(good1, evil1);

        System.out.println("\n=== Example 2: 2 Hobbits vs 1 Orc ===");
        GoodArmy good2 = new GoodArmy();
        EvilArmy evil2 = new EvilArmy();
        good2.add(GoodRace.HOBBIT, 2);
        evil2.add(EvilRace.ORC, 1);
        battle(good2, evil2);

        System.out.println("\n=== Example 3: 3 Hobbits vs 1 Orc ===");
        GoodArmy good3 = new GoodArmy();
        EvilArmy evil3 = new EvilArmy();
        good3.add(GoodRace.HOBBIT, 3);
        evil3.add(EvilRace.ORC, 1);
        battle(good3, evil3);

        System.out.println("\n=== Epic Battle: Mixed armies ===");
        GoodArmy good4 = new GoodArmy();
        EvilArmy evil4 = new EvilArmy();
        good4.add(GoodRace.ELF, 2);
        good4.add(GoodRace.DWARF, 3);
        good4.add(GoodRace.NUMENOREAN, 1);
        evil4.add(EvilRace.TROLL, 3);
        evil4.add(EvilRace.ORC, 4);
        evil4.add(EvilRace.WARG, 2);
        battle(good4, evil4);
    }
	}

}
