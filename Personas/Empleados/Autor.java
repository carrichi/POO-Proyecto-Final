/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Personas.Empleados;

/**************************************
*          CLASES DE APOYO            *
***************************************/
import PatronVisitor.*;
import Personas.Persona;

/**
 * 
 */
public class Autor extends Empleado{
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
    public Autor(Persona persona, String fechaIngreso, String institucionProcedencia, int numeroEmpleado) {
        super(persona, fechaIngreso, institucionProcedencia, numeroEmpleado);
        this.tipo = "Autor";
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

    /**
     * 
     */
    @Override
    public String clase() {
        return "Autor";
    }
}
