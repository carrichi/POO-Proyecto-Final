/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Revistas;

/**************************************
*          CLASES DE APOYO            *
***************************************/
import java.util.ArrayList;
import java.io.Serializable;

/**
 * En esta clase se define el contenido que tendra cada una de las revistas. EL
 * contenido esta dividido por categorias y cada una de estas contiene los
 * articulos correspondientes, forzosamente por cada categotogia se requieren al
 * menos dos articulos.
 */
public class Contenido implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    private ArrayList<Categoria> categorias;

    /**
     * Constructor inicial que inicializa la creacion de las categorias con el fin
     * de que esten listas para agregar articulos.
     */
    public Contenido() {

    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }
}
    /********************************************
    *           ATRIBUTOS DE INSTANCIA          *
    *********************************************/

    /************************************
    *           CONSTRUCTORES           *
    *************************************/

    /******************************************
    *          METODOS DE INSTANCIA           *
    *          (Getters y Setters)            *
    *******************************************/