/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Personas.Empleados;

/**************************************
*          CLASES DE APOYO            *
***************************************/
// import java.text.SimpleDateFormat;
// import java.text.ParseException;
import Personas.Persona;
import PatronVisitor.*;

/**
 * Clase que hereda de Persona y proporciona metodos y atributos necesarios para un Empleado
 */
public class Empleado extends Persona implements Visitable {
    /********************************************
    *           ATRIBUTOS DE INSTANCIA          *
    *********************************************/

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Fecha de ingreso a la revista
     */
    private String fechaIngreso;
    
    /**
     * Institucion de procedencia
     */
    private String institucionProcedencia;
    
    /**Numero de empleado
     * 
     */
    private int numeroEmpleado;

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
    public Empleado(Persona persona, String fechaIngreso, String institucionProcedencia, int numeroEmpleado) {
        super(persona);
        this.fechaIngreso = fechaIngreso;
        this.institucionProcedencia = institucionProcedencia;
        this.numeroEmpleado = numeroEmpleado;
        this.tipo = "Director";
    }

    /******************************************
    *          METODOS DE INSTANCIA           *
    *          (Getters y Setters)            *
    *******************************************/

    /**Regresa la fecha de ingreso del Empleado
     * 
     * @return fechaIngreso
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }

   /**
     * Guarda la fecha de ingreso del Empleado
     * @param fechaIngreso
     */
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }    

   /**
     * Regresa el numero del Empleado
     * @return numeroEmpleado
     */
    public long getNumeroEmpleado() {
        return numeroEmpleado;
    }

    /**
     * Guarda el numero del Empleado
     * @param numeroEmpleado
     */
    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    /** Regresa la institucion de procedencia
     *  @return institucionProcedencia
     */
    public String getInstitucionProcedencia() {
        return institucionProcedencia;
    }

    /**Guarda la institucion de procedencia
     * 
     * @param institucionProcedencia
     */
    public void setInstitucionProcedencia(String institucionProcedencia) {
        this.institucionProcedencia = institucionProcedencia;
    }
    
    /**Metodo que implementa el patron de diseño Visitor 
     * @param visitor Visitor especifico
     */
    @Override
    public void aceptar(Visitor visitor){
		visitor.visit(this);
	}

       /**Tipo de usuario
     * @return "Editor" Tipo de usuario
     */
    @Override
    public String clase() {
        return "Director";
    }
}
