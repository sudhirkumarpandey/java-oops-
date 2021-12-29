class A
{
	A()
	{
		super();
		System.out.println("A()");
	}
}
class F extends A 
{
	F()
	{
		super();
		System.out.println("F()");
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("--------");
		F f1 = new F();
	}
}


/*
	1. constructors, IIBs and SIBs are not inheriting to the sub class
	2. every class should have a min one constructor. if we are developing any constructor, 
	   then compiler is developing one default constructor. 
	   default constructor is always no arg constructor.
	3. in every constructor body, first statement should be either super calling statement or
	   this calling statement.
	4. super calling statements ==>
	   
	   super();
	   super(10);
	   super(1, 0);
	   super("abc");
	   super(10, "abc");


	5. this calling statements ==>
	   
	   this();
	   this(10);
	   this(1, 0);
	   this("abc");
	   this(10, "abc");

	6. if at all constructor's first statement is not a super calling statement 
	   and not a this calling statement, then compiler keeps super() as a first statement
	   in the constructor's body.


	7. 	super();  is a calling statement to super class no arg constructor.

	8. super class constructor not inheriting to sub class.
	   sub class constructor only calling to super class constructor.

	9. if there is a class without extends, then compiler keeps extends Object. Object is a 
	   built-in class and available in the java.lang package. It contains the common methods
	   which are required for every class.

	10. inside an Object class there is only no arg constructor without super calling statement.

	11. Object class is compiled by different compiler and not incorporated super() 
	    statement in a constructor's body.
	
	
	12. Object class is a super most class for every class. Object class members inherited to
	    every class. All members of an Object class available in every class.


*/