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
public class PremiumCardFactory extends Factory {

   public PremiumCardFactory() {
        super();
    }

    @Override
    public Card createCard(double costo, double limiteCredito) {
        return new PremiumCard(costo,limiteCredito);
    }

   
    
    
    
}
