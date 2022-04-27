/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Posnet;

/**
 *
 * @author info6
 */
public class Principal {

    public static void main(String[] args) {
    
    Posnet posnet = new Posnet();
    Persona titular = new Persona("192.18.3.2","Jose","Perez","1234567","perez@gmail.com"); 
    TarjetaDeCredito tarjetadecredito = new TarjetaDeCredito("BBVA","5555",15000,EntidadFinanciera.VISA,titular);
    
        System.out.println(titular);
        System.out.println(tarjetadecredito);
        
        Ticket ticket = posnet.efectuarPago(tarjetadecredito,10000,5);
        
    }
    
}
