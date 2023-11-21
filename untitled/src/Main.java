public class Main {
    public static void main(String[] args) {
        /*SwordDecorator sword = new ReinforcedSwordDecorator(new SimpleSword());

        System.out.println(sword.description());
        System.out.println(sword.damage());

        SwordDecorator sword3 = new PoisonSwordDecorator(new SimpleSword());
        System.out.println(sword3.damage());
        System.out.println(sword3.description());
смпспсго tory2 = new GoldenKnightFactory();
        Character character2 = characterFactory2.createCharacter();
        System.out.println(character2.sword());

        CharacterFactory alchemistFactory = new AlchemistFactory();
        Character alchemist = alchemistFactory.createCharacter();
        System.out.println(alchemist.sword());

         */

        CharacterFactory handFighterFactory = new HandFighterFactory();
        Character firstFighter = handFighterFactory.createCharacter();

        CharacterFactory goldenFighterFactory = new GoldenKnightFactory();
        GoldenKnight secondFighter = (GoldenKnight) goldenFighterFactory.createCharacter();


        GameLogger logger = GameLogger.getInstance();

        logger.logMessage("Game Started");
        attack(firstFighter,secondFighter);


    }
    public static void attack(Character attacker,Character defender) {
        HealthDisplay healthDisplay = new HealthDisplay(defender);
        healthDisplay.addObserver(attacker);
        healthDisplay.addObserver(defender);
        healthDisplay.setHealth(defender.health()-attacker.damage());
        healthDisplay.notifyObservers();

    }

}
