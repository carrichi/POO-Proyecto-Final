/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Personas.Empleados;

import java.util.Date;

/**************************************
*          CLASES DE APOYO            *
***************************************/
// java.util.Scanner <- Ejemplo

/**
 * 
 */
public class Autor extends Empleado {
    /********************************************
    *           ATRIBUTOS DE INSTANCIA          *
    *********************************************/

    /**
     * Hace referencia a la cantidad de artículos que ha escrito el empleado
     * "autor".
     */
    private int articulosEscritos;


    /***********************************
    *          CONSTRUCTORES           *
    ************************************/

    /**
     * 
     * @param nombre
     * @param apellidoP
     * @param apellidoM
     * @param email
     * @param password
     * @param fechaIngreso
     * @param institucionProcedencia
     * @param numeroEmpleado
     */
    public Autor(String nombre, String apellidoP, String apellidoM, String email, String password, Date fechaIngreso, 
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
    public int getArticulosEscritos() {
        return articulosEscritos;
    }

    /**
     * 
     * @param articulosEscritos
     */
    public void setArticulosEscritos(int articulosEscritos) {
        this.articulosEscritos = articulosEscritos;
    }
}
