package designPatternObserver.interfaces;

public interface ObservableSubject {
    void registerObserver(Observer ob);
    void removeObserver(Observer ob);
    void notifyObserver();
}
