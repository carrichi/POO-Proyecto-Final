/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Personas.Empleados;

import java.util.Date;
import PatronVisitor.*;
import java.io.Serializable;

/**************************************
*          CLASES DE APOYO            *
***************************************/
// java.util.Scanner <- Ejemplo

/**
 * 
 */
public class Editor extends Empleado implements Visitable,Serializable {

    /********************************************
     * ATRIBUTOS DE INSTANCIA *
     *********************************************/

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
     * @param nombre
     * @param apellidoP
     * @param apellidoM
     * @param email
     * @param password
     * @param fechaIngreso
     * @param institucionProcedencia
     * @param numeroEmpleado
     */
    public Editor(String nombre, String apellidoP, String apellidoM, String email, String password, Date fechaIngreso,
            String institucionProcedencia, int numeroEmpleado) {
        super(nombre, apellidoP, apellidoM, email, password, fechaIngreso, institucionProcedencia, numeroEmpleado);

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
	
	/*public void mostrar(){
		System.out.println(this.getNombre());
		System.out.println(this.getApellidoM());
		System.out.println(this.getEmail());
		System.out.println(this.numeroCedula);
		System.out.println(this.maestriaDoctorado);
		System.out.println(this.getNumeroEmpleado());
	}*/
}
