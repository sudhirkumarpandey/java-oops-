class A
{
	A()
	{
		System.out.println("A()");
	}

	A(int i)
	{
		this();
		System.out.println("A()");
	}

	{
		System.out.println("A-IIB");
	}
}
class B extends A
{
	B()
	{
		this(90);
		System.out.println("B()");
	}

	B(int i)
	{
		System.out.println("B()");
	}

	{
		System.out.println("B-IIB");
	}
}

class W 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("--------");
		A a2 = new A(10);
		System.out.println("--------");
		B b1 = new B();
		System.out.println("--------");
		B b2 = new B(20);
	}
}

