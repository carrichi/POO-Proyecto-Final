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
 * Clase que hereda de Empleado y proporciona metodos y atributos necesarios para un Editor
 */
public class Revisor extends Empleado{
    /********************************************
    *          ATRIBUTOS DE INSTANCIA           *
    *********************************************/

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Años de experiencia
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
    public Revisor(Persona persona, String fechaIngreso, String institucionProcedencia, int numeroEmpleado) {
        super(persona, fechaIngreso, institucionProcedencia, numeroEmpleado);
        this.tipo = "Revisor";
    }


    /******************************************
    *          METODOS DE INSTANCIA           *
    *          (Getters y Setters)            *
    *******************************************/    

    /**
     * Regresa cantidad de articulos revisados
     * @return articulosRevisados
     */
    public int getArticulosRevisados() {
        return articulosRevisados;
    }

    /**
     * Guarda la cantidad de articulos revisados
     * @param articulosRevisados
     */
    public void setArticulosRevisados(int articulosRevisados) {
        this.articulosRevisados = articulosRevisados;
    }

    /**
     * Regresa los años de experiencia
     * @return aniosExperiencia
     */
    public String getAniosExperencia() {
        return aniosExperencia;
    }

    /**
     * Guarda los años de experiencia
     * @param aniosExperencia
     */
    public void setAniosExperencia(String aniosExperencia) {
        this.aniosExperencia = aniosExperencia;
    }
    
    /**Implementa el patron de diseño Visitor 
     * @param visitor Visitor especifico
     */
    @Override
    public void aceptar(Visitor visitor){
		visitor.visit(this);
	}

    /**Tipo de usuario
     * @return "Revisor" Tipo de usuario
     */
    @Override
    public String clase() {
        return "Revisor";
    }
}
