/**************************************
*          CLASES DE APOYO            *
***************************************/
import Personas.Persona;
import PatronVisitor.*;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Revistas.Articulo;
import Revistas.Categoria;
import Revistas.Revista;
import Personas.Empleados.*;
import Personas.Suscriptores.Suscriptor;
import Personas.*;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Esta es la clase que realizara la ejecucion de todo el sistema de
 * administracion.
 */
public class Start {
    /**
     * Metodo que realiza el comienzo de todo el programa.
     * 
     * @param args Indica los argumentos que puede recibir desde la consola de
     *             comandos.
     * @throws InterruptedException   Se toma como tratada a la posible excepcion
     *                                que se genere al realizar los "tiempos de
     *                                carga".
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException {
        // Se inicializa la instancia que estará mostrando la información en la pantalla.
        Menu menu = new Menu();

        /*
            1. Menú inicial que tendrá las siguientes opciones:
                - Iniciar sesión
                - Registrarse como suscriptor
                - Continuar como invitado
                - Salir
        */
        int opcion = menu.bienvenida(); // <- Este método mostrará las opciones y retornará su opción tomada.
        /*
            2. Dependiendo de su decición se definirá la siguiente acción del usuario.
        */
        /* 
            Principalmente se define una variable que indique si el programa debe de terminar, en este caso
            se espera que sea un ciclo que se detenga, se define fuera del switch porque todos los casos
            dependerán de la misma variable.
        */
        boolean exit = false;

        /*
            Hace referencia al usuario que haya ejecutado el programa y ya que es una clase padre
            puede optar por ser un empleado, un suscriptor, un invidado o hasta el director de la
            empresa. 
        */
        Persona usuarioActivo = null;
        switch (opcion) {
            case 1:
                /*
                    Inicia el proceso de autenticación del usuario.
                */
                // Login()
                // Si se logra el login, retornará a la persona que esté usando el sistema.
                usuarioActivo = menu.inicioSesion();
                break;
            case 2:
                /*
                    Comienza el proceso de registro de un suscriptor.
                */
                // Si se logró registrar correctamente realizará un inicio de sesión automático para seguir.
                usuarioActivo = menu.registrarSuscriptor();
                break;
            case 3:
                /*
                    El usuario decició continuar como invitado.
                    Las opciones que este tendrá serán:
                     - 1. Realizar una búsqueda
                           - Buscar un artículo, mediante folio.
                           - Buscar una revista, mediante número de revista.
                           - Mostrar todos los artículos
                           - Mostrar todas las revistas

                           (Ya después de haber sido creada la búsqueda se pregunta si esta quiere ser impresa en un
                            archivo).
                     - 2. Iniciar sesión.
                     - 3. Salir del programa.
                */
                // Ya que es un invitado, no se requiere indicar qué persona está utilizando el sistema.
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
            System.out.println(usuarioActivo.getClass());
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
