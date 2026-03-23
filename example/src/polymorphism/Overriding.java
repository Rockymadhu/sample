package polymorphism;

public class Overriding {
	
	public void mark(int maths, int english) {
		
		
		System.out.println("Before revaluation ");
		System.out.println("Maths mark : " + maths);
		System.out.println("English mark : " + english);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overriding m1 = new Overriding();
		m1.mark(71, 83);

	}

}
