package n2e2;

public class Persona {
	
	private String name;
	private String surname;
	private int age;
	
	public Persona (String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return (name + " " + surname + ", de " + age + " anys");
	}

}
