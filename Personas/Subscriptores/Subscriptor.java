/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Personas.Subscriptores;

/**************************************
*          CLASES DE APOYO            *
***************************************/
// import java.text.SimpleDateFormat;
// import java.text.ParseException;
import java.util.Date;
import Personas.Persona;
import java.io.Serializable;
import PatronVisitor.*;

/**
 * 
 */
public class Subscriptor extends Persona implements Visitable,Serializable{
    /********************************************
    *           ATRIBUTOS DE INSTANCIA          *
    *********************************************/
    
    /**
     * 
     */
    private Date suscripcion;

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
     * @param suscripcion
     */
    public Subscriptor(String nombre, String apellidoP, String apellidoM, String email, String password, Date suscripcion) {
        super(nombre, apellidoP, apellidoM, email, password);
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
