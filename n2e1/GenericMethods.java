package n2e1;

public class GenericMethods {
	
	public static <T> void print(T obj1, T obj2, int obj3) {
		System.out.println("obj1: " + obj1 +
				"\nobj2: " + obj2 +
				"\nobj3: " + obj3);
	}

}
