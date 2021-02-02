package Personas;

import Personas.Subscriptores.*;
import Personas.Empleados.*;

public interface Visitor{
	public void visit(Revisor revisor);
	public void visit(Editor editor);
	public void visit(Autor autor);
	public void visit(Subscriptor sub);
	//public void visit(Empleado empleado);
	
}
