
package ec.edu.espol.decorator;


public class TelegramDecorator extends NotifierDecorator{

    public TelegramDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {

    }
}
