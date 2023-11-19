public class GoldenKnight implements Character{
    SwordDecorator ReinforcedSword = new ReinforcedSwordDecorator(new SimpleSword());
    @Override
    public int damage() {
        return ReinforcedSword.damage();
    }

    @Override
    public int health() {
        return 240;
    }

    @Override
    public String name() {
        return "Adlet";
    }

    @Override
    public String sword() {
        return ReinforcedSword.description();
    }

    @Override
    public void handleEvent(Character character,int health) {
        System.out.println(character.name() + " health is: " + health);
    }

}
