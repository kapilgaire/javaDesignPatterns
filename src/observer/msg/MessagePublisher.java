package observer.msg;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject{

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer observer) {

        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyUpdate(Message message) {

        for(Observer o: observers){
            o.update(message);
        }
    }
}
