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
public class Administrativo extends Empleado {
    private String departamento;
    private String telefono;

    public Administrativo() {
        super();
    }

    public Administrativo(String departamento, String telefono, String nombreEmpleado, double sueldoBase) {
        super(nombreEmpleado, sueldoBase);
        this.departamento = departamento;
        this.telefono = telefono;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    

    @Override
    public String toString() {
        String datos;
        datos = super.toString()+"Administrativo{" + "departamento=" + departamento + ", telefono=" + telefono + '}';
        return datos;
    }
    
    
    
    
    
    
    
    
}
