/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demopolimorfismo;

/**
 *
 * @author Info7
 */
public class Operario extends Empleado{
     private int horas;

    public Operario(int horas, String dni, String nombre, double salario) {
        super(dni, nombre, salario);
        this.horas = horas;
    }
     
    
    
    @Override
    public double calcularSalario() {
        
        double totalSalario = 0;
        double hx = horas - 200;
        double totalHoras = hx*(3.75*1.5);
        
        double plus = super.getSalario()*0.1;
        
        totalSalario = super.getSalario() + totalHoras;
        
        
        return totalSalario;
    }
    
}
