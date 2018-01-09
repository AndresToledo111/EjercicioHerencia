/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import Entidad.Administrativo;
import Entidad.Persona;

/**
 *
 * @author patri
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Persona p=new Persona(25, "189916027", "Manuel", "Jofre");
                
        //System.out.println(p);
        
        Administrativo ad=new Administrativo("Recursos Humanos", 45, "189916027", "Pepe", "Sicario");
        System.out.println(ad + "\n \n Area de trabajo: "+ad.getAreaDeTrabajo());
        System.out.println("Su sueldo descontando salud y locomocion es de : " +" $"+ad.calcularSueldo());
    }
    
}
