class A
{
	int i = 25;
	void test1()
	{
		System.out.println("from A");
	}
}
class D extends A 
{
	int j = 500;
	void test2()
	{
		System.out.println("from D");
	}
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.test1();
		d1.test2();
		System.out.println(d1.i + ", " + d1.j);
		System.out.println("main end");
	}
}
