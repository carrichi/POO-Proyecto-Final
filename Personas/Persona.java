/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Personas;

/**************************************
*          CLASES DE APOYO            *
***************************************/
import java.io.Serializable;

/**Esta clase se utiliza como ancestro para todos los usuarios del programa
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
     * Nombre o nombres de (this) Persona
     */
    private String nombre;

    /**
     * Apellido paterno de (this) Persona
     */
    private String apellidoP;

    /**
     * Apellido materno de (this) Persona
     */
    private String apellidoM;
    /**
     * Correo electronico de (this) Persona
     */
    private String email;

    /**
     * Contraseña de la cuenta de (this) Persona
     */
    private String password;

    /**
     * Tipo de usuario
     */
    public String tipo;

    /***********************************
    *          CONSTRUCTORES           *
    ************************************/

    /** Constructor vacio, que registra al usuario con el tipo por defecto "Invitado"
     * 
     */
    public Persona() {
        this.tipo = "Invitado";
    }

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
        this.tipo = "Invitado";
    }

    /**
     * 
     * @param email
     * @param password
     */
    public Persona(String email, String password) {
        this.email = email;
        this.password = password;
        this.tipo = "Invitado";
    }

    /**
     * 
     * @param nombre
     * @param apellidoP
     * @param apellidoM
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
     * @return nombre
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
     * @return apellidoM
     */
    public String getApellidoM() {
        return apellidoM;
    }

    /**
     * 
     * @param apellidoM
     */
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    /**
     * 
     * @return apellidoP
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
     * @return email
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
     * @return password
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

    /**
     * @return "Invitado"
     */
    public String clase() {
        return "Invitado";
    }
}
