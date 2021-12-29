class A
{
	A(int i)
	{
		System.out.println("A(int)");
	}
}

class I extends A 
{
	I(int i)
	{
		this();
		System.out.println("I(int)");
	}
	I()
	{
		System.out.println("I()");
	}
	
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		System.out.println("----------");
		I obj1 = new I(90);
		System.out.println("----------");
		I obj2 = new I();
	}
}
