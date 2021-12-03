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
public class BasicCardFactory extends Factory {

    public BasicCardFactory() {
        super();
    }

   

    @Override
    public Card createCard(double costo, double limiteCredito) {
       return new BasicCard(costo,limiteCredito);
    }
    
}
