public class GoldenKnightFactory implements CharacterFactory{
    @Override
    public Character createCharacter() {
        return new GoldenKnight();
    }
}
