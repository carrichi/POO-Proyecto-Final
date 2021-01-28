/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Revistas;

/**************************************
*          CLASES DE APOYO            *
***************************************/
import Personas.Empleados.Autor;
import Personas.Empleados.Revisor;
import java.util.ArrayList;

/**
 * 
 */
public class Articulo {
    /********************************************
    *           ATRIBUTOS DE INSTANCIA          *
    *********************************************/
    
    /**
     * 
     */
    private String titulo;

    /**
     * 
     */
    private String sinopsis;

    /**
     * 
     */
    private String categoria;

    /**
     * 
     */
    private String folio;

    /**
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

    /**
     * 
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * 
     * @return
     */
    public ArrayList<Integer> getCalificaciones() {
        return calificaciones;
    }

    /**
     * 
     * @param calificaciones
     */
    public void setCalificaciones(ArrayList<Integer> calificaciones) {
        this.calificaciones = calificaciones;
    }

    /**
     * 
     * @return
     */
    public ArrayList<Revisor> getRevisores() {
        return revisores;
    }

    /**
     * 
     * @param revisores
     */
    public void setRevisores(ArrayList<Revisor> revisores) {
        this.revisores = revisores;
    }

    /**
     * 
     * @return
     */
    public boolean isPublicado() {
        return publicado;
    }

    /**
     * 
     * @param publicado
     */
    public void setPublicado(boolean publicado) {
        this.publicado = publicado;
    }

    /**
     * 
     * @return
     */
    public String getEstadoRevision() {
        return estadoRevision;
    }

    /**
     * 
     * @param estadoRevision
     */
    public void setEstadoRevision(String estadoRevision) {
        this.estadoRevision = estadoRevision;
    }

    /**
     * 
     * @return
     */
    public Autor[] getAutores() {
        return autores;
    }

    /**
     * 
     * @param autores
     */
    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }

    /**
     * 
     */
    public String getFolio() {
        return folio;
    }

    /**
     * 
     */
    public void setFolio(String folio) {
        this.folio = folio;
    }

    /**
     * 
     * @return
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * 
     * @param categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * 
     * @return
     */
    public String getSinopsis() {
        return sinopsis;
    }

    /**
     * 
     * @param sinopsis
     */
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    /**
     * 
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}