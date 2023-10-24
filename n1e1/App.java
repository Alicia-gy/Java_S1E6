package n1e1;

public class App {

	public static void main(String[] args) {
		
		String obj1 = "patata";
		String obj2 = "sandia";
		int obj3 = 27;
		
		NoGenericMethods<Object> ngm1 = new NoGenericMethods<>(obj1, obj2, obj3);
		NoGenericMethods<Object> ngm2 = new NoGenericMethods<>(obj3, obj2, obj1);
		
		System.out.println(ngm1.toString());
		System.out.println(ngm2.toString());



	}

}
