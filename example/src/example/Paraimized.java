package example;

public class Paraimized {
	int a;
	int b;
	
	Paraimized(int num1,int num2){
		a=num1;
		b=num2;
		
	}
	
	public void add()
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Paraimized p1 = new Paraimized(5,7);
		Paraimized p2 = new Paraimized(20,40);
		
		p1.add();
		p2.add();

	}

}
