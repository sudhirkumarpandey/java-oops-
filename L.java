class A
{
}

class L extends A 
{
	L(int i)
	{
		System.out.println("L(int)");
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("----------");
		L obj1 = new L(90);
	}
}
