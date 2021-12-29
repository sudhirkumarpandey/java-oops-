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
class Y 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("---------");
		A a1 = new A();
	}
}
