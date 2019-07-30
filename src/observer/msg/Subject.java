package observer.msg;

public interface Subject {

    void register(Observer observer);

    void unregister(Observer observer);

    void notifyUpdate(Message message);
}
