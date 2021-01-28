/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Revistas;

/**************************************
*          CLASES DE APOYO            *
***************************************/
import java.util.ArrayList;

/**
 * Esta clase representará una de las categorías que están contenidas dentro de
 * una revista.
 */
public class Categoria {

    private String nombre;
    private ArrayList<Articulo> articulos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    public int getNumArticulos() {
        return this.articulos.size();
    }
}
