class A
{
	A(int i)
	{
		System.out.println("A(int)");
	}
}

class G extends A 
{
	G(int i)
	{
	    super();
		System.out.println("G(int)");
	}
	public static void main(String[] args) 
	{
		A a1 = new A(92);
		System.out.println("----------");
		G g1 = new G(90);
	}
}
