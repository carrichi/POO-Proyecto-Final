/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Revistas;

/**************************************
*          CLASES DE APOYO            *
***************************************/
import java.util.ArrayList;

/**
 * En esta clase se define el contenido que tendrá cada una de las revistas. EL
 * contenido está dividido por categorías y cada una de estas contiene los
 * artículos correspondientes, forzosamente por cada categotogía se requieren al
 * menos dos artículos.
 */
public class Contenido {

    private ArrayList<Categoria> categorias;

    /**
     * Constructor inicial que inicializa la creación de las categorías con el fin
     * de que estén listas para añadir artículos.
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
    *          MÉTODOS DE INSTANCIA           *
    *          (Getters y Setters)            *
    *******************************************/