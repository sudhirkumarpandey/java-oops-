class A
{
	A()
	{
		System.out.println("A()");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B()");
	}
}
class C extends B
{
	C()
	{
		System.out.println("C()");
	}
}
class M 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		C c1 = new C();
		System.out.println("----------");
		B b1 = new B();
		System.out.println("----------");
		A a1 = new A();
		System.out.println("main end");
	}
}

/*
	1. constructor chain: chain of constructors involving while one 
						  object is creating to any perticular class.
	  one constructor from a class to which object is creating,
	  one constructor from a super class of a class to which object is creating,
	  one constructor from a super class to super class of a class to which object is creating,
	  like wise it continues till to Object class. 

	2. by default only one constructor will be executing from any class which is involving in the
	   constructor chain

	3. by using this calling statement we can achieve execution of multiple constructors
	   from any class which is involving in the constructor chain

	4. in any object creation, whichever constructor involving in the constructor chain, 
	   it is executing only one time. not more than one time.

	5. executing same constructor more than one time to the same object creation doesn't required.

	


*/