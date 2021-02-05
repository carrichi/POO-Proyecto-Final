/**************************************
*          CLASES DE APOYO            *
***************************************/
import java.util.Scanner;
import Personas.Persona;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
	 * @return
	 */
	public static int bienvenida() {
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
	 * Método dedicado a proporcionar el inicio de sesión en el que estará integrada una verificación la cual
	 * funciona mediante búsquedas. 
	 * @return Retorna una instancia de tipo Persona porque al ser la clase padre de cualquier usuario hace que 
	 * pueda comportarse como un empleado, director, editor, suscriptor, etc. 
	 */
	public static Persona inicioSesion() {
		String mail;
		System.out.println(" Tipo de usuario");
		System.out.println(" 1. Director");
		System.out.println(" 2. Editor");
		System.out.println(" 3. Revisor");
		System.out.println(" 4. Autor");
		System.out.println(" 5. Suscriptor");
		System.out.println(" 6. Regresar");
		int opcion = sc.nextInt();
		System.out.println(" Ingresa tu correo");
		mail=sc.nextLine();
		System.out.println(" Ingresa tu contraseña");
		char[] p = System.console().readPassword();
		String psswrd = new String(p);
		Persona per = new Persona();
		per.setEmail(mail);
		per.setPassword(psswrd);
		ObjectInputStream fileIn;
		try{
			switch(opcion) {
				case 1:
				/* 
					fileIn = new ObjectInputStream(new FileInputStream("Autores.ser"));
						Autor autor = buscar( (Autor)per,fileIn);
						if(autor!=null){
							System.out.println(" Inicio de secion con exito");
							menuAutor(autor);
						}
						else
							System.out.println(" Error : no existe el usuario");
				*/
					break;
				case 2: 

					break;
				case 3: 
		
					break;
				case 4: 
			
					break;
				case 5: 
					break;
				default: 
					System.out.println(" Error al ingresar la opcion");
					break;
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		/*Persona aux=new Persona();
		aux.setEmail(mail);
		aux.setPassword(psswrd);
		buscarUsuario(aux,opcion);*/
	}
	
	/*public static Autor buscar(Autor autor,ObjectInputStream ois){
		int bandera=0;
		Autor aux=null;
		try{
			aux=(Autor)ois.readObject();
		
			while(aux.getNombre()!=null){
				if(aux.getEmail()==autor.getEmail()  &&  aux.getPassword()==autor.getPassword()){
					bandera=1;
					break;
				}
				aux=(Autor)ois.readObject();
			}
		
		}catch(FileNotFoundException e){
		}catch(IOException e){
		}catch(ClassNotFoundException e){}
		
		if(bandera==1){
			return aux;
		}else
			return null;
	}*/
	
	/**
	 * 
	 * @param sub
	 */
	public void registrar(Suscriptor sub) {
		String aP, aM, nom, mail, cont;
		
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
		String psswrd = new String(p);
	}
	
	/**
	 * 
	 * @param autor
	 */
	public void registrar(Autor autor) {
		String aP, aM, nom, mail, cont;
		
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
		char[] p = System.console().readPassword();
		String psswrd = new String(p);
	}

	/**
	 * 
	 * @param editor
	 */
	public void registrar(Editor editor) {
		String aP, aM, nom, mail, cont;
		
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
		String psswrd = new String(p);
	}
	
	/**
	 * 
	 * @param revisor
	 */
	public void registrar(Revisor revisor) {
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
	 * 
	 */
	public static void menuAutor() {
		System.out.println(" Selecciona una opcion :");
		System.out.println(" 1. Subir articulo para revision");
		System.out.println(" 2. Salir");
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
		System.out.println(" 2. Salir");
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
	public static void menuRevisor(){
		System.out.println(" Selecciona una opcion :");
		System.out.println(" 1. Revisar artículo");
		System.out.println(" 2. Salir");
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
	public static void menuInvitado(){
		System.out.println(" Selecciona una opcion :");
		System.out.println(" 1. Buscar revista (mediante numero de revista)");
		System.out.println(" 2. Buscar articulo (mediante folio)");
		System.out.println(" 3. Mostrar todos los articulos");
		System.out.println(" 4. Mostrar todas las revistas");
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
			default: System.out.println(" Opción incorrecta");
		}
	}
}