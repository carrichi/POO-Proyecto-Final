import java.util.Scanner;
import Personas.Persona;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import Personas.Empleados.*;
import Personas.Subscriptores.Subscriptor;

public class Menu{
	
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * Inicio del programa
	 */
	public static int bienvenida(){
		System.out.println(" \n\tBIENVENIDO AL SISTEMA DE ADMINISTRACIÓN\n");
		System.out.println(" 1. Iniciar sesión");
		System.out.println(" 2. Registrarse como suscriptor");
		System.out.println(" 3. Continuar como invitado");
		System.out.println(" 4. Salir ");
		System.out.print(" > ");
		int opcion=sc.nextInt();
		System.out.println();
		return opcion;
	}
	
	/**
	 * Inicio de sesion por usuario
	 */
	public static void inicioSesion(){
		
		String mail;
		System.out.println(" Tipo de usuario");
		System.out.println(" 1. Autor");
		System.out.println(" 2. Editor");
		System.out.println(" 3. Revisor");
		System.out.println(" 4. Suscriptor");
		System.out.println(" 5. Regresar");
		int opcion=sc.nextInt();
		System.out.println(" Ingresa tu correo");
		mail=sc.nextLine();
		System.out.println(" Ingresa tu contraseña");
		char[] p=System.console().readPassword();
		String psswrd=new String(p);
		Persona per=new Persona();
		per.setEmail(mail);
		per.setPassword(psswrd);
		ObjectInputStream fileIn;
		try{
		switch(opcion){
			case 1: menuAutor();
					break;
			case 2: menuEditor();
					break;
			case 3: menuRevisor();
					break;
			case 4: menuSuscriptor();
					break;
			case 5: break;
			default: System.out.println(" Error al ingresar la opcion");
		}
		
	}
	
	/** @param sub Suscriptor a registrar
	 */
	public void registrar(Subscriptor sub){
		String aP,aM,nom,mail,cont;
		
		System.out.println(" \tREGISTRAR NUEVO SUSCRIPTOR\n Ingresa los siguientes datos");
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
		String psswrd=new String(p);
		
	}
	
	/** @param autor Autor a registrar
	 */
	public void registrar(Autor autor){
		String aP,aM,nom,mail,cont;
		
		System.out.println(" \tREGISTRAR NUEVO AUTOR\n Ingresa los siguientes datos");
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
		String psswrd=new String(p);
		
	}
	
	/** @param editor Editor a registrar
	 */
	public void registrar(Editor editor){
		String aP,aM,nom,mail,cont;
		
		System.out.println(" \tREGISTRAR NUEVO EDITOR\n Ingresa los siguientes datos");
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
		String psswrd=new String(p);
		
	}
	
	/** @param revisor Revisor a registrar
	 */
	public void registrar(Revisor revisor){
		String aP,aM,nom,mail,cont;
		
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
		String psswrd=new String(p);
		
	}
	
	/** Muestra el menú para el usuario Autor
	 */
	public static void menuAutor(){
		System.out.println(" Selecciona una opcion :");
		System.out.println(" 1. Subir articulo para revision");
		System.out.println(" 2. Consultar estado de articulo");
		System.out.println(" 3. Consultar articulo");
		System.out.println(" 4. Salir");
		int opcion=sc.nextInt();
		switch(opcion){
			case 1: System.out.println(" ")
					break;
			case 2: 
					break;
			case 3: 
					break;
			case 4: break;
			default: System.out.println(" Opción incorrecta");
		}
	}
	
	/** Muestra el menú para el usuario Editor
	 */
	public static void menuEditor(){
		System.out.println(" Selecciona una opcion :");
		System.out.println(" 1. Confirmar publicacion");
		System.out.println(" 2. Consultar estado de articulo");
		System.out.println(" 3. Consultar articulo");
		System.out.println(" 4. Salir");
		int opcion=sc.nextInt();
		switch(opcion){
			case 1: System.out.println(" ")
					break;
			case 2: 
					break;
			case 3: 
					break;
			case 4: break;
			default: System.out.println(" Opción incorrecta");
		}
		
	}
	
	/** Muestra el menú para el usuario Revisor
	 */
	public static void menuRevisor(){
		System.out.println(" Selecciona una opcion :");
		System.out.println(" 1. Revisar artículo");
		System.out.println(" 2. Consultar estado de articulo");
		System.out.println(" 3. Consultar articulo");
		System.out.println(" 4. Salir");
		int opcion=sc.nextInt();
		switch(opcion){
			case 1: System.out.println(" ")
					break;
			case 2: 
					break;
			case 3: 
					break;
			case 4: break;
			default: System.out.println(" Opción incorrecta");
		}
	}
	
	/** Muestra el menú para el usuario Suscriptor
	 */
	public static void menuSuscriptor(){
		System.out.println(" Selecciona una opcion :");
		System.out.println(" 1. Ver revista");
		System.out.println(" 2. Cancelar suscripcion");
		System.out.println(" 3. Salir");
		int opcion=sc.nextInt();
		switch(opcion){
			case 1: System.out.println(" ")
					break;
			case 2: 
					break;
			case 3: break;
			default: System.out.println(" Opción incorrecta");
		}
		
	}
}
