public class HandFighter implements Character{
    @Override
    public int damage() {
        return 12;
    }

    @Override
    public int health() {
        return 200;
    }

    @Override
    public String name() {
        return "Raiymbek";
    }

    @Override
    public String sword() {
        return null;
    }
    @Override
    public void handleEvent(Character character,int health) {
        System.out.println(character.name() + " health is: " + health);
    }
}
