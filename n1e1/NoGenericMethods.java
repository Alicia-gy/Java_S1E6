package n1e1;

public class NoGenericMethods<T> {
	
	private T obj1;
	private T obj2;
	private T obj3;
	
	public NoGenericMethods(T obj1, T obj2, T obj3) {
		this.obj1 = obj1;
		this.obj2 = obj2;
		this.obj3 = obj3;
	}
	
	public T getObj1() {
		return obj1;
	}
	
	public T getObj12() {
		return obj1;
	}
	
	public T getObj3() {
		return obj1;
	}
	
	public void setObj1(T obj1) {
		this.obj1 = obj1;
	}
	
	public void setObj2(T obj2) {
		this.obj2 = obj2;
	}
	
	public void setObj3(T obj3) {
		this.obj3 = obj3;
	}
	
	@Override
	public String toString() {
		return ("obj1: " + obj1 +
				"\nobj2: " + obj2 +
				"\nobj3: " + obj3);
	}

}
