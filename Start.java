/**************************************
*          CLASES DE APOYO            *
***************************************/
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import Revistas.Revista;
import Personas.Persona;
import java.sql.Date;
import Personas.Empleados.*;
import Personas.*;
//import java.io.PrintWriter;
//import java.io.StringWriter;
import PatronVisitor.*;

/**
 * Esta es la clase que realizara la ejecucion de todo el sistema de
 * administracion.
 */
public class Start {

    /**
     * Hace referencia al usuario que haya ejecutado el programa y ya que es una clase padre
     * puede optar por ser un empleado, un suscriptor, un invidado o hasta el director de la
     * empresa. 
     */
    Persona usuario;

    /**
     * Metodo que realiza el comienzo de todo el programa.
     * 
     * @param args Indica los argumentos que puede recibir desde la consola de
     *             comandos.
     * @throws ClassNotFoundException Esta siendo utilizada para hacer pruebas de conección a los archivos que funcionarán
     *                                como "base de datos".
     * @throws IOException Esta siendo utilizada para hacer pruebas de conección a los archivos que funcionarán como
     *                     "base de datos".
     * @throws InterruptedException Se toma como tratada a la posible excepcion que se genere al realizar los "tiempos
     *                              de carga".
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        /*
            1. Menú inicial que tendrá las siguientes opciones:
                - Iniciar sesión
                - Registrarse como suscriptor
                - Continuar como invitado
                - Salir
                - ¿Ver créditos de desarrolladores? JAJAJAJA
        */
        // int opcion = Menu.bienvenida(); // <- Este posible método mostrará las opciones y retornará su opción tomada.

        /*
            2. Dependiendo de su decición se definirá la siguiente acción del usuario.
        */

        boolean exit = false;

        switch (opcion) {
            case 1:
                /*
                    Inicia el proceso de autenticación del usuario.
                */
                // Login()
                break;
            case 2:
                /*
                    Comienza el proceso de registro de un suscriptor.
                */
                // Register()
                break;
            case 3:
                /*
                    El usuario decició continuar como invitado.
                */
                // Se muestra el "menú" con solo las opciones a las que puede tener acceso. 
                break;
            case 4:
                /*
                    La opción elegida fue SALIR.
                */
                System.out.println("Has decidido salir.");
                // Thread.sleep(1800);
                System.out.println("Guardando cambios...");
                // Thread.sleep(2000);
                System.out.println("Terminando sesion activa...");
                // Thread.sleep(2000);
                System.out.println("Desconectando base de datos...");
                // Thread.sleep(4000);
                System.out.println("Listo! Gracias por utilizar el sistema de administracion.");
                // Thread.sleep(3000);
                System.out.println("\n\n");
                exit = true;
                break;
            default:
                /*
                    En teoría el usuario no alcanza a obtener una opción diferente, ya que el proceso
                    de verificación lo hace el menú mostrado, por lo que si algo falla puede aplicarse 
                    recursividad para mantener un control en la ejecución.
                */
                break;
        }

        /*
            Despues de que se haya registrado, es necesario mostrarle un menu me opciones segun el usuario que haya
            iniciado sesion.

            Este sera un ciclo que no terminara hasta que el usuario actual decida cerrar su sesión.
        */

        while ( ! exit ) {
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
            } else {
                System.out.println("Upsi");
            }

            exit = true;
        }
         /*  PRUEBA DE VISITOR
        
        Editor editor=new Editor("juan","perez","gomez","abc@gmail.com","contraseña", new Date(System.currentTimeMillis()),"no se",2);
		editor.setNumeroCedula(123);
		editor.setMaestriaDoctorado("doc");
		editor.setArticulosRevisados(5);
		
		ArchivoVisitor ArVisitor=new ArchivoVisitor();
		editor.aceptar(ArVisitor);
		
		ObjectInputStream fileIn;
        Editor editor1;
        try{
            fileIn = new ObjectInputStream(new FileInputStream("Editores.txt"));
            editor1 = (Editor) fileIn.readObject();
            editor1.mostrar();
            fileIn.close();
        }
        catch (IOException e){
			System.out.println("IOException " + e.getMessage());
            //StringWriter sw = new StringWriter();
            //e.printStackTrace(new PrintWriter(sw));
            //String exceptionAsString = sw.toString();
            //System.out.println(exceptionAsString);
        }
        catch (ClassNotFoundException e) {
            System.out.println("ClassNotFound " + e.getMessage());
        }
        
        */
        
    }
}
