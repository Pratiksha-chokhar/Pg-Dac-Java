import java.util.Scanner;

public class BinarytoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter binary number:");
		Scanner s = new Scanner(System.in);
		int bnum = s.nextInt();
		int num = bnum;
		int rem=0, sum=0;
		int i=0;
		
		while(bnum>0){
			rem = bnum%10;
			bnum = bnum/10;
			sum = sum+ (int) (rem * Math.pow(2, i));
			i++;
		}
		
		System.out.println("Output of "+num+" is " + sum);
		
	}

}
