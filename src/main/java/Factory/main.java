/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author user
 */
public class main {
    public void main (String[] args){
        Factory factory = new BasicCardFactory();
        Card cliente1 = factory.createCard(100, 20);
        
        
    }
}
