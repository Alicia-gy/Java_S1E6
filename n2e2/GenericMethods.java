package n2e2;

public class GenericMethods {
	
	@SafeVarargs
	public static <T> void print(T... objects) {
		for(T obj : objects) {
			System.out.println(obj.toString());
		}
	}

}
