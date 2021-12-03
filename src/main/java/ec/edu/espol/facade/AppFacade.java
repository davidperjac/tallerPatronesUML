/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.facade;

/**
 *
 * @author Fernando
 */
public class AppFacade {
    
    public void pagar(){
        Pago.calcularTotal();
        Pago.pagar(0);
        Pago.validarPago();
        Pedido.generarPedido();
    }
    
    public void agregarArticulo(){
        CarroCompras.agregarArticulo(null);
        
    }
    
    public void chequearEnvio(){
       Pedido.chequearPedido();
    }
}
