public class AlchemistFactory implements CharacterFactory{
    @Override
    public Character createCharacter() {
        return new Alchemist();
    }
}
