/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Personas.Empleados;



/**************************************
*          CLASES DE APOYO            *
***************************************/
import java.io.Serializable;
import java.util.Date;
import PatronVisitor.*;

/**
 * 
 */
public class Revisor extends Empleado implements Serializable,Visitable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /********************************************
     * ATRIBUTOS DE INSTANCIA *
     *********************************************/
    /**
     * 
     */
    private String aniosExperencia;

    /**
     * Hace referencia a la cantidad de articulos que ha revisado el empleado "revisor".
     */
    private int articulosRevisados;


    /***********************************
    *          CONSTRUCTORES           *
    ************************************/

    /**
     * 
     */
    public Revisor () {

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
    public Revisor(String nombre, String apellidoP, String apellidoM, String email, String password, Date fechaIngreso,
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
    
    public void aceptar(Visitor visitor){
		visitor.visit(this);
	}
}
