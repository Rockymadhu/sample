package inheritance;

public class Child extends Multiple {
	
  int age = 18;
	
	public void display() {
		 super.display();
		 System.out.println("Age :" +age);
		
			
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		c.display();
	
	}

}
