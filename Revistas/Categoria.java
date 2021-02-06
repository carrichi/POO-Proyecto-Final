/*********************************************
*          PAQUETE CORRESPONDIENTE           *
**********************************************/
package Revistas;

/**************************************
*          CLASES DE APOYO            *
***************************************/
import java.util.ArrayList;
import java.io.Serializable;
import PatronVisitor.*;

/**
 * Esta clase representara una de las categorias que estan contenidas dentro de
 * una revista.
 */
public class Categoria implements Serializable,Visitable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
/**Nombre de la categoria
*/
    private String nombre;
	
	/**Articulos de esta categoria
	*/
    private ArrayList<Articulo> articulos;
	
	/**Regresa el nombre de la categoria
	* @return nombre
	*/
    public String getNombre() {
        return nombre;
    }
	
	/**Guarda el nombre de la categoria
	* @param nombre
	*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    	
	/** Regresa la lista de los articulos de esta categoria
	* @return articulos
	*/
    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }
	/** Guarda la lista de articulos de esta categoria
	* @param articulos
	*/
    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

	/** Return cantidad de articulos de la categoria
	* @return int
	*/
    public int getNumArticulos() {
        return this.articulos.size();
    }
    
	/**Implementa el patron de diseño Visitor 
     * @param visitor Visitor especifico
     */
    public void aceptar(Visitor visitor){
		visitor.visit(this);
	}
}
