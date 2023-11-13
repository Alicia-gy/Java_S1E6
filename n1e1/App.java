package n1e1;

public class App {

	public static void main(String[] args) {
		
		String obj1 = "patata";
		String obj2 = "sandia";
		String obj3 = "mandarina";
		
		NoGenericMethods ngm1 = new NoGenericMethods(obj1, obj2, obj3);
		NoGenericMethods ngm2 = new NoGenericMethods(obj3, obj2, obj1);
		
		System.out.println("Objecte1: \n" + ngm1.toString());
		System.out.println("Objecte2: \n" + ngm2.toString());



	}

}
