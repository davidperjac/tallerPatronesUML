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
public abstract class Factory {
    

    public Factory() {
    }
    
    public abstract Card createCard(double costo, double limiteCredito);
}
