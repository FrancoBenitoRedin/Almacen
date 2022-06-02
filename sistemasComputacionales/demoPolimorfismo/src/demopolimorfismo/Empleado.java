/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demopolimorfismo;

/**
 *
 * @author Info7
 */
public abstract class Empleado {
    
    private String dni;
    private String nombre;
    private double salario;

    public Empleado(String dni, String nombre, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    public abstract double calcularSalario();
    
}
