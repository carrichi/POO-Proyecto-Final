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
import Personas.Persona;

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
     * @param persona
     * @param fechaIngreso
     * @param institucionProcedencia
     * @param numeroEmpleado
     */
    public Revisor(Persona persona, Date fechaIngreso,
            String institucionProcedencia, int numeroEmpleado) {
        super(persona, fechaIngreso, institucionProcedencia, numeroEmpleado);
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
