
package ec.edu.espol.decorator;


public class Email implements Notifier{

    public Email(Notifier wrappee) {
    }
    
    @Override
    public void send(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
