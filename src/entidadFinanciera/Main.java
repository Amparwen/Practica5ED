/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entidadFinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jennifer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          CCuenta objetoCuenta;
        double saldoActual;
        

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es "+ saldoActual );
        
        try {
            probarIngresar(objetoCuenta,1500, 4000);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            probarRetirar(objetoCuenta,100, 3900);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es "+ saldoActual );
    }
    
    public static void probarIngresar(CCuenta c, int cantidad, int cantidadEsperada) throws Exception{
        c.ingresar(cantidad);
        
    }
    
    public static void probarRetirar(CCuenta c, int cantidad, int cantidadEsperada) throws Exception{
        c.retirar(cantidad);
    
    }
    
}
