public class Alchemist implements Character{
    SwordDecorator poisonSword = new PoisonSwordDecorator(new SimpleSword());
    @Override
    public int damage() {
        return poisonSword.damage();
    }

    @Override
    public int health() {
        return 150;
    }

    @Override
    public String name() {
        return "Amirkhan";
    }

    @Override
    public String sword() {
        return poisonSword.description();
    }
    @Override
    public void handleEvent(Character character,int health) {
        System.out.println(character.name() + " health is: " + health);
    }
}