class A
{
	A()
	{
		System.out.println("A()");
	}

	{
		System.out.println("IIB");
	}
}

class U 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("--------");
		A a2 = new A();
	}
}

/*
	1. all IIBs statments are moving into constructor body after super calling statement.
	2. no IIBs inside a class file. content of IIB moving into every constructor, 
		if constructor's first statement is super calling tatement.

	3. IIB statements are not incorporating inside a constructor, 
	   if constructor's first statement is this calling statement


*/





