class A{
	A()
	{
	
		System.out.println("A class constructor.");
    }
	A(int a)
	{
		this();
		System.out.println(" A class parameterised constructor");
	}
}

class B extends A
{
	B()
	{
		this(4);
		System.out.println(" B class constructor");
	}
	B(int a)
	{
		super(4);
		System.out.println(" B class parameterised constructor");
	}
}

public class Test {
public static void main(String[] args) {
	B b=new B();
}
}
