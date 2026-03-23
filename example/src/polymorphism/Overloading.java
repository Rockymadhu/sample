package polymorphism;

public class Overloading {
	
	private int num1;
	
	public void add(int n1, int n2) {
		
		this.num1=n1;
		
		int n3 = n1+n2;
		
		System.out.println("Sum of n1 and n2 is " + n3);
	}
	
	public void add(int a, int b, int c) {
		
		int d = a+b+c;
		
		System.out.println("Sum of a,b,c value is" + d);
	}
	
	public static void main(String[] args) {
		Overloading o1 = new Overloading();
		
		o1.add(10, 5);
		o1.add(10, 10, 10);
	
	}

}
