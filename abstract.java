abstract class A
{
	void m1()
	{
		System.out.println("0 arg method of abstract class A");
	}
}
class B extends A
{
	public static void main(String[] args)
	{
		A ob = new B();
		ob.m1();
	}
}
// Abstract class can only be accessible through inheritance..
abstract class C
{
	abstract void m2()
	{
		System.out.println("abstract method of class C");
		
	}
	
}
class D extends C
{
	public static void main(String[] args)
	{
		D ob = new D();
		ob.m2();
	}
	
}