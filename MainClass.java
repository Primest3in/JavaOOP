class employee
{
	String a,b;
	double c;
	
	employee(String s, String ss, int a)
	{
		this.a = s;
		this.b = ss;
		this.c = a;
		
	}
	employee()
	{
		this.a = "0";
		this.b = "0";
		this.c = 0;
	}
	String getName()
	{
		return a;
	}
	String getEmpCode()
	{
		return b;
	}
	double Salary()
	{
		return c;
	}
	void setName(String s)
	{
		this.a = s;
		
	}
	void setEmpCode(String s)
	{
		this.b = s;
		
	}
	void setSalary(int a)
	{
		this.c = a;
	}
	String getInfo()
	{
		return "Name: "+a+", EmpCode: "+b+", Salary: "+c;
	}
	
	
}
class MainClass
{
	public static void main(String[] args)
	{
		employee emp = new employee("A","KKK",30);
		System.out.println("Name: "+emp.getName()+", EmpCode: "+emp.getEmpCode()+", Salary: "+emp.Salary());
		emp.setName("B");
		emp.setEmpCode("LLL");
		emp.setSalary(40);
		System.out.println(emp.getInfo());
		emp = new employee();
		System.out.println(emp.getInfo());
		
	}
}