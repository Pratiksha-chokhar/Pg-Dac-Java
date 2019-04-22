import java.util.Iterator;
import java.util.TreeSet;

public class TreeSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		TreeSet<Integer> numbers = new TreeSet<>();
//		numbers.add(100);
//		numbers.add(700);
//		numbers.add(40);
//		numbers.add(30);
//		numbers.add(90);
//		
//		System.out.println(numbers);
		
		
		Employee s1 = new Employee(101,"Anuj", "IT");
		
		System.out.println(s1);
		
		
		Employee s2 = new Employee(201,"Pavan", "CSE");
		
		s1.setEmpName("John");
		
		Employee s3 = new Employee(151,"Jainish", "Mech");
		Employee s4 = new Employee(131,"Susan", "Arts");
		Employee s5 = new Employee(300,"John Doe", "IT");
		

		letsCompare doit = new letsCompare();
		
		TreeSet<Employee> empSet = new TreeSet<Employee>(doit);
		
		empSet.add(s1);
		
		empSet.add(s2);
		empSet.add(s3);
		empSet.add(s4);
		empSet.add(s5);
		
//
//		empSet.forEach(obj -> {
//			
//			System.out.println(obj.getEmpName());
//		});

//		for(Employee ob : empSet){
//			
//			System.out.println(ob.getEmpName());
//		}
//		
		Iterator<Employee> ep = empSet.iterator();
		
		
		
		while(ep.hasNext()){
			Employee t = ep.next();
			System.out.println("My name is "+t.getEmpName()+" and ID is :" + t.getEmpID());
		}

	}
	

	


}
