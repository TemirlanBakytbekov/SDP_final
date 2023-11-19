public class HandFighterFactory implements CharacterFactory{
    @Override
    public Character createCharacter() {
        return new HandFighter();
    }
}
