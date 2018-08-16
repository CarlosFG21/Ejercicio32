/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio32video38;

/**
 *
 * @author DELL
 */
public class Ejercicio32Video38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        empleados trabajador1 = new empleados(" PACO ");
        
        empleados trabajador2 = new empleados(" ANA ");
        
        empleados trabajador3 = new empleados(" ANTONIO ");
        
        empleados trabajador4 = new empleados(" MARIA ");
        
        trabajador1.cambiaSeccion("RRHH");
        
        System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() + 
                
                "\n" + trabajador3.devuelveDatos() + "\n" + trabajador4.devuelveDatos());
        
       System.out.println(empleados.dameId());
    }
    
}
