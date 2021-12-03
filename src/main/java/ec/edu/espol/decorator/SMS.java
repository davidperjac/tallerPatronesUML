
package ec.edu.espol.decorator;


public class SMS implements Notifier{

    public SMS(Notifier wrappee) {
    }
    
    @Override
    public void send(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
