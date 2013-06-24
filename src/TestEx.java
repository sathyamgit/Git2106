class A
{
	static void f1()
	{
		System.out.println("super class");
	}
}
class B extends A
{
	static void f1()
	{
		System.out.println("sub -class");
	}
}

public class TestEx {
	public static void main(String[] args) {
		A a=new A();
		a.f1();
		B b=new B();
		b.f1();
		A a1 =new B();
		a1.f1();
		B b1=new B();
		b1.f1();
		
		
		
		
		
		
	}

}
