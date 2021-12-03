package ec.edu.espol.decorator;

public class SignalDecorator extends NotifierDecorator {

    public SignalDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {

    }
}
