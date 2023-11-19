import java.util.ArrayList;
import java.util.List;

public class HealthDisplay implements Observed{
    List <Character> observers = new ArrayList<>();

    Character character;

    int health;

    public HealthDisplay(Character character) {
        this.character = character;
    }

    public HealthDisplay(int health) {
        this.health = health;
    }

    public List<Character> getObservers() {
        return observers;
    }

    public void setObservers(List<Character> observers) {
        this.observers = observers;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void addObserver(Character observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Character observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Character observer : observers) {
            observer.handleEvent(this.character,this.health);
        }
    }
}
