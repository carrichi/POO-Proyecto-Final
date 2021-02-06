/**************************************
*          CLASES DE APOYO            *
***************************************/
import java.io.FileNotFoundException;
import java.io.IOException;
import Personas.Persona;

/**
 * Esta es la clase que realizara la ejecucion de todo el sistema de
 * administracion.
 */
public class Start {

    /**
     * Se define a esta instancia como al usuario que está llevando la ejecución actual de todo el programa
     * y ya que se definió que se requiere un solo usuario por ejecución esta será una variable estática.
     */
    static Persona usuarioActivo;

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
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws InterruptedException, FileNotFoundException, ClassNotFoundException, IOException {
        // Se inicializa la instancia que estará mostrando la información en la pantalla.
        Menu menu = new Menu();
        
        // Se realiza una pequeña presentación al usuario.
        menu.bienvenida(); 
        
        /* 
            Principalmente se define una variable que indique si el programa debe de terminar, en este caso
            se espera que sea un ciclo que se detenga, se define fuera del ciclo porque más de una asignación
            depende de esta variable.
        */
        boolean exit = false;
        
        /*
            Este sera un ciclo que no terminara hasta que el usuario actual decida cerrar su sesión.
            Ya que apenas comienza el programa, el usuario que está ejecutando el programa será definido 
            por defecto como un invitado, por lo que para ser esto deberá definirse como una instancia nula.
        */
        Start.usuarioActivo = null;
        while ( ! exit ) {
            if (Start.usuarioActivo == null) {
                exit = menu.menuInvitado();
            } else {
                if ( Start.usuarioActivo.clase().equals(("Director")) ) {
                    exit = menu.menuDirector();
                } else if ( Start.usuarioActivo.clase().equals(("Autor")) ){
                    exit = menu.menuAutor();
                } else if (Start.usuarioActivo.clase().equals(("Editor"))) {
                    exit = menu.menuEditor();
                } else if (Start.usuarioActivo.clase().equals("Revisor")) {
                    exit = menu.menuRevisor();
                } else if (usuarioActivo.clase().equals(("Suscriptor"))){
                    exit = menu.menuSuscriptor();
                }
            }
        }
        
        // La única forma de llegar a esta sección es eligiendo salir en alguno de los menús de usuario.
        // Por lo tanto, ya solo se procederá a guardar los archivos de la base de datos y terminar el programa.
        System.out.println("\nHas decidido salir.");
        // Thread.sleep(1800);
        System.out.println("Guardando cambios...");
        menu.database.guardarCambios();
        // Thread.sleep(2100);
        System.out.println("Terminando sesion activa...");
        // Thread.sleep(2000);
        System.out.println("Desconectando base de datos...");
        // Thread.sleep(4000);
        System.out.println("Listo! Gracias por utilizar el sistema de administracion.");
        System.out.println();
        // Thread.sleep(3000);
    }
}
