class CSE
{
	CSE()
	{
		this(1,2);
		System.out.println("Constructor 1");
	
	}
	CSE(int a,int b)
	{
		
		System.out.println("constructor 2: "+(a+b));
		
	}
	{
		System.out.println("Instance Block");
	}
	static{
		System.out.println("Static block");
	}
	public static void main(String[] args)
	{
		new CSE();
		new CSE();
		
		
	}

}
// static block   #static block ekbar print hoy
//instance block
//constructor 2: 3
// constructor 1
//instance block
//constructor 2: 3
// constructor 1