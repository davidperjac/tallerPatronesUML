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
public class VIPCardFactory extends Factory{

    public VIPCardFactory() {
        super();
    }

    @Override
    public Card createCard(double costo, double limiteCredito) {
       return new VIPCard(costo,limiteCredito);
    }
    
}
