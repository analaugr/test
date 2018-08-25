/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresamain;

/**
 *
 * @author Ana Lau Gr
 */
public class Operario extends Empleado {
    private int horasExtras;

    public Operario() {
        super();
        
    }

    public Operario(int horasExtras, String nombreEmpleado, double sueldoBase) {
        super(nombreEmpleado, sueldoBase);
        this.horasExtras = horasExtras;
    }

    @Override
    public String toString() {
        String cadena;
        cadena = super.toString()+"Operario{" + "horasExtras=" + horasExtras + '}';
        return cadena;
    }
    
    public double calculaSalario(double prestac, double deduc, double precioHE){
        double salario;
        salario = super.calculaSalario(prestac, deduc) + (precioHE*horasExtras);
        return salario;
    }
    
    
    
    
    
}
