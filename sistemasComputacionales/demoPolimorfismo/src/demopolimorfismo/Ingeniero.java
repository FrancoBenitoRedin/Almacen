/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demopolimorfismo;

/**
 *
 * @author Info7
 */
public class Ingeniero extends Empleado{
    private int horas;

    public Ingeniero(int horas, String dni, String nombre, double salario) {
        super(dni, nombre, salario);
        this.horas = horas;
    }

    
    @Override
    public double calcularSalario() {
        double totalSalario = 0;
        double hx = horas - 200;
        double totalHoras = hx*(15*1.5);
       
        
        totalSalario = super.getSalario() + totalHoras;
        
        
        return totalSalario; }
    
}
