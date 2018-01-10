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
public class Docente extends Administrativo {

    int horasTrabajadas;

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) throws Exception {
        if (horasTrabajadas > 1) {

            this.horasTrabajadas = horasTrabajadas;
        }
        else  {
            throw new Exception("Horas de trabajo mayor a 0 ");
        }
    }

    public Docente(int horasTrabajadas, String areaDeTrabajo, int edad, String rut, String nombre, String apellido) throws Exception {
        super(areaDeTrabajo, edad, rut, nombre, apellido);
        setAreaDeTrabajo(areaDeTrabajo);
        setHorasTrabajadas(horasTrabajadas);
    }

}
