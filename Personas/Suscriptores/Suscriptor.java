/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Personas.Suscriptores;

/**************************************
*          CLASES DE APOYO            *
***************************************/
import Personas.Persona;
import PatronVisitor.*;

/**
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

    /**
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
     * 
     * @return
     */    
    public String getSuscripcion() {
        return suscripcion;
    }

    /**
     * 
     * @param suscripcion
     */
    public void setSuscripcion(String suscripcion) {
        this.suscripcion = suscripcion;
    }
    
    /**
     * 
     */
    public void aceptar(Visitor visitor){
		visitor.visit(this);
	}

    @Override
    public String toString() {
        return this.getClass().getName()+": "+this.getApellidoP()+" "+this.getApellidoM()+", "+this.getNombre()+".\n\tEmail: "+this.getEmail();
    }

}
