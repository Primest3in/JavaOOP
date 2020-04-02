abstract class A
{
	static 
	{
		System.out.println("static block A");
		
	}
	{
		System.out.println("Instance block A");
	}
	A()
	{
		System.out.println("0 arg cons A");
	}
	
}
class B extends A
{
	static
	{
		System.out.println("static block B");
	}
	{
		System.out.println("Instance block B");
	}
	B()
	{
		System.out.println("0 arg cons B");
	}
	
}
class C extends B
{
	public static void main(String[] args)
	{
		B ob = new C();
		System.out.println();
		B ob1 = new C();
		
	}
}