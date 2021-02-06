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
 * Clase que hereda de Empleado y proporciona metodos y atributos necesarios para un Autor
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
     * Regresa la cantidad de articulos escritos
     * @return articulosEscritos Cantidad de articulos escritos
     */
    public int getArticulosEscritos() {
        return articulosEscritos;
    }

    /**
     * Guarda la cantidad de articulos escritos
     * @param articulosEscritos antidad de articulos escritos
     */
    public void setArticulosEscritos(int articulosEscritos) {
        this.articulosEscritos = articulosEscritos;
    }
    
    /**Implementa el patron de diseño Visitor 
     * @param visitor Visitor especifico
     */
    public void aceptar(Visitor visitor){
		visitor.visit(this);
	}

    /**Tipo de usuario
     * @return "Autor" Tipo de usuario
     */
    @Override
    public String clase() {
        return "Autor";
    }
}
