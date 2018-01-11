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
public class Persona {

    int edad;
    String nombre, apellido, rut;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {

        if (edad >= 18 && edad <= 100) {

            this.edad = edad;
        } else {
            throw new Exception("Rango de edad: mayor o igual a 18 y menor a 100");
        }
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) throws Exception {
        if (rut.trim() != "") {

            if (rut.length() == 9) {
                this.rut = rut;

            } else {
                throw new Exception("El largo del rut debe ser de 9");
            }
        } else {
            throw new Exception("No puede dejar el campo vacio");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.trim() != "") {
            if (nombre.length() < 50) {
                this.nombre = nombre;
            } else {
                throw new Exception("Nombre no puede exceder los 50 caracteres");
            }
        } else {
            throw new Exception("Nombre no puede estar vacio");
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws Exception {
        if (apellido.trim() != "") {
            if (apellido.length() < 50) {
                this.apellido = apellido;
            } else {
                throw new Exception("Apellido no puede exceder los 50 caracteres");
            }
        } else {
            throw new Exception("Apellido no puede estar vacio");
        }
    }

    public Persona(int edad, String rut, String nombre, String apellido) throws Exception {
        setEdad(edad);
        setRut(rut);
        setNombre(nombre);
        setApellido(apellido);

    }
//      public int calcularSueldo()
//    {
//        int sueldo=10000;
//        int sa= 0;
//        int lo=0;
//        //salud
//        if (sueldo==10000) {
//            sa=sueldo*25/100;
//        }
//        //locomocion
//         if (sueldo==10000) {
//            lo=sueldo*7/100;
//        }
//       return sa+lo;
//    }

    @Override
    public String toString() {
        return "\n\n Datos Personales  {" + " \n Edad=" + edad + "\n Rut=" + rut + "\n Nombre completo= " + nombre + " " + apellido + '}';
    }
    
}
