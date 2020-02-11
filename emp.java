package jdbcPack;

public class emp {
	int id;
	String name;
	float salary;
	emp(){}
	emp(int id,String name, float salary)
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
		emp e=new emp();
		e.calculatesalary();

	}

}
