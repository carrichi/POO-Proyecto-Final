/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Personas.Empleados;

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
public class Empleado extends Persona implements Serializable, Visitable{
    /********************************************
    *           ATRIBUTOS DE INSTANCIA          *
    *********************************************/
    /**
     * 
     */
    private Date fechaIngreso;
    
    /**
     * 
     */
    private String institucionProcedencia;
    
    /**
     * 
     */
    private int numeroEmpleado;

    /************************************
    *           CONSTRUCTORES           *
    *************************************/

    /**
     * 
     */
    public Empleado () {

    }

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
    public Empleado(String nombre, String apellidoP, String apellidoM, String email, String password, Date fechaIngreso, 
                    String institucionProcedencia, int numeroEmpleado) {
        super(nombre, apellidoP, apellidoM, email, password);
        this.fechaIngreso = fechaIngreso;
        this.institucionProcedencia = institucionProcedencia;
        this.numeroEmpleado = numeroEmpleado;
    }


    /******************************************
    *          METODOS DE INSTANCIA           *
    *          (Getters y Setters)            *
    *******************************************/

    /**
     * 
     * @return
     */
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * 
     * @param fechaIngreso
     */
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }    

    /**
     * 
     * @return
     */
    public long getNumeroEmpleado() {
        return numeroEmpleado;
    }

    /**
     * 
     * @param numeroEmpleado
     */
    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    /**
     * 
     */
    public String getInstitucionProcedencia() {
        return institucionProcedencia;
    }

    /**
     * 
     * @param institucionProcedencia
     */
    public void setInstitucionProcedencia(String institucionProcedencia) {
        this.institucionProcedencia = institucionProcedencia;
    }
    
    ublic void aceptar(Visitor visitor){
		visitor.visit(this);
	}
}
