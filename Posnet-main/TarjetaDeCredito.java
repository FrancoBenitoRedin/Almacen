/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posnet;

/**
 *
 * @author info6
 */
public class TarjetaDeCredito {
    private String EntidadBancaria;
    private String numeroTarjeta;
    private double Saldo;
    public EntidadFinanciera entidadFinanciera;
    public Persona titular;
    public String getNombreCompleto(){
    return titular.getNombre()+ titular.getApellido();
    }
            
    public TarjetaDeCredito(String EntidadBancaria, String numeroTarjeta, double Saldo, EntidadFinanciera entidadFinanciera, Persona titular) {
        this.EntidadBancaria = EntidadBancaria;
        this.numeroTarjeta = numeroTarjeta;
        this.Saldo = Saldo;
        this.entidadFinanciera = entidadFinanciera;
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "EntidadBancaria=" + EntidadBancaria + ", numeroTarjeta=" + numeroTarjeta + ", Saldo=" + Saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }

    public boolean tieneSaldoDisponible(double montoFinal) {
        return Saldo>=montoFinal;
    }

    void Descontar(double montoFinal) {
        
    }


    
}
