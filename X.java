class A
{
	static
	{
		System.out.println("A-SIB");
	}
}

class B extends A
{
	static
	{
		System.out.println("B-SIB");
	}
}
class X 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("---------");
		B b1 = new B();
	}
}
