class CSE
{
	CSE()
	{
		new CSE(20); /*or can use this(20)*/
		System.out.println("Constructor 1");
	}
	CSE(int a)
	{
		this(25,30); /* new CSE(25,30)*/
		System.out.println("Constructorj 2");
	}
	CSE(int a,int b)
	{
		System.out.println("Constructor 3");
	}
	public static void main(String[] args)
	{
		CSE ob = new CSE();
		
		
	}
}