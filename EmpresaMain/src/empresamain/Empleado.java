/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresamain;

import java.util.Objects;

/**
 *
 * @author Ana Lau Gr
 */
public class Empleado {
    private static int series = 101;
    private int claveEmpleado;
    private String nombreEmpleado;
    private double sueldoBase;

    public Empleado() {   
    }

    public Empleado(String nombreEmpleado, double sueldoBase) {
        claveEmpleado = series;
        series+=1;
        this.nombreEmpleado = nombreEmpleado;
        this.sueldoBase = sueldoBase;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }
    
    public int getClave(){
        return claveEmpleado;
    }

    public void setClaveEmpleado(int claveEmpleado) {
        this.claveEmpleado = claveEmpleado;
    }
    

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    

    @Override
    public String toString() {
        return "Empleado{" + "series=" + series + ", claveEmpleado=" + claveEmpleado + ", nombreEmpleado=" + nombreEmpleado + ", sueldoBase=" + sueldoBase + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (this.series != other.series) {
            return false;
        }
        if (this.claveEmpleado != other.claveEmpleado) {
            return false;
        }
        if (Double.doubleToLongBits(this.sueldoBase) != Double.doubleToLongBits(other.sueldoBase)) {
            return false;
        }
        if (!Objects.equals(this.nombreEmpleado, other.nombreEmpleado)) {
            return false;
        }
        return true;
    }
    
    public double calculaSalario(double prestac, double deduc){
        double salario;
        salario = sueldoBase + sueldoBase*( prestac - deduc); 
        return salario;
    }
    
    
    
    
}
