class A
{
	A()
	{
		System.out.println("A()");
	}
	static
	{
		System.out.println("A-SIB");
	}
	{
		System.out.println("A-IIB");
	}
}

class B extends A
{
	B()
	{
		System.out.println("B()");
	}
	{
		System.out.println("B-IIB");
	}
	static
	{
		System.out.println("B-SIB");
	}
}
class Z1 
{
	static
	{
		System.out.println("Z1-SIB");
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("---------");
		A a1 = new A();
		System.out.println("---------");
		A a2 = new A();
		System.out.println("---------");
		B b2 = new B();
	}
}
