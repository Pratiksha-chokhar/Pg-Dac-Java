
public class FindMissingNumber {
	
	public static void main(String[] args) {
		int array[] = {7,2,8,4,6,1,3,9,10};
		int sum = 0;
		
		for(int i=0;i<array.length;i++){
			sum = sum + array[i];
		}
		
		int sum2 = 0;
		for(int i=1;i<=array.length+1;i++)
			sum2 += i;
		
		int result = sum2 - sum;
		System.out.println(result);
	}
}