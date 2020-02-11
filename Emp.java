//package jdbcPack;

public class Emp {
	int id;
	String name;
	float salary;
	Emp(){}
	Emp(int id,String name, float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void calculatesalary()
	{
		System.out.println("salary is calculated"+(salary+200));
	}

	public static void main(String[] args) {
		Emp e=new Emp();
		e.calculatesalary();

	}

}
