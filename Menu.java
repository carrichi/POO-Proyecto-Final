/**************************************
*          CLASES DE APOYO            *
***************************************/
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import Personas.Persona;
import Personas.Empleados.*;
import Personas.Suscriptores.Suscriptor;

/**
* 
*/
public class Menu {
	/**
	* 
	*/
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * 
	 */
	public Busqueda busqueda;	
	
	public Calendar fecha = new GregorianCalendar();

	/**
	* 
	* @return
	*/
	public int bienvenida() {
		// AL momento de la bienvenida lo que se realizará será inicializar la "base de datos".
		this.busqueda = new Busqueda();
		System.out.println(" \n\tBIENVENIDO AL SISTEMA DE ADMINISTRACION\n");
		System.out.println(" 1. Iniciar sesion");
		System.out.println(" 2. Registrarse como suscriptor");
		System.out.println(" 3. Continuar como invitado");
		System.out.println(" 4. Salir ");
		System.out.print(" > ");
		int opcion = sc.nextInt();
		sc.nextLine();
		if (opcion==1 || opcion==2 || opcion==3 || opcion==4) {
			return opcion;
		}else {
			System.out.println("\nAl parecer no elegiste una opcion correcta, intenta otra vez.");
			bienvenida();
		}
		// En teoría no se alcanza a este -1 si es recursivo.
		return -1;
	}
	
	/**
	* Método dedicado a proporcionar el inicio de sesión en el que estará integrada una verificación la cual
	* funciona mediante búsquedas. 
	* @return Retorna una instancia de tipo Persona porque al ser la clase padre de cualquier usuario hace que 
	* pueda comportarse como un empleado, director, editor, suscriptor, etc. 
	*/
	public void inicioSesion() {
		String email;
		System.out.println("###################################");
		System.out.println("# INCIO DE SESION #");
		System.out.println("###################################");
		System.out.println(" Ingresa tu correo");
		email = sc.nextLine();
		System.out.println(" Ingresa tu contrasena");
		char[] p = System.console().readPassword();
		String psswrd = new String(p);
		/*
		Después de haber ingresado su correo y contraseña, ahora se pasa a un proceso de verificación
		para saber si existe dicho usuario.
		Si existe, retorna a la persona para que la clase Start trabaje con ella, si no existe, se vuelve
		a llamar recursivamente al método "inicioSesion( )".
		*/
		Persona usuario = busqueda.verificarInicioSesion(email, psswrd);
		if (usuario != null) {
			System.out.println("Inicio de sesion exitoso!");
			Start.usuarioActivo = usuario;
		} else {
			System.out.println(" El inicio de sesion a fallado, el correo o la contrasena son incorrectos.");
			String continuar;
			do {
				System.out.println(" Quieres volver a intentarlo? (Si/No)");
				System.out.print(" > ");
				continuar = sc.nextLine();
			}while(! ( continuar.equals("Si") || continuar.equals("No")) );
			
			if (continuar.equals("Si")) {
				inicioSesion();
			}
		}
	}
	
	/** 
	* @param sub Suscriptor a registrar
	*/
	public Persona registrarSuscriptor(){
		String aP, aM, nom, email;
		System.out.println(" \tREGISTRAR NUEVO SUSCRIPTOR\n Ingresa los siguientes datos");
		System.out.print(" Nombre : ");
		nom = sc.nextLine();
		System.out.print(" Apellido Paterno : ");
		aP = sc.nextLine();
		System.out.print(" Apellido Materno : ");
		aM = sc.nextLine();

		while (true) {
			System.out.print(" Email : ");
			email = sc.nextLine();
			if ( busqueda.verificarEmail(email) ) {
				System.out.println(" El correo esta disponible! Sigamos.");
				break;
			} else {
				System.out.println(" El correo que proporcionaste ya esta en uso ):");
			}
		}
		
		System.out.print(" Contrasena : ");
		char[] p = System.console().readPassword();
		String psswrd = new String(p);
		System.out.println("Datos ingresados:\nEmail: "+email+"\nContrasena: "+psswrd);
		System.out.println("Esta todo listo para tu registro!");

		/*
			Debe generarse la fecha de registro.
		*/
		String suscripcion = this.fecha.get(Calendar.YEAR)+ "/" + (int)(this.fecha.get(Calendar.MONTH)+ 1) + "/" + this.fecha.get(Calendar.DAY_OF_MONTH);

		Suscriptor suscriptor = new Suscriptor(new Persona(nom, aP, aM, email, psswrd),suscripcion);
		System.out.println(suscriptor);
		return null;
	}
	
	/** 
	* 
	*/
	public void registrarAutor(){
		String aP,aM,nom,mail,cont;
		
		System.out.println(" \tREGISTRAR NUEVO AUTOR\n Ingresa los siguientes datos");
		System.out.print(" Nombre : ");
		nom = sc.nextLine();
		System.out.print(" Apellido Paterno : ");
		aP = sc.nextLine();
		System.out.print(" Apellido Materno : ");
		aM = sc.nextLine();
		System.out.print(" Email : ");
		mail = sc.nextLine();
		System.out.print(" Contraseña : ");
		char[] p = System.console().readPassword();
		String psswrd = new String(p);
	}
	
