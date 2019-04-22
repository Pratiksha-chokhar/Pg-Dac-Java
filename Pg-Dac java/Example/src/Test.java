
class Parent {
	Parent(int x){
		System.out.println("Parent"+x);
	}
}


class Child extends Parent{

	String name,name1;
	public Child(int x,int y){
		super(x);
		System.out.println("Child"+x);
	}
	
	int display()
	{
		
		return name.compareTo(name1);
		
	}
}

public class Test{
public static void main(String[] args) {
		
		Child c=new Child(10,20);
		c.name="Mrityumnklajd";
		c.name1="Chiriiiiiiiiihyu";
		System.out.println(c.display());
		
	}
}