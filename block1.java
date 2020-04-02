class A
{
	static
	{
		System.out.println("Static block A");
	}
	{
		System.out.println("Instance block A");
	}
	A()
	{
		this(15);
		System.out.println("0 arg cons A");
	}
	A(int a)
	{
		System.out.println("1 arg cons A");
		
	}
}
class B extends A
{
	static
	{
		System.out.println("Static block B");
	}
	{
		System.out.println("Instance block B");
		
	}
	B()
	{
		this(15);
		System.out.println("0 arg cons B");
	}
	B(int a)
	{
		System.out.println("1 arg cons B");
	}
}
class C extends B
{
	
	public static void main(String[] args)
	{
		new C();
	}
}