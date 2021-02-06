/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Revistas;

/**************************************
*          CLASES DE APOYO            *
***************************************/
import Personas.Empleados.Autor;
import Personas.Empleados.Revisor;
import java.io.Serializable;
import java.util.ArrayList;
import PatronVisitor.*;

/**
 * Clase que representa un articulo de una revista
 */
public class Articulo implements Serializable,Visitable {
    /********************************************
    *           ATRIBUTOS DE INSTANCIA          *
    *********************************************/
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**Titulo del articulo
     * 
     */
    private String titulo;

    /**Sinopsis del articulo
     * 
     */
    private String sinopsis;

    /**Categoria del articulo
     * 
     */
    private String categoria;

    /** Folio del articulo
     * 
     */
    private String folio;

    /** Autor o autores del articulo
     * 
     */
    private Autor[] autores = new Autor[3];

    /**
     * Este atributo expresa si un articulo se encuentra "aceptado", "pendiente" o
     * "rechazado."
     */
    private String estadoRevision;

    /**
     * Este hara referencia si fue publicado o si no.
     */
    private boolean publicado;

    /**
     * Lista que indica los empleados que han revisado el articulo en cuestion. No
     * tiene un limite.
     */
    private ArrayList<Revisor> revisores;

    /**
     * Contiene las calificaciones que fueron dadas por los revisores, estas siempre
     * son en un rango de 0 a 10. Como no hay un limite de revisores, tampoco habra
     * de calificaciones.
     */
    private ArrayList<Integer> calificaciones;

    /************************************
    *           CONSTRUCTORES           *
    *************************************/

    public Articulo () {

    }


    /******************************************
    *          METODOS DE INSTANCIA           *
    *          (Getters y Setters)            *
    *******************************************/

    /**Regresa el tituo del articulo
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Regresa calificacion puesta por el Revisor
     * @return calificacion
     */
    public ArrayList<Integer> getCalificaciones() {
        return calificaciones;
    }

    /**
     * Guarda las calificaciones del articulo
     * @param calificaciones
     */
    public void setCalificaciones(ArrayList<Integer> calificaciones) {
        this.calificaciones = calificaciones;
    }

    /**
     * Regresa los Revisores de este articulo
     * @return revisores
     */
    public ArrayList<Revisor> getRevisores() {
        return revisores;
    }

    /**Guarda los Revisores de este Articulo
     * 
     * @param revisores
     */
    public void setRevisores(ArrayList<Revisor> revisores) {
        this.revisores = revisores;
    }

    /**
     * Regresa el estado del articulo
     * @return publicado true si ya se publico, false si no 
     */
    public boolean isPublicado() {
        return publicado;
    }

    /**Guarda el estado del articulo
     * 
     * @param publicado true si ya se publico, false si no
     */
    public void setPublicado(boolean publicado) {
        this.publicado = publicado;
    }

    /**Regresa el estado despues de la revision
     * 
     * @return estadoRevision
     */
    public String getEstadoRevision() {
        return estadoRevision;
    }

    /**
     * Guarda el estado despues de la revision
     * @param estadoRevision
     */
    public void setEstadoRevision(String estadoRevision) {
        this.estadoRevision = estadoRevision;
    }

    /**
     * Regresa los auteres del articulo
     * @return autores
     */
    public Autor[] getAutores() {
        return autores;
    }

    /**
     * Guarda los autores del articulo
     * @param autores
     */
    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }

    /**Regresa el folio del articulo
     * @return folio
     */
    public String getFolio() {
        return folio;
    }

    /**Guarda el folio del articulo
     * @param folio
     */
    public void setFolio(String folio) {
        this.folio = folio;
    }

    /**
     * Regresa la categoria del articulo
     * @return categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Guarda la categoria del articulo
     * @param categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Regresa la sinopsis del articulo
     * @return sinopsis
     */
    public String getSinopsis() {
        return sinopsis;
    }

    /**
     * Guarda la sinopsis del articulo
     * @param sinopsis
     */
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    /**
     * Guarda el titulo del articulo
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
	/**Implementa el patron de diseño Visitor 
     * @param visitor Visitor especifico
     */
    public void aceptar(Visitor visitor){
		visitor.visit(this);
	}
}
