import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		
		
		int number = 5432;
		int temp = number;
		String myWord="", tempString;
		while(temp>0){
			number = temp%10;
			temp = temp/10;
//			tempString = getWord(number);
			tempString = map.get(number);
			myWord = tempString + " " + myWord;
		}
		System.out.println(myWord);
	}
	
	public static String getWord(int num){
		switch(num){
			case 4: return "Four";
			case 5 : return "Five";
			case 6 : return "Six";
			case 7 : return "Seven";
		}
		return "Zero";
	}
}
