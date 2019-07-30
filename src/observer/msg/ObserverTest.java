package observer.msg;

public class ObserverTest {

    public static void main(String[] args) {

        MessageSubscriberOne messageSubscriberOne = new MessageSubscriberOne();

        MessageSubscriberTwo messageSubscriberTwo = new MessageSubscriberTwo();



        MessagePublisher messagePublisher = new MessagePublisher();

        messagePublisher.register(messageSubscriberOne);
        messagePublisher.register(messageSubscriberTwo);

        messagePublisher.notifyUpdate(new Message(" Got your message"));
    }
}
