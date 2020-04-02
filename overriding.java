class A
{
	void m1(int a, int b)
	{
		System.out.println("method m1: "+ (a-b));
	}
	
}
class B extends A
{
	void m1(int a,int b)
	{
		System.out.println("method m1: "+(a+b));
		
	}
	public static void main(String[] arags)
	{
		A ob = new B();
		ob.m1(5,6);
	}
}. 