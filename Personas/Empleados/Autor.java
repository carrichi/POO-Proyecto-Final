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
public class Autor extends Empleado implements Serializable,Visitable {
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
     * @param persona
     * @param fechaIngreso
     * @param institucionProcedencia
     * @param numeroEmpleado
     */
    public Autor(Persona persona, Date fechaIngreso, 
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
    
    public void aceptar(Visitor visitor){
		visitor.visit(this);
	}
}
