/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Personas;

/**************************************
*          CLASES DE APOYO            *
***************************************/
import java.io.Serializable;

/**
 * 
 */
public class Persona implements Serializable {
    /********************************************
    *          ATRIBUTOS DE INSTANCIA           *
    *********************************************/

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String apellidoP;

    /**
     * 
     */
    private String apellidoM;
    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String password;


    /***********************************
    *          CONSTRUCTORES           *
    ************************************/

    /**
     * Constructor llamado al momento de registrar algún empleado o suscriptor.
     * @param persona
     */
    public Persona(Persona persona) {
        this.nombre = persona.getNombre();
        this.apellidoP = persona.getApellidoP();
        this.apellidoM = persona.getApellidoM();
        this.email = persona.getEmail();
        this.password = persona.getPassword();
    }

    /**
     * 
     * @param nombre
     * @param apellidoP
     * @param appellidoM
     * @param email
     * @param password
     */
    public Persona(String nombre, String apellidoP, String apellidoM, String email, String password) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.email = email;
        this.password = password;
    }


    /******************************************
    *          METODOS DE INSTANCIA           *
    *          (Getters y Setters)            *
    *******************************************/

    /**
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return
     */
    public String getApellidoM() {
        return apellidoM;
    }

    /**
     * 
     * @param appellidoM
     */
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    /**
     * 
     * @return
     */
    public String getApellidoP() {
        return apellidoP;
    }
    
    /**
     * 
     * @param apellidoP
     */
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    /**
     * 
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * 
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
