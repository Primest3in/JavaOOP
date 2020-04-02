class A
{
	private void m1()
	{
		System.out.println("m1");
	}
	void m2()
	{
		this.m1();
	}
	
}
class B extends A
{
	public static void main(String[] args)
	{
		B ob = new B();
		ob.m2();
	}
}