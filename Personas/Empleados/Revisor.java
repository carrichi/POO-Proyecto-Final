/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Personas.Empleados;

import java.util.Date;

/**************************************
*          CLASES DE APOYO            *
***************************************/
// Aquí van escritas.

/**
 * 
 */
public class Revisor extends Empleado {
    /********************************************
     * ATRIBUTOS DE INSTANCIA *
     *********************************************/
    /**
     * 
     */
    private String aniosExperencia;

    /**
     * Hace referencia a la cantidad de artículos que ha revisado el empleado "revisor".
     */
    private int articulosRevisados;


    /***********************************
    *          CONSTRUCTORES           *
    ************************************/

    public Revisor(String nombre, String apellidoP, String apellidoM, String email, String password, Date fechaIngreso,
            String institucionProcedencia, int numeroEmpleado) {
        super(nombre, apellidoP, apellidoM, email, password, fechaIngreso, institucionProcedencia, numeroEmpleado);
    }


    /******************************************
    *          MÉTODOS DE INSTANCIA           *
    *          (Getters y Setters)            *
    *******************************************/    

    /**
     * 
     * @return
     */
    public int getArticulosRevisados() {
        return articulosRevisados;
    }

    /**
     * 
     * @param articulosRevisados
     */
    public void setArticulosRevisados(int articulosRevisados) {
        this.articulosRevisados = articulosRevisados;
    }

    /**
     * 
     * @return
     */
    public String getAniosExperencia() {
        return aniosExperencia;
    }

    /**
     * 
     * @param aniosExperencia
     */
    public void setAniosExperencia(String aniosExperencia) {
        this.aniosExperencia = aniosExperencia;
    }
}
