package polymorphism;

public class Overriding2 {
	
	public void mark(int maths,int english) {
		
		System.out.println("After revaluation");
		System.out.println("Maths mark:" + maths);
		System.out.println("English mark:" + english);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overriding m1 = new Overriding();
		m1.mark(71, 83);
		
		Overriding2 m2 = new Overriding2();
		m2.mark(85, 90);
		

	}

}
