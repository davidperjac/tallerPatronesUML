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
public class Factura {
    
    private double total;
    private static double IVA = 1.12;
    
    public  Factura(double total){
        this.total = total * IVA;
    }
    
    public static Factura enviarFactura(){
        // metodos para enviar factura por email
        return new Factura(0);
    }
}
