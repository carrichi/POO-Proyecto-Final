/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Personas;

/**************************************
*          CLASES DE APOYO            *
***************************************/


/**
 * 
 */
public class Persona {
    /********************************************
    *          ATRIBUTOS DE INSTANCIA           *
    *********************************************/

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
    *          MÉTODOS DE INSTANCIA           *
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