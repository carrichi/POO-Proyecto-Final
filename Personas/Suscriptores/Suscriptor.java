/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Personas.Suscriptores;

/**************************************
*          CLASES DE APOYO            *
***************************************/
// import java.text.SimpleDateFormat;
// import java.text.ParseException;
import java.util.Date;
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
    private Date suscripcion;

    /************************************
    *           CONSTRUCTORES           *
    *************************************/

    /**
     * 
     * @param persona
     * @param suscripcion
     */
    public Suscriptor(Persona persona, Date suscripcion) {
        super(persona);
        this.setSuscripcion(suscripcion);
    }

    
    /******************************************
    *          METODOS DE INSTANCIA           *
    *          (Getters y Setters)            *
    *******************************************/
    
    /**
     * 
     * @return
     */    
    public Date getSuscripcion() {
        return suscripcion;
    }

    /**
     * 
     * @param suscripcion
     */
    public void setSuscripcion(Date suscripcion) {
        this.suscripcion = suscripcion;
    }
    
    public void aceptar(Visitor visitor){
		visitor.visit(this);
	}
}
