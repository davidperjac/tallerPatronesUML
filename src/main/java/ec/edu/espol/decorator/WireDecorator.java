
package ec.edu.espol.decorator;


public class WireDecorator extends NotifierDecorator{
    
    public WireDecorator(Notifier wrappee) {
        super(wrappee);
    }
    
    @Override
    public void send(String message) {

    }
    
}
