import java.util.Iterator;
import java.util.TreeSet;

public class StringLenMain {

	public static void main(String[] args) {
		StringComparator comp = new StringComparator();
		TreeSet<String> set = new TreeSet<>(comp);
				
		set.add("Java");
		set.add("C");
		set.add("C++");
		set.add("Php");
		set.add("Perl");
		set.add("Python");
		set.add("Json");
		
		Iterator<String> iterator = set.iterator();
		while( iterator.hasNext() ){
			System.out.println(iterator.next());
		}
	}
}