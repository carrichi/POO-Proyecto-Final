/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Personas.Suscriptores;

/**************************************
*          CLASES DE APOYO            *
***************************************/
import Personas.Persona;
import PatronVisitor.*;

/**Clase que hereda de Persona y proporciona metodos y atributos necesarios para un Suscriptor
 * 
 */
public class Suscriptor extends Persona implements Visitable{
    /********************************************
    *           ATRIBUTOS DE INSTANCIA          *
    *********************************************/
    
    /**
     * Al parecer necesita de este abtibuto para que las instancias de este tipo puedan ser "comprimidas" en un txt.
     */
    private static final long serialVersionUID = 1L;

    /** Tipo de suscripcion
     * 
     */
    private String suscripcion;

    /************************************
    *           CONSTRUCTORES           *
    *************************************/

    /**
     * 
     * @param persona
     * @param suscripcion
     */
    public Suscriptor(Persona persona, String suscripcion) {
        super(persona);
        this.setSuscripcion(suscripcion);
        this.tipo = "Suscriptor";
    }

    
    /******************************************
    *          METODOS DE INSTANCIA           *
    *          (Getters y Setters)            *
    *******************************************/
    
    /**
     * Regresa el tipo de suscripcion
     * @return suscripcion
     */    
    public String getSuscripcion() {
        return suscripcion;
    }

    /**Guarda el tipo de suscripcion
     * 
     * @param suscripcion
     */
    public void setSuscripcion(String suscripcion) {
        this.suscripcion = suscripcion;
    }
    
    /**Implementa el patron de diseño Visitor 
     * @param visitor Visitor especifico
     */
    public void aceptar(Visitor visitor){
		visitor.visit(this);
	}
	
        /** Convierte en cadena los atributos del objeto Suscriptor
	*@return cadena
	*/
    @Override
    public String toString() {
        return this.getClass().getName()+": "+this.getApellidoP()+" "+this.getApellidoM()+", "+this.getNombre()+".\n\tEmail: "+this.getEmail();
    }

    /**Tipo de usuario
     * @return "Suscriptor" Tipo de usuario
     */
    @Override
    public String clase() {
        return "Suscriptor";
    }

}
