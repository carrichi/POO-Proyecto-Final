package PatronVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import Personas.Empleados.*;
import Personas.Suscriptores.*;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.PrintWriter;
//import java.io.StringWriter;
import Revistas.*;



public class ArchivoVisitor implements Visitor{
	
	public void visit(Revisor revisor){
		ObjectOutputStream file;
		try {
            file = new ObjectOutputStream(new FileOutputStream("Revisores.ser"));
            file.writeObject(revisor);
            file.close();
        } 
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
	}
	
	public void visit(Editor editor){
		ObjectOutputStream file;
		try {
            file = new ObjectOutputStream(new FileOutputStream("Editores.ser"));
            file.writeObject(editor);
            file.close();
        } 
        catch (IOException e){
            System.out.println("Error: " + e.getStackTrace().toString());
           /* StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            System.out.println(exceptionAsString);*/
        }
	}
	
	public void visit(Autor autor){
		ObjectOutputStream file;
		try {
            file = new ObjectOutputStream(new FileOutputStream("Autores.ser"));
            file.writeObject(autor);
            file.close();
        } 
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
	}
	
	public void visit(Suscriptor sub){
		ObjectOutputStream file;
		try {
            file = new ObjectOutputStream(new FileOutputStream("Subscritores.ser"));
            file.writeObject(sub);
            file.close();
        } 
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
	}
	
	public void visit(Empleado empleado){
		ObjectOutputStream file;
		try {
            file = new ObjectOutputStream(new FileOutputStream("Empleados.ser"));
            file.writeObject(empleado);
            file.close();
        } 
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
	}
	
	public void visit(Articulo articulo){
		ObjectOutputStream file;
		try {
            file = new ObjectOutputStream(new FileOutputStream("Articulos.ser"));
            file.writeObject(articulo);
            file.close();
        } 
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
	}
	
	public void visit(Categoria cat){
		ObjectOutputStream file;
		try {
            file = new ObjectOutputStream(new FileOutputStream("Categorias.ser"));
            file.writeObject(cat);
            file.close();
        } 
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
	}
	
	public void visit(Revista revista){
		ObjectOutputStream file;
		try {
            file = new ObjectOutputStream(new FileOutputStream("Revista.ser"));
            file.writeObject(revista);
            file.close();
        } 
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
	}
}
