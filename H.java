class A
{
	A(int i)
	{
		System.out.println("A(int)");
	}
}

class H extends A 
{
	H(int i)
	{
		super(i);
		System.out.println("H(int)");
	}
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		System.out.println("----------");
		H h1 = new H(90);
	}
}
