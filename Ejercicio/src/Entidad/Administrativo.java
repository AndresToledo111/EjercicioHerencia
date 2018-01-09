/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author patri
 */
public class Administrativo extends Persona {

    String areaDeTrabajo;

    //metodo constructor herendando los atributos de la clase padre(persona)

    public Administrativo(String areaDeTrabajo, int edad, String rut, String nombre, String apellido) throws Exception {
        super(edad, rut, nombre, apellido);
        setAreaDeTrabajo(areaDeTrabajo);
    }
   

    public String getAreaDeTrabajo() {
        return areaDeTrabajo;
    }
    
    public int calcularSueldo()
    {
        int sueldo=10000;
        int sa= 0;
        int lo=0;
        //salud
        if (sueldo==10000) {
            sa=sueldo*25/100;
        }
        //locomocion
         if (sueldo==10000) {
            lo=sueldo*7/100;
        }
       return sa+lo;
    }

    public void setAreaDeTrabajo(String areaDeTrabajo) throws Exception {
        if (areaDeTrabajo.trim() != "") {

            this.areaDeTrabajo = areaDeTrabajo;
        } else {
            throw new Exception("No puede dejar el campo vacio");
        }
    }

   
    
    

}
