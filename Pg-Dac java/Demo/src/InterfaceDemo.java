import java.util.ArrayList;

interface a
{
	void show();
}

public class InterfaceDemo {
public static void main(String[] args) {
	/*ArrayList<Integer> a=new ArrayList<>();
	a.add(1);
	a.add(2);
	a.add(3);*/
	/*for(int i:a)
	{
		System.out.println("i:"+i);
	}*/
	//a.forEach(i->System.out.println("i: "+i));
	a a1=() ->System.out.println("show method");//
	
	a1.show();
		
		
	};
}

