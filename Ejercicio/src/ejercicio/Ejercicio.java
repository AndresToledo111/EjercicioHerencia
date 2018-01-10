/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import Entidad.Administrativo;
import Entidad.Docente;
import Entidad.Ejecutivo;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.print.Doc;

/**
 *
 * @author patri
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
//        Persona p=new Persona(25, "189916027", "Manuel", "Jofre");
////                
//        System.out.println("Persona: \n"+p);
//        

//        Crear una persona admin
        Administrativo ad=new Administrativo("Recursos Humanos", 45, "189916027", "Pepe", "Sicario");
        System.out.println(ad );//+ "\n \n Area de trabajo: "+ad.getAreaDeTrabajo());
//        System.out.println("Su sueldo descontando salud y locomocion es de : " +" $"+ad.calcularSueldo());
        
//        
//        Agregando datos a una lista
//        List<Administrativo> adms =new ArrayList<Administrativo>();
//        
//        Administrativo ad=new Administrativo("Informatica", 23, "189916027", "Patricio", "Toledo");
//        Administrativo ad1=new Administrativo("Diseño", 23, "163723948", "Alejandra", "Contreras");
//        Administrativo ad2=new Administrativo("Base de datos", 18, "195675889", "Matias", "Serpiente");
//        adms.add(ad);
//        adms.add(ad1);
//        adms.add(ad2);
//        
//        //Eliminar datos de la lista
//        //adms.remove(ad);
//        
//        
//        System.out.println("Datos de la lista "+adms);
//        
//        System.out.println("\n Tamaño de lista: "+adms.size());
        
//        //Ejecutivo
//        Ejecutivo ej = new Ejecutivo(1, "Informatica", 21, "191872147", "Andres", "Toledo");
//        System.out.println("\n Datos Ejecutivo : \n Id: " + ej.getIdEjecutivo()
//                + " \n Area de trabajo:" + ej.getAreaDeTrabajo() + "\n " + ej);

        
        //Docente
        
//        Docente dc=new Docente(0, "Limpieza", 38, "182514535", "Pablito", "Pablon");
//        Docente dc=new Docente(5, "Limpieza", 38, "182514535", "Pablito", "Pablon");
//        System.out.println("\n Docente: "+ dc+ "\nHoras trabajadas: "+dc.getHorasTrabajadas());
    }

}
