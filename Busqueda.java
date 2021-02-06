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
import Personas.Persona;
import Personas.Empleados.*;
import Personas.Suscriptores.Suscriptor;
import Revistas.Revista;
import Revistas.Articulo;
import Revistas.Categoria;

/**
* 
*/
public class Busqueda {

    /**
     * 
     */
    public ArrayList<Empleado> empleados;

    /**
     * 
     */
    public ArrayList<Suscriptor> suscriptores;

    /**
     * 
     */
    public ArrayList<Revista> revistas;
    
    /**
     * 
     */
    public ArrayList<Articulo> articulos;

    /**
     * 
     */
    public ArrayList<Categoria> categorias;

    /**
     * 
     */
    public Busqueda () {
        try {
            /*
                Al momento de la construcción de una de estas instancias se deben de buscar los archivos en donde se estaran
                apoyando las busquedas.
            */

            FileInputStream fis = null;
            ObjectInputStream ois = null;

            // Archivos que hacen el trabajo de una base de datos para las REVISTAS.
            File revistasBD = new File("database/revistas.txt");
            if (revistasBD.exists()) {
                // Se prepara el flujo de datos.
                fis = new FileInputStream(revistasBD);
                ois = new ObjectInputStream(fis);
                
                this.revistas = (ArrayList<Revista>) ois.readObject();
                ois.close();
            } else {
                /*
                    No se encontró el archivo que contiene la base de datos.
                */
                System.out.println("Oh no! Ocurrió un problema: No se econtró la base de datos.");
                //Se espera que en alguna de estas verificaciones se genere alguna excepción propia.
            }
            File categoriasBD = new File("database/categorias.txt");
            if (categoriasBD.exists()) {
                // Se prepara el flujo de datos.
                fis = new FileInputStream(categoriasBD);
                ois = new ObjectInputStream(fis);
                
                this.categorias = (ArrayList<Categoria>) ois.readObject();
                ois.close();
            } else {
                /*
                    No se encontró el archivo que contiene la base de datos.
                */
                System.out.println("Oh no! Ocurrió un problema: No se econtró la base de datos.");
                //Se espera que en alguna de estas verificaciones se genere alguna excepción propia.
            }
            File articulosBD = new File("database/articulos.txt");
            if (articulosBD.exists()) {
                // Se prepara el flujo de datos.
                fis = new FileInputStream(articulosBD);
                ois = new ObjectInputStream(fis);
                
                this.articulos = (ArrayList<Articulo>) ois.readObject();
                ois.close();
            } else {
                /*
                    No se encontró el archivo que contiene la base de datos.
                */
                System.out.println("Oh no! Ocurrió un problema: No se econtró la base de datos.");
                //Se espera que en alguna de estas verificaciones se genere alguna excepción propia.
            }
            // Archivos que hacen el trabajo de una base de datos para los USUARIOS que utilizan el sistema.
            File empleadosBD = new File("database/empleados.txt");
            if (empleadosBD.exists()) {
                // Se prepara el flujo de datos.
                fis = new FileInputStream(empleadosBD);
                ois = new ObjectInputStream(fis);
                
                this.empleados = (ArrayList<Empleado>) ois.readObject();
                ois.close();
            } else {
                /*
                    No se encontró el archivo que contiene la base de datos.
                */
                System.out.println("Oh no! Ocurrió un problema: No se econtró la base de datos.");
                //Se espera que en alguna de estas verificaciones se genere alguna excepción propia.
            }
            File suscriptoresBD = new File("database/suscriptores.txt");
            if (suscriptoresBD.exists()) {
                // Se prepara el flujo de datos.
                fis = new FileInputStream(suscriptoresBD);
                ois = new ObjectInputStream(fis);

                this.suscriptores = (ArrayList<Suscriptor>) ois.readObject();
                ois.close();
            } else {
                /*
                    No se encontró el archivo que contiene la base de datos.
                */
                System.out.println("Oh no! Ocurrió un problema: No se econtró la base de datos.");
                //Se espera que en alguna de estas verificaciones se genere alguna excepción propia.
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
     * 
     * @param email
     * @param password
     * @return
     */
    public Persona verificarInicioSesion(String email, String password) {
        /*
            Aquí es donde se realiza la verificación de que el usuario existe.  
        */
        Persona usuario = buscarUsuario(email);
        return usuario;
    }
    
    public Persona buscarUsuario(String email) {
        /*
            Comienza el proceso de búsqueda en los archivos de empleados.txt y suscriptores.txt
        */
        for (Empleado empleado : this.empleados) {
            if (empleado.getEmail().equals(email)) {
                System.out.println("Usuario encontrado!");
                return empleado;
            }
        }
        for (Suscriptor suscriptor : this.suscriptores) {
            if (suscriptor.getEmail().equals(email)) {
                System.out.println("Usuario encontrado!");
                return suscriptor;
            }
        }
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
