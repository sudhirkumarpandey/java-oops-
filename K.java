class A
{
	A()
	{
		System.out.println("A()");
	}
}

class K extends A 
{
	K(int i)
	{
		System.out.println("K(int)");
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("----------");
		K obj1 = new K(90);
	}
}
