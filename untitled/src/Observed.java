public interface Observed {
    void addObserver (Character observer);

    void removeObserver (Character observer);
    void notifyObservers();
}
