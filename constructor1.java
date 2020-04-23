class A
{
    A()
    {
        System.out.println("0 arg cons of class A");
    }
    A(int a)
    {
        System.out.println("1 arg cons of class A");
    }
    
    
}
class B extends A
{
    B()
    {
        System.out.println("0 arg cons class B");
    }
    public static void main(String[] args) {
        new B();
    }
    
}
/*
output: 
0 arg cons of class A **only 0 arg cons of parent will exceute**
0 arg cons of class B
*/
class C
{
    {
        System.out.println("class C instance block");
    }
    C() {
        System.out.println("class C 0 arg cons");
    }
}
class D extends C
{
    {
        System.out.println("class D instance block");
    }
    static {
        System.out.println("class D static block");
    }
    public static void main(String[] args) {
        new C();
    }
    


}
/*
output:
class D static block
class C instance block
0 arg cons class C
*/
