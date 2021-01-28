/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Personas.Empleados;

/**************************************
*          CLASES DE APOYO            *
***************************************/
import java.io.Serializable;
import java.util.Date;

/**
 * 
 */
public class Autor extends Empleado implements Serializable {
    /********************************************
    *           ATRIBUTOS DE INSTANCIA          *
    *********************************************/

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Hace referencia a la cantidad de articulos que ha escrito el empleado
     * "autor".
     */
    private int articulosEscritos;


    /***********************************
    *          CONSTRUCTORES           *
    ************************************/

    /**
     * 
     */
    public Autor () {

    }

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
    *          METODOS DE INSTANCIA           *
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
