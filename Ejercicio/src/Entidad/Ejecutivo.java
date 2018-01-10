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
public class Ejecutivo extends Administrativo {

    //Clase ejecutivo hereda de Administrativo
    int idEjecutivo;

    public int getIdEjecutivo() {
        return idEjecutivo;
    }

    public void setIdEjecutivo(int idEjecutivo) throws Exception {
        if (idEjecutivo >= 1) {

            this.idEjecutivo = idEjecutivo;
        }else{
            throw new Exception("Id deber ser mayor a cero(0)");
        }
    }

    public Ejecutivo(int idEjecutivo, String areaDeTrabajo, int edad, String rut, String nombre, String apellido) throws Exception {
        super(areaDeTrabajo, edad, rut, nombre, apellido);
        setIdEjecutivo(idEjecutivo);
    }

////    @Override
////    public String toString() {
////        return "Ejecutivo{" + "idEjecutivo=" + idEjecutivo + '}';
////    }
}
