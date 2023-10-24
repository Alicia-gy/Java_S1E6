package n1e2;

public class App {
	
	public static void main(String[] args) {
	
	Persona obj1 = new Persona("nombre", "apellido", 20);
	String obj2 = "patata";
	int obj3 = 3;
	
	GenericMethods.print(obj1, obj2, obj3);
	GenericMethods.print(obj3, obj2, obj1);

	
	}
}
