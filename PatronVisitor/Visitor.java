package PatronVisitor;

import Personas.Subscriptores.*;
import Personas.Empleados.*;
import Revistas.*;

public interface Visitor{
	public void visit(Revisor revisor);
	public void visit(Editor editor);
	public void visit(Autor autor);
	public void visit(Subscriptor sub);
	public void visit(Empleado empleado);
	public void visit(Articulo articulo);
	public void visit(Categoria cat);
	public void visit(Revista revista);
	
}
