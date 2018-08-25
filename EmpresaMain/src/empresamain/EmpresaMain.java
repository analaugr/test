/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresamain;
import java.util.*;

/**
 *
 * @author Ana Lau Gr
 */
public class EmpresaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Problema 4 del cuadrenillo
        Scanner input = new Scanner(System.in);
        Empresa miEmp = new Empresa();
        
        String nombre, dep, tel;
        String nombreop;
        String otro = "si";
        int horasE;
        double sueldoBase, sueldoBase2;
        
        int opcion;
        System.out.println("Elige opcion; ");
        opcion = input.nextInt();
        
        switch(opcion)
        {
            case 1:
                while (otro.equalsIgnoreCase("si"))
                {
                    System.out.println("Ingrese el nombre: ");
                    nombre = input.next();
                    System.out.println("Ingrese el depto: ");
                    dep = input.next();
                    System.out.println("Ingrese el tel: ");
                    tel = input.next();
                    System.out.println("Ingrese el sueldo base: ");
                    sueldoBase = input.nextDouble();

                    miEmp.altaAdmin(dep, tel, nombre, sueldoBase);

                    System.out.println("Desea agregar otro empleado administrativo?");
                    otro = input.next();
                    
                }
                miEmp.actualizarSueldo(102, 0.4);
                miEmp.reporteAdmin();
                miEmp.cambioDepto(101, "conta");
                miEmp.prueba(0, 1);
                
                
                break;
            case 2:
                while (otro.equalsIgnoreCase("si"))
                {
                    System.out.println("Ingrese el nombre: ");
                    nombreop = input.next();
                    System.out.println("Ingrese las horas extra: ");
                    horasE = input.nextInt();
                    System.out.println("Ingrese el sueldo base: ");
                    sueldoBase2 = input.nextDouble();

                    miEmp.altaOperarios(horasE, nombreop, sueldoBase2);

                    System.out.println("Desea agregar otro empleado operario?");
                    otro = input.next();
                }
                miEmp.reporteOperarios(5000);
                System.out.println("El cobro de un op por 5 horas extras es: "+miEmp.cobroOperario(5, 6000, 400,500));
                break;
        }
    
        
        
     
         
      
    }
    
}
