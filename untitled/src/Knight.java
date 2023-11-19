public class Knight implements Character{
    private SwordDecorator simpleSword = new SimpleSword();
    @Override
    public int damage() {
        return simpleSword.damage();
    }

    @Override
    public int health() {
        return 220;
    }

    @Override
    public String name() {
        return "Temirlan";
    }

    @Override
    public String sword() {
        return simpleSword.description();
    }
    @Override
    public void handleEvent(Character character,int health) {
        System.out.println(character.name() + " health is: " + health);
    }
}
