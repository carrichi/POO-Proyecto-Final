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
public class Editor extends Empleado{

    /********************************************
     * ATRIBUTOS DE INSTANCIA *
     *********************************************/

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private int numeroCedula;

    /**
     * 
     */
    private String maestriaDoctorado;
    
    /**
     * Hace referencia a la cantidad de articulos que ha revisado el empleado
     * "revisor".
     */
    private int articulosRevisados;


    /************************************
    *           CONSTRUCTORES           *
    *************************************/

    /**
     * 
     * @param persona
     * @param fechaIngreso
     * @param institucionProcedencia
     * @param numeroEmpleado
     */
    public Editor(Persona persona, String fechaIngreso, String institucionProcedencia, int numeroEmpleado) {
        super(persona, fechaIngreso, institucionProcedencia, numeroEmpleado);
        this.tipo = "Editor";
    }

    /********************************************
    *           METODOS DE INSTANCIA            *
    *            (Getters y Setters)            *
    *********************************************/

    /**
     * 
     */
    public int getNumeroCedula() {
        return numeroCedula;
    }

    /**
     * 
     */
    public void setNumeroCedula(int numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    /**
     * 
     * @return
     */
    public String getMaestriaDoctorado() {
        return maestriaDoctorado;
    }

    /**
     * 
     * @param maestriaDoctorado
     */
    public void setMaestriaDoctorado(String maestriaDoctorado) {
        this.maestriaDoctorado = maestriaDoctorado;
    }

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
    
    public void aceptar(Visitor visitor){
		visitor.visit(this);
	}
	
    /**
     * 
     */
    @Override
    public String clase() {
        return "Editor";
    }
}
