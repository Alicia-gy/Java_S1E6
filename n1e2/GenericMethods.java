package n1e2;

public class GenericMethods {
	
	public static <T> void print(T obj1, T obj2, T obj3) {
		System.out.println("obj1: " + obj1 +
				"\nobj2: " + obj2 +
				"\nobj3: " + obj3);
	}

}
