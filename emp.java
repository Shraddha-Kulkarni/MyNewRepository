package jdbcPack;

public class Employee {
	int id;
	String name;
	float salary;
	Employee(){}
	Employee(int id,String name, float salary)
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
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.calculatesalary();

	}

}
