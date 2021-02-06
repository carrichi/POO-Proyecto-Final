/**************************************
*          CLASES DE APOYO            *
***************************************/
import java.util.ArrayList;
import java.io.EOFException;
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

            
            // Archivos que hacen el trabajo de una base de datos para las REVISTAS.
            File revistasBD = new File("database/revistas.txt");
            if (revistasBD.exists()) {
                // Se prepara el flujo de datos.
                FileInputStream fis = new FileInputStream(revistasBD);
                ObjectInputStream ois = new ObjectInputStream(fis);
                if (revistasBD.length()!=0){
                    this.revistas = (ArrayList<Revista>) ois.readObject();
                }
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
                FileInputStream fis = new FileInputStream(categoriasBD);
                ObjectInputStream ois = new ObjectInputStream(fis);
                if (categoriasBD.length()!=0) {
                    this.categorias = (ArrayList<Categoria>) ois.readObject();
                }
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
                FileInputStream fis = new FileInputStream(articulosBD);
                ObjectInputStream ois = new ObjectInputStream(fis);
                if (articulosBD.length()!=0) {
                    this.articulos = (ArrayList<Articulo>) ois.readObject();
                }
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
                FileInputStream fis = new FileInputStream(empleadosBD);
                ObjectInputStream ois = new ObjectInputStream(fis);
                // Se verifica si el archivo que contiene la base de datos está vacío.                
                if (empleadosBD.length()!=0) {
                    this.empleados = (ArrayList<Empleado>) ois.readObject();
                }
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
                FileInputStream fis = new FileInputStream(suscriptoresBD);
                ObjectInputStream ois = new ObjectInputStream(fis);
                if (suscriptoresBD.length()!=0) {
                    this.suscriptores = (ArrayList<Suscriptor>) ois.readObject();
                }
                ois.close();
            } else {
                /*
                    No se encontró el archivo que contiene la base de datos.
                */
                System.out.println("Oh no! Ocurrió un problema: No se econtró la base de datos.");
                //Se espera que en alguna de estas verificaciones se genere alguna excepción propia.
            }
        } catch (EOFException eofe) {
            System.out.println("Alguno de los archivos de base de datos se encuentra vacio.");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Alguna de las clases no se encontro.");
        } catch (IOException e) {
            System.out.println("Algo paso con alguno de los archivos.");
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
        if (usuario != null) {
            // Se encontró el usuario, ahora debe verificarse la contraseña.
            if (usuario.getPassword().equals(password)) {
                return usuario;                
            }
        }
        return null;
    }

    /**
     * 
     * @param email
     * @return
     */
    public boolean verificarEmail(String email) {
        // System.out.println("### Estos son los correos de los empleados:");
        for (Empleado empleado  : this.empleados) {
            if (empleado.getEmail().equals(email)) {
                return false;
            }
            // System.out.println(empleado.getEmail());
        }
        // System.out.println("### Estos son los correos de los suscriptores:");
        for (Suscriptor suscriptor : this.suscriptores) {
            if (suscriptor.getEmail().equals(email)) {
                return false;
            }
            // System.out.println(suscriptor.getEmail());
        }
        // Si se llega hasta este return significa que es un email único.
        return true;
    }

    
    public Persona buscarUsuario(String email) {
        /*
            Comienza el proceso de búsqueda en los archivos de empleados.txt y suscriptores.txt
        */
        for (Empleado empleado : this.empleados) {
            if (empleado.getEmail().equals(email)) {
                return empleado;
            }
        }
        for (Suscriptor suscriptor : this.suscriptores) {
            if (suscriptor.getEmail().equals(email)) {
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
