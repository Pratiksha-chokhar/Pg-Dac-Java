import java.util.Scanner;
public class DecimaltoBinary {

	public static void main(String[] args) {
		
		System.out.println("Enter no : ");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int input = n;
		String str ="";
				int t;
		while(n>0)
		{
			t=n%2;
			n=n/2;
			str = t + str;
		}
		System.out.println("Binary of "+input+" is :"+ str);
	}

}
