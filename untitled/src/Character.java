public interface Character {
    int damage();
    int health();
    String name();
    String sword();
    void handleEvent(Character character,int health);

}
