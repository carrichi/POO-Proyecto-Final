/**************************************
*          CLASES DE APOYO            *
***************************************/
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import Personas.Persona;
import Personas.Suscriptores.Suscriptor;
import Personas.Empleados.*;

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
	public AccesoBD database;	
	
	/**
	* 
	*/
	public Calendar fecha = new GregorianCalendar();
	
	/**
	* 
	* @return
	*/
	public int bienvenida() {
		// AL momento de la bienvenida lo que se realizará será inicializar la "base de datos".
		this.database = new AccesoBD();
		System.out.println(" \n\tBIENVENIDO AL SISTEMA DE ADMINISTRACION\n");

		// System.out.println(" 1. Iniciar sesion");
		// System.out.println(" 2. Registrarse como suscriptor");
		// System.out.println(" 3. Continuar como invitado");
		// System.out.println(" 4. Salir ");
		// System.out.print(" > ");
		// int opcion = sc.nextInt();
		// sc.nextLine();
		// if (opcion==1 || opcion==2 || opcion==3 || opcion==4) {
		// 	return opcion;
		// }else {
		// 	System.out.println("\nAl parecer no elegiste una opcion correcta, intenta otra vez.");
		// 	bienvenida();
		// }
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
		System.out.println("###################################");
		System.out.println("# INCIO DE SESION #");
		System.out.println("###################################");
		
		System.out.println(" Ingresa tu correo");
		String email = sc.nextLine();
		System.out.println(" Ingresa tu contrasena");
		char[] p = System.console().readPassword();
		String password = new String(p);
		/*
		Después de haber ingresado su correo y contraseña, ahora se pasa a un proceso de verificación
		para saber si existe dicho usuario.
		Si existe, retorna a la persona para que la clase Start trabaje con ella, si no existe, se vuelve
		a llamar recursivamente al método "inicioSesion( )".
		*/
		Persona usuario = database.verificarInicioSesion(email, password);
		if (usuario != null) {
			System.out.println("Inicio de sesion exitoso!");
			if ( usuario.clase().equals("Director") ) {
				Start.usuarioActivo = (Empleado) usuario;
			} else if ( usuario.clase().equals("Autor") ){
				Start.usuarioActivo = (Autor) usuario;
			} else if (usuario.clase().equals("Editor") ){
				Start.usuarioActivo = (Editor) usuario;
			} else if (usuario.clase().equals("Revisor") ) {
				Start.usuarioActivo = (Revisor) usuario;
			} else if (usuario.clase().equals("Suscriptor")){
				Start.usuarioActivo = (Suscriptor) usuario;
			}
		} else {
			System.out.println(" El inicio de sesion a fallado, el correo o la contrasena son incorrectos.");
			Start.usuarioActivo = new Persona();
		}
	}
	
	/** 
	* @param sub Suscriptor a registrar
	*/
	public void registrarSuscriptor(){
		System.out.println(" \tREGISTRAR NUEVO SUSCRIPTOR\n Ingresa los siguientes datos");
		System.out.print(" Nombre : ");
		String nom = sc.nextLine();
		System.out.print(" Apellido Paterno : ");
		String aP = sc.nextLine();
		System.out.print(" Apellido Materno : ");
		String aM = sc.nextLine();
		String email;
		while (true) {
			System.out.print(" Email : ");
			email = sc.nextLine();
			if ( database.verificarEmail(email) ) {
				System.out.println(" El correo esta disponible! Sigamos.");
				break;
			} else {
				System.out.println(" El correo que proporcionaste ya esta en uso ):");
			}
		}
		
		System.out.print(" Contrasena : ");
		char[] p = System.console().readPassword();
		String password = new String(p);
		System.out.println("Datos ingresados:\nEmail: "+email+"\nContrasena: "+password);
		/*
		Debe generarse la fecha de registro.
		*/
		String suscripcion = this.fecha.get(Calendar.YEAR)+ "/" + (int)(this.fecha.get(Calendar.MONTH)+ 1) + "/" + this.fecha.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("Esta todo listo para tu registro!");
		
		Start.usuarioActivo = new Suscriptor(new Persona(nom, aP, aM, email, password),suscripcion);
		
		/*
		Aquí inicia la parte del registro donde se añade a la base de datos.
		*/
		database.agregar((Suscriptor) Start.usuarioActivo);
	}
	
	/** 
	* 
	*/
	public void registrarAutor(){
		System.out.println(" \tREGISTRAR NUEVO AUTOR\n Ingresa los siguientes datos");
		System.out.print(" Nombre : ");
		String nom = sc.nextLine();
		System.out.print(" Apellido Paterno : ");
		String aP = sc.nextLine();
		System.out.print(" Apellido Materno : ");
		String aM = sc.nextLine();
		String email;
		while (true) {
			System.out.print(" Email : ");
			email = sc.nextLine();
			if ( database.verificarEmail(email) ) {
				System.out.println(" El correo esta disponible! Sigamos.");
				break;
			} else {
				System.out.println(" El correo que proporcionaste ya esta en uso ):");
			}
		}
		
		System.out.print(" Contrasena : ");
		char[] p = System.console().readPassword();
		String password = new String(p);
		System.out.println("Datos ingresados:\nEmail: "+email+"\nContrasena: "+password);
		/*
		Debe generarse la fecha de registro.
		*/
		String suscripcion = this.fecha.get(Calendar.YEAR)+ "/" + (int)(this.fecha.get(Calendar.MONTH)+ 1) + "/" + this.fecha.get(Calendar.DAY_OF_MONTH);
		
		/*
			FALTA NÚMERO DE EMPLEADO Y ESPECIALIDADES Y ASI
		*/
		System.out.println("Esta todo listo para tu registro!");
		
		Start.usuarioActivo = new Suscriptor(new Persona(nom, aP, aM, email, password),suscripcion);
		
		/*
		Aquí inicia la parte del registro donde se añade a la base de datos.
		*/
		database.agregar((Suscriptor) Start.usuarioActivo);
	}
	
	/**
	* 
	*/
	public void registrarEditor() {
		System.out.println(" \tREGISTRAR NUEVO EDITOR\n Ingresa los siguientes datos");
		System.out.print(" Nombre : ");
		String nom = sc.nextLine();
		System.out.print(" Apellido Paterno : ");
		String aP = sc.nextLine();
		System.out.print(" Apellido Materno : ");
		String aM = sc.nextLine();
		System.out.print(" Email : ");
		String email = sc.nextLine();
		System.out.print(" Contraseña : ");
		char[] p = System.console().readPassword();
		String password = new String(p);
	}
	
	/**
	* 
	*/
	public void registrarRevisor() {
		System.out.println(" \tREGISTRAR NUEVO REVISOR\n Ingresa los siguientes datos");
		System.out.print(" Nombre : ");
		String nom = sc.nextLine();
		System.out.print(" Apellido Paterno : ");
		String aP = sc.nextLine();
		System.out.print(" Apellido Materno : ");
		String aM = sc.nextLine();
		System.out.print(" Email : ");
		String email = sc.nextLine();
		System.out.print(" Contraseña : ");
		char[] p = System.console().readPassword();
		String password = new String(p);
	}
	
	/**
	* 
	*/
	public boolean menuDirector(){
		boolean salir = false;
		do {
			System.out.println("DIRECTOR");
			System.out.println(" Selecciona una opcion :");
			System.out.println("  1. Registrar un empleado");
			System.out.println("  2. Publicar revista");
			System.out.println("  3. Consultar un empleado (mediante número de empleado)");
			System.out.println("  4. Consultar un articulo (mediante numero de folio)");
			System.out.println("  5. Consultar una revista (mediante numero de folio)");
			System.out.println("  6. Consultar todos los articulos.");
			System.out.println("  7. Consultar todas las revistas.");
			System.out.println("  8. Consultar suscriptores.");
			System.out.println("  9. Salir");
			System.out.print(" > ");
			int opcion = sc.nextInt();
			switch(opcion) {
				case 1: 
				/*
				Registrar un empleado
				*/
				break;
				case 2: 
				/*
				Publicar revista
				*/
				break;
				case 3: 
				/*
				Consultar empleado
				*/
				break;
				case 4: 
				/*
				Consultar articulo
				*/				
				break;
				case 5: 
				/*
				Consultar revista
				*/
				break;
				case 6:
				/*
				Consultar todos los articulos
				*/
				break;
				case 7: 
				/*
				Consultar todas las revistas
				*/
				break;
				case 8: 
				/*
				Consultar suscriptores.
				*/
				break;
				case 9: 
				/*
				SALIR
				*/
				salir = true;
				break;
				default: 
				System.out.println(" Opcion incorrecta");
				break;
			}
		} while (! salir);
		return true;
	}
	
	/** 
	* Muestra el menú para el usuario Autor
	*/
	public boolean menuAutor(){
		boolean salir = false;
		do {
			System.out.println("AUTOR");
			System.out.println(" Selecciona una opcion :");
			System.out.println("  1. Crear articulo.");
			System.out.println("  2. Consultar un empleado (mediante número de empleado)");
			System.out.println("  3. Consultar un articulo (mediante numero de folio)");
			System.out.println("  4. Consultar una revista (mediante numero de folio)");
			System.out.println("  5. Consultar todos los articulos.");
			System.out.println("  6. Consultar todas las revistas.");
			System.out.println("  7. Consultar suscriptores.");
			System.out.println("  8. Salir");
			System.out.print(" > ");
			int opcion = sc.nextInt();
			switch(opcion) {
				case 1: 
				/*
				Crear artículo
				*/
				break;
				case 2: 
				/*
				Consultar empleado
				*/
				break;
				case 3: 
				/*
				Consultar articulo
				*/
				break;
				case 4: 
				/*
				Consultar revista
				*/
				break;
				case 5: 
				/*
				Consultar todos los articulos
				*/
				break;
				case 6: 
				/*
				Consultar todas las revistas
				*/
				break;
				case 7: 
				/*
				Consultar los suscriptores
				*/
				break;
				case 8: 
				/*
				SALIR
				*/
				salir = true;
				break;
				default: 
				System.out.println(" Opcion incorrecta");
				break;
			}
		} while (! salir);
		return true;
	}
	
	/**
	* 
	*/
	public boolean menuEditor(){
		boolean salir = false;
		do {
			System.out.println("EDITOR");
			System.out.println(" Selecciona una opcion :");
			System.out.println("  1. Confirmar articulo");
			System.out.println("  2. Consultar un empleado (mediante número de empleado)");
			System.out.println("  3. Consultar un articulo (mediante numero de folio)");
			System.out.println("  4. Consultar una revista (mediante numero de folio)");
			System.out.println("  5. Consultar todos los articulos.");
			System.out.println("  6. Consultar todas las revistas.");
			System.out.println("  7. Consultar suscriptores.");
			System.out.println("  8. Salir");
			System.out.print(" > ");
			int opcion = sc.nextInt();
			switch(opcion){
				case 1: 
				/*
				Confirmar artículo
				*/
				break;
				case 2: 
				/*
				Consultar un empleado
				*/
				break;
				case 3:
				/*
				Consultar un artículo
				*/				
				break;
				case 4: 
				/*
				Consultar una revista
				*/
				break;
				case 5:
				/*
				Consultar todos los articulos
				*/
				break;
				case 6: 
				/*
				Consultar todas las revistas
				*/
				break;
				case 7: 
				/*
				Consultar todos los suscriptores
				*/
				break;
				case 8: 
				/*
				SALIR
				*/
				salir = true;
				break;
				default: 
				System.out.println(" Opcion incorrecta");
				break;
			}
		} while (! salir);
		return true;
	}
	
	/**
	* Muestra el menú para el usuario Revisor
	*/
	public boolean menuRevisor(){
		boolean salir = false;
		do {
			System.out.println("REVISOR");
			System.out.println(" Selecciona una opcion :");
			System.out.println("  1. Revisar artículo");
			System.out.println("  2. Consultar un empleado (mediante número de empleado)");
			System.out.println("  3. Consultar un articulo (mediante numero de folio)");
			System.out.println("  4. Consultar una revista (mediante numero de folio)");
			System.out.println("  5. Consultar todos los articulos.");
			System.out.println("  6. Consultar todas las revistas.");
			System.out.println("  7. Consultar suscriptores.");
			System.out.println("  8. Salir");
			System.out.print(" > ");
			int opcion=sc.nextInt();
			switch(opcion){
				case 1: 
				/*
				Revisar artículo
				*/
				break;
				case 2: 
				/*
				Consultar un empleado
				*/
				break;
				case 3:
				/*
				Consultar un artículo
				*/				
				break;
				case 4: 
				/*
				Consultar una revista
				*/
				break;
				case 5:
				/*
				Consultar todos los articulos
				*/
				break;
				case 6: 
				/*
				Consultar todas las revistas
				*/
				break;
				case 7: 
				/*
				Consultar todos los suscriptores
				*/
				break;
				case 8: 
				/*
				SALIR
				*/
				salir = true;
				break;
				default: 
				System.out.println(" Opcion incorrecta");
				break;
			}
		} while (! salir);
		return true;
	}
	
	/**
	* 
	*/
	public boolean menuSuscriptor(){
		boolean salir = false;
		do {
			System.out.println("SUSCRIPTOR");
			System.out.println(" Selecciona una opcion :");
			System.out.println(" 1. Consultar revista (mediante numero de revista)");
			System.out.println(" 2. Consultar articulo (mediante folio)");
			System.out.println(" 3. Consultar todos los articulos");
			System.out.println(" 4. Consultar todas las revistas");
			System.out.println(" 5. Cancelar suscripcion");
			System.out.println(" 6. Salir");
			System.out.print(" > ");
			int opcion=sc.nextInt();
			switch(opcion){
				case 1: 
					/*
					Consultar revista
					*/
				break;
				case 2: 
					/*
					Cnsultar articulo
					*/
				break;
				case 3: 
					/*
					Consultar todos los articulos
					*/
				break;
				case 4:
					/*
					Consultar todas las revistas
					*/
				break;
				case 5:
					/*
					Cancelar suscripcion
					*/
				break;
				case 6:
					/*
					SALIR
					*/
					salir = true;
				break;
				default:
				System.out.println(" Opcion incorrecta");
				break;
			}
		} while (! salir);
		return true;
	}
	
	/**
	* 
	*/
	public boolean menuInvitado() {
		boolean salir = false;
		do {
			System.out.println("INVITADO");
			System.out.println(" Selecciona una opcion :");
			System.out.println(" 1. Iniciar sesion");
			System.out.println(" 2. Registrarse como suscriptor");
			System.out.println(" 3. Consultar revista (mediante numero de revista)");
			System.out.println(" 4. Consultar articulo (mediante folio)");
			System.out.println(" 5. Mostrar todos los articulos");
			System.out.println(" 6. Mostrar todas las revistas");
			System.out.println(" 7. Cerrar programa");
			System.out.print(" > ");
			int opcion = sc.nextInt();
			sc.nextLine();
			switch(opcion){
				case 1:
					/*
					Iniciar sesion
					*/
					inicioSesion();
					return false;
				case 2: 
					/*
					Registrarse como suscriptor.
					*/
					registrarSuscriptor();
				break;
				case 3:
					/*
					Consultar una revista
					*/
				break;
				case 4:
					/*
					Consultar un articulo
					*/
				break;
				case 5:
					/*
					Consultar todos los articulos
					*/
				break;
				case 6:
					/*
					Consultar todas las revistas
					*/ 
				break;
				case 7:
					/*
					SALIR
					*/
					salir = true;
				break;
				default:
					System.out.println(" Opcion incorrecta");
				break;
			}
		} while (! salir);
		return true;
	}
}