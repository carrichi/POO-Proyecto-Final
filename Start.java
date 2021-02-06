/**************************************
*          CLASES DE APOYO            *
***************************************/
import Personas.Persona;
// import PatronVisitor.*;
import java.io.IOException;

/**
* Esta es la clase que realizara la ejecucion de todo el sistema de
* administracion.
*/
public class Start {
    
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
        
        // int opcion = menu.bienvenida(); // <- Este método mostrará las opciones y retornará su opción tomada.
        menu.bienvenida(); // <- Este método mostrará las opciones y retornará su opción tomada.
        
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
        Hace referencia al usuario que esté ejecutado el programa y ya que es una clase padre
        puede optar por ser un empleado, un suscriptor, un invidado o hasta el director de la
        empresa. 
        */

        /*
        Despues de que se haya registrado, es necesario mostrarle un menu me opciones segun el usuario que haya
        iniciado sesion.
        
        Este sera un ciclo que no terminara hasta que el usuario actual decida cerrar su sesión.
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
        System.out.println("\nHas decidido salir.");
        // Thread.sleep(1800);
        System.out.println("Guardando cambios...");
        menu.database.guardarCambios();
        // Thread.sleep(2000);
        System.out.println("Terminando sesion activa...");
        // Thread.sleep(2000);
        System.out.println("Desconectando base de datos...");
        // Thread.sleep(4000);
        System.out.println("Listo! Gracias por utilizar el sistema de administracion.");
        // Thread.sleep(3000);
        System.out.println("\n\n");
    }
}
