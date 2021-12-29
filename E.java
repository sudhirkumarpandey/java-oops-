class A
{
	int i = 25;
	static int m = 55;
	void test1()
	{
		System.out.println("from A");
	}
	static void method1()
	{
		System.out.println("from A.method1");
	}
}
class E extends A 
{
	int j = 500;
	static int n = 1500;
	void test2()
	{
		System.out.println("from E");
	}
	static void method2()
	{
		System.out.println("from E.method2");
	}
	public static void main(String[] args) 
	{
		E e1 = new E();
		e1.test1();
		e1.test2();
		System.out.println(e1.i + ", " + e1.j);
		E.method1();
		E.method2();
		System.out.println(E.m + ", " + E.n);
		System.out.println("main end");
	}
}

/*
	1. every member of super class inheriting to sub class.
*/