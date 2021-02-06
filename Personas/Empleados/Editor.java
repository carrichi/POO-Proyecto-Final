/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Personas.Empleados;

/**************************************
*          CLASES DE APOYO            *
***************************************/
import PatronVisitor.*;
import Personas.Persona;

/** Clase que hereda de Empleado y proporciona metodos y atributos necesarios para un Editor
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
     * numero de cedula
     */
    private int numeroCedula;

    /**String maestria o doctorado
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

    /**Regresa el Numero de cedula
     * @return numCedula
     */
    public int getNumeroCedula() {
        return numeroCedula;
    }

    /** Guarda el Numero de cedula
     * @param numeroCedula
     */
    public void setNumeroCedula(int numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

     /**Regresa si el Editor tiene maestria o doctorado
     * 
     * @return maestriaDoctorado
     */
    public String getMaestriaDoctorado() {
        return maestriaDoctorado;
    }

    /**Guarda si el Editor tiene maestria o doctorado
     * 
     * @param maestriaDoctorado
     */
    public void setMaestriaDoctorado(String maestriaDoctorado) {
        this.maestriaDoctorado = maestriaDoctorado;
    }

    /**
     * Regresa la cantidad de articulos revisados
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
    
	/**Implementa el patron de diseño Visitor 
     * @param visitor Visitor especifico
     */
    public void aceptar(Visitor visitor){
		visitor.visit(this);
	}
	
   /**Tipo de usuario
     * @return "Editor" Tipo de usuario
     */
    @Override
    public String clase() {
        return "Editor";
    }
}
