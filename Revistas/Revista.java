/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Revistas;

/**************************************
*          CLASES DE APOYO            *
***************************************/
import java.util.Date;
import java.io.Serializable;
import PatronVisitor.*;

/**
 * Clase que define los elementos de una revista. Una revista contiene articulos
 */
public class Revista implements Serializable,Visitable {
    /********************************************
    *           ATRIBUTOS DE INSTANCIA          *
    *********************************************/

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Titulo de la revista
     */
    private String titulo;

    /**
     * Fecha de publicacion de la revista
     */
    private Date fechaPublicacion;

    /**
     * Numero de esta revista
     */
    private int numeroRevista;

    /**
     * Estado de la revista 
     */
    private String estado;

    /**
     * true - publicada , false - no publicada
     */
    private boolean publicada;

    /**
     * Aqui se esquematiza el contenido de una revista, va a estar separada por las
     * categorias: 
     *      - "Inteligencia Artificial" 
     *      - "Analisis de Sistemas de Software" 
     *      - "Bases de Datos" 
     *      - "Hardware" 
     * Todas estas categorias y separaciones seran manejadas por una instancia llamada "Contenido".
     */
    private Contenido contenido;


    /************************************
    *           CONSTRUCTORES           *
    *************************************/

    /**
     * 
     */
    public Revista() {

    }
	
	/** Crea una revista con el titulo
	* @param titulo Titulo de la revista
	*/
    public Revista(String titulo) {
        this.titulo = titulo;
    }


    /******************************************
    *          METODOS DE INSTANCIA           *
    *          (Getters y Setters)            *
    *******************************************/

    /**Guarda el titulo de la revista
     * 
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    /**
     * Regresa el titulo de la revista
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Regresa la fecha de publicacion de la revista
     * @return fechaPublicacion
     */
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    /**
     * Guarda la fecha de publicacion de la revista
     * @param fechaPublicacion
     */
    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    /**
     * Regresa el numero de la revista
     * @return numeroRevista
     */
    public int getNumeroRevista() {
        return numeroRevista;
    }

    /**Guarda el numero de la revista
     * 
     * @param numeroRevista
     */
    public void setNumeroRevista(int numeroRevista) {
        this.numeroRevista = numeroRevista;
    }

    /**
     * Este metodo hara posible saber si una revista tiene un estado de "publicada" o "sin publicar" mediante
     * una cadena de caracteres.
     * @return estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Con este metodo se puede asignar un nuevo estado "publicada" o "sin publicar" como CADENA DE CARACTERES.
     * @param estado Cadena de caracteres que hara referencia al nuevo estado de la revista.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Regresa el estado de la revista
     * @return publicada true si esta publicada, false si no
     */
    public boolean estaPublicada() {
        return publicada;
    }

    /**
     * Mediante este metodo se puede asignar el estado de una revista.
     * True si se encuentra publicada.
     * False si no esta publicada.
     * @param publicada Valor booleano que expresara el nuevo estado de la revista.
     */
    public void setEstadoPublicada(boolean publicada) {
        this.publicada = publicada;
    }

    /**
     * Regresa el (objeto) contenido de la revista
     * @return contenido
     */
    public Contenido getContenido() {
        return contenido;
    }

    /**
     * Guarda el contenido de la revista
     * @param contenido
     */
    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }

	/** Regresa el titulo
	* @return String
	*/
    public String toString() {
        return this.titulo;
    }
    
	/**Implementa el patron de diseño Visitor 
     * @param visitor Visitor especifico
     */
    public void aceptar(Visitor visitor){
		visitor.visit(this);
	}
}
