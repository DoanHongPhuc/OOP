import java.util.Arrays;
import java.util.Scanner;
public class Ex56 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int length=scanner.nextInt();
		int arr[]= new int[length];
		for(int i=0;i<length;i++) {
			System.out.println("Enter the" +i+"-th element of array: ");
			int a=scanner.nextInt();
			arr[i]=a;
		}
		Arrays.sort(arr);
		System.out.println("Modified arr[] :"+ Arrays.toString(arr));
		int sum=0;
		double avg=0;
		for (int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		avg=sum/arr.length;
		System.out.println("The Sum of Array: "+ sum +", Average value of array elements: "+avg);
		scanner.close();
	}

}
