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
    
//  

    public void setAreaDeTrabajo(String areaDeTrabajo) throws Exception {
        if (areaDeTrabajo.trim() != "") {

            this.areaDeTrabajo = areaDeTrabajo;
        } else {
            throw new Exception("No puede dejar el campo vacio");
        }
    }

   
    
    

}
