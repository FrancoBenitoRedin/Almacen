/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demopolimorfismo;

/**
 *
 * @author Info7
 */
public class DemoPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tecnico t = new Tecnico(201, "12345", "ada", 1500);
        Operario p = new Operario(201,"1234","ada",750);
        Ingeniero i = new Ingeniero(201,"1234","ada",3000);
        
        System.out.println("Tecnico: "+ t.calcularSalario());
        System.out.println("Operario: "+ p.calcularSalario());
        System.out.println("Ingeniero: "+ i.calcularSalario());
    }
    
}
