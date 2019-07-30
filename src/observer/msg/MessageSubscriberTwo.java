package observer.msg;

public class MessageSubscriberTwo implements Observer {

    @Override
    public void update(Message message) {

        System.out.println("MessageSubscriberTwo"+ message.getMsg());
    }
}
