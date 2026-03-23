package encaps;

public class Encapsulation {
	
	private String name;
	private int salary;
	
	public String getName()
	{
		return name;
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getSalary()
	{
		return salary;
		
	}
	
	public void setSalary(int salary) {
		this.salary=salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation increment = new Encapsulation();
		
		increment.setName("Madhuvanthi");
		increment.setSalary(5400);
		
		System.out.println("Name : " +increment.getName());
		System.out.println("Increment amount : " +increment.getSalary());
		

	}

}
