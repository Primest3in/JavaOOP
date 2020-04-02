class A
{
	void m1()
	{
		System.out.println("method m1");
	}
	void m2()
	{
		System.out.println("method m2");
		m1();
	}
	
}
class B extends A
{
	void m3()
	{
		System.out.println("method m3");
		super.m2();
	}
	public static void main(String[] args)
	{
		B ob = new B();
		ob.m3();
	}
}	