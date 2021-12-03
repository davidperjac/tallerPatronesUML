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
public abstract class Card {
    private double costo;
    private double limiteCredito;

    public Card(double costo, double limiteCredito) {
        this.costo = costo;
        this.limiteCredito = limiteCredito;
    }
    
}
