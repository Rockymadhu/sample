package inheritance;

public class Hierarchical {
	
	String username = "Madhuvanthi";
	
	public void user() {
		System.out.println("Username :" +username);
	}
	
	public static class Hierarchical2 extends Hierarchical {
		
		int age = 18;
		
	public void age() {
		System.out.println("Age :" +age);
	}
	}
	
public static class Hierarchical3 extends Hierarchical {
		
		String role = "Intern";
		
		public void role() {
			System.out.println("Role :" +role);
		}

}

    public static void main(String[] args) {

        Hierarchical2 h1 = new Hierarchical2();
        h1.user();
        h1.age();

        Hierarchical3 h2 = new Hierarchical3();
        h2.user();
        h2.role();
    }
}
