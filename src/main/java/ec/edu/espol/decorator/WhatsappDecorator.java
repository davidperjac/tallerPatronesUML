/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.decorator;

/**
 *
 * @author davidperez
 */
public class WhatsappDecorator extends NotifierDecorator{
    
    public WhatsappDecorator(Notifier wrappee) {
        super(wrappee);
    }
    
    @Override 
    public void send(String message) {
        
    }
    
}
