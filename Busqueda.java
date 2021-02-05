
/**************************************
*          CLASES DE APOYO            *
***************************************/
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import Personas.Empleados.*;
import Personas.Suscriptores.Suscriptor;
import Revistas.Revista;
import Revistas.Articulo;

/**
* 
*/
public class Busqueda {
    
    public static Autor buscar(Autor autor) {
        return null;
    }
    
    public static Editor buscar(Editor editor) {
        return null;
    }
    
    public static Revisor buscar(Revisor revistor) {
        return null;
    }
    
    public static Suscriptor buscar(Suscriptor suscriptor) {
        return null;
    }
    
    public static Revista buscarRevista(int numeroRevista) {
        return null;
    }
    
    public static Articulo buscarArticulo(int folio) {
        return null;
    }
    
    public static ArrayList<Revista> buscarRevistas() throws FileNotFoundException, IOException, ClassNotFoundException {
        /*
            Esto es una prueba de funcionamiento para que funcione como una "base de datos".
        */
        File database = new File("database/database.txt");
        if (database.exists()) {
            ArrayList<Revista> revistas = new ArrayList<Revista>();
            revistas.add(new Revista("1"));
            revistas.add(new Revista("2"));
            revistas.add(new Revista("3"));
            revistas.add(new Revista("4"));
            
            FileInputStream fis = new FileInputStream(database);
            
            FileOutputStream fos = new FileOutputStream(database);
            
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(revistas);
            oos.close();
            
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            ArrayList<Revista> revistas2 = (ArrayList<Revista>) ois.readObject();
            for (Revista revista : revistas2) {
                System.out.println(revista.toString());
            }
            ois.close();
            return revistas2;
        } else {
            /*
                No se encontró el archivo que contiene la base de datos.
            */
            System.out.println("Oh no! Ocurrió un problema: No se econtró la base de datos.");
            return null;
        }
    }
    
    public static ArrayList<Articulo> buscarArticulos() {
        return null;
    }
    
}
