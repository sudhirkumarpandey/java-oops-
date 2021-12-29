class A
{
	A(int i)
	{
		System.out.println("A(int)");
	}
}

class J extends A 
{
	J(int i)
	{
		this();
		System.out.println("J(int)");
	}
	J()
	{
		super(9);
		System.out.println("J()");
	}
	
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		System.out.println("----------");
		J obj1 = new J(90);
		System.out.println("----------");
		J obj2 = new J();
	}
}