	/**
	* 
	*/
	public void registrarEditor() {
		String aP, aM, nom, mail, cont;
		
		System.out.println(" \tREGISTRAR NUEVO EDITOR\n Ingresa los siguientes datos");
		System.out.print(" Nombre : ");
		nom = sc.nextLine();
		System.out.print(" Apellido Paterno : ");
		aP = sc.nextLine();
		System.out.print(" Apellido Materno : ");
		aM = sc.nextLine();
		System.out.print(" Email : ");
		mail = sc.nextLine();
		System.out.print(" Contraseña : ");
		char[] p = System.console().readPassword();
		String psswrd = new String(p);
	}
	
	/**
	* 
	*/
	public void registrarRevisor() {
		String aP, aM, nom, mail, cont;
		System.out.println(" \tREGISTRAR NUEVO REVISOR\n Ingresa los siguientes datos");
		System.out.print(" Nombre : ");
		nom=sc.nextLine();
		System.out.print(" Apellido Paterno : ");
		aP=sc.nextLine();
		System.out.print(" Apellido Materno : ");
		aM=sc.nextLine();
		System.out.print(" Email : ");
		mail=sc.nextLine();
		System.out.print(" Contraseña : ");
		char[] p=System.console().readPassword();
		String psswrd = new String(p);
	}
	
	/** 
	* Muestra el menú para el usuario Autor
	*/
	public static void menuAutor(){
		System.out.println(" Selecciona una opcion :");
		System.out.println(" 1. Subir articulo para revision");
		System.out.println(" 2. Consultar estado de articulo");
		System.out.println(" 3. Consultar articulo");
		System.out.println(" 4. Salir");
		int opcion=sc.nextInt();
		switch(opcion) {
			case 1: 
			System.out.println(" ");
			
			break;
			case 2: 
			
			break;
			default: 
			System.out.println(" Opción incorrecta");
			break;
		}
	}
	
	/**
	* 
	*/
	public static void menuEditor(){
		System.out.println(" Selecciona una opcion :");
		System.out.println(" 1. Confirmar publicacion");
		System.out.println(" 2. Consultar estado de articulo");
		System.out.println(" 3. Consultar articulo");
		System.out.println(" 4. Salir");
		int opcion=sc.nextInt();
		switch(opcion){
			case 1: 
			System.out.println(" ");
			
			break;
			case 2: 
			
			break;
			default: 
			System.out.println(" Opción incorrecta");
			break;
		}
		
	}
	
	/**
	* Muestra el menú para el usuario Revisor
	*/
	public static void menuRevisor(){
		System.out.println("\n\nERES UN SUSCRIPTOR!");
		System.out.println(" Selecciona una opcion :");
		System.out.println(" 1. Revisar artículo");
		System.out.println(" 2. Consultar estado de articulo");
		System.out.println(" 3. Consultar articulo");
		System.out.println(" 4. Salir");
		int opcion=sc.nextInt();
		switch(opcion){
			case 1: 
			System.out.println(" ");
			
			break;
			case 2: 
			
			break;
			default: 
			System.out.println(" Opción incorrecta");
			break;
		}
	}
	
	/**
	* 
	*/
	public static void menuSuscriptor(){
		System.out.println(" Selecciona una opcion :");
		System.out.println(" 1. Buscar revista (mediante numero de revista)");
		System.out.println(" 2. Buscar articulo (mediante folio)");
		System.out.println(" 3. Mostrar todos los articulos");
		System.out.println(" 4. Mostrar todas las revistas");
		System.out.println(" 2. Cancelar suscripcion");
		System.out.println(" 3. Salir");
		int opcion=sc.nextInt();
		switch(opcion){
			case 1: 
			System.out.println(" ");
			break;
			case 2: 
			
			break;
			case 3: 
			
			break;
			default:
			System.out.println(" Opción incorrecta");
			break;
		}
	}
	
	/**
	* 
	*/
	public boolean menuInvitado(){
		boolean salir = false;
		do {
			System.out.println(" Selecciona una opcion :");
			System.out.println(" 1. Iniciar sesion");
			System.out.println(" 2. Registrarse");
			System.out.println(" 3. Buscar revista (mediante numero de revista)");
			System.out.println(" 4. Buscar articulo (mediante folio)");
			System.out.println(" 5. Mostrar todos los articulos");
			System.out.println(" 6. Mostrar todas las revistas");
			System.out.println(" 7. Cerrar programa");
			System.out.print(" > ");
			int opcion = sc.nextInt();
			sc.nextLine();
			switch(opcion){
				case 1: 
					inicioSesion();
				break;
				case 2: 
					registrarSuscriptor();
				break;
				case 3: 
					System.out.println("Buscar una revista");
				break;
				case 4: 
					System.out.println("Buscar un articulo");
				break;
				case 5: 
					System.out.println("Mostrar todos los articulos");
				break;
				case 6: 
					System.out.println("Mostrar todas las revistas");
				break;
				case 7: 
					System.out.println("Cerrar programa");
					salir = true;
				break;
				default:
					System.out.println(" Opción incorrecta");
				break;
			}
		} while (! salir);
		return salir;
	}
}