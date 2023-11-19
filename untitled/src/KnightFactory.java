public class KnightFactory implements CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Knight();
    }
}
