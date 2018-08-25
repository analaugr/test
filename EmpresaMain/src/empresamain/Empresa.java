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
public class Empresa {
    private String nombre;
    private String direccion;
    private String ceo;
    private Administrativo [] admin;
    private Operario [] oper;
    private final int MAX = 20;
    private int totalAd;
    private int totalOp;

    public Empresa() {
        totalAd = 0;
        totalOp = 0;
        admin = new Administrativo [MAX];
        oper = new Operario [MAX];
    }

    public Empresa(String nombre, String direccion, String ceo) {
        this();
        this.nombre = nombre;
        this.direccion = direccion;
        this.ceo = ceo;
    }
    public void altaOperarios(int horasExtras, String nombreEmpleado, double sueldoBase){
        if(totalOp<MAX)
        {
            Operario oper2 = new Operario(horasExtras, nombreEmpleado, sueldoBase);
            oper[totalOp] = oper2;
            totalOp ++;
            
            
        }
        else
            System.out.println("ya no hay espacio para operarios");
    }
    public void altaAdmin(String departamento, String telefono, String nombreEmpleado, double sueldoBase){
        if(totalAd<MAX)
        {
            admin[totalAd] = new Administrativo(departamento, telefono, nombreEmpleado, sueldoBase);
            totalAd++;
        }
        else
            System.out.println("No hay espacio para adgregar mas admins");
    }
    
    public String reporteAdmin(){
        int i;
        System.out.println("\t Reporte de empleados administrativos");
        for(i=0; i<totalAd; i++)
        {
            System.out.println("El empleado administrativo "+(i+1)+" es: "+admin[i].getNombreEmpleado()+" y su sueldo base es: "+admin[i].getSueldoBase());
            
        }
        return "Fin de la lista";
    }
    public int busquedaEmpleado(int clave, Administrativo [] ad){
        int i;
        int numEmp = 0;
        for(i=0; i<totalAd; i++)
        {
            if(ad[i].getClave()== clave)
            {
                numEmp = i;
            } 
        }
    return numEmp;
    }
    
    public int busquedaEmpleado(int clave, Operario [] op){
        int i;
        int numEmp = 0;
        for(i=0; i<totalAd; i++)
        {
            if(op[i].getClave() == clave)
            {
                numEmp = i;
            } 
        }
    return numEmp;
    }
    public void actualizarSueldo(int clave, double aumento){
        int n;
        n = busquedaEmpleado(clave, admin);
        System.out.println("El sueldo anterior era: "+admin[n].getSueldoBase());
        admin[n].setSueldoBase(admin[n].getSueldoBase()*(aumento+1));
        System.out.println("El sueldo actual es: "+admin[n].getSueldoBase());
    }
    
    public void cambioDepto(int clave, String depto){
        int n;
        n = busquedaEmpleado(clave, admin);
        admin[n].setDepartamento(depto);  
    }
    public double cobroOperario(int clave, double prestac, double deduc, double precioHE){
        int n;
        double cobro;
        n = busquedaEmpleado(clave, oper);
        cobro = oper[n].calculaSalario(prestac, deduc, precioHE);
        return cobro;
    }
    public void reporteOperarios(double cantSuperior){
        int i;
        System.out.println("\tOperarios con sueldo base menor a: "+cantSuperior);
        for(i=0; i<totalOp; i++)
        {
            if(oper[i].getSueldoBase() < cantSuperior )
            {
                System.out.println(oper[i].getNombreEmpleado());
            }
        }
    }
    public void prueba(int n, int m){
        System.out.println(admin[n].getClave());
        System.out.println(admin[m].getClave());
        
    }
}



