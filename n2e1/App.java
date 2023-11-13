package n2e1;

public class App {
	
	public static void main(String[] args) {
	
	Persona obj1 = new Persona("nombre", "apellido", 20);
	String obj2 = "patata";
	int obj3 = 3;
	
	GenericMethods.print(obj1, obj2, obj3);
	//GenericMethods.print(obj3, obj2, obj1); si cambiem un parametre perque sigui no generic, llavors deixa de funcionar quan no li donin el parametre que demana

	
	}
}
