import java.util.Scanner;
public class Ex55 {
	public static void main(String[]args) {
		int exit=0;
		String[] A={"1","Jan.","Jan","January","3","March","Mar.","Mar","5","May","May.","7","July","Jul","Jul.",
				"8","August","Aug.","Aug","10","October","Oct.","Oct","12","December","Dec","Dec."};
		String[] B= {"2","February","Feb.","Feb"};
		String[] C= {"4","April","Apr","Apr.","6","June","Jun","Jun.","9","September","Sept.","Sept","11","November","Nov","Nov."};
		Scanner scanner=new Scanner(System.in);
		while(exit==0) {
			System.out.println("Enter your months: ");
			String month= scanner.nextLine();
			System.out.println("Enter your year: ");
			int year=scanner.nextInt();
			
			for(int i=0;i<A.length;i++) {
				if(month.equals(A[i])) {
					System.out.println("31");
					exit=1;
					break;
				}
			}
			for(int i=0;i<C.length;i++) {
				if(month.equals(C[i])) {
					System.out.println("30");
					exit=1;
				}
			}
			for(int i=0;i<B.length;i++) {
				if(month.equals(B[i])) {
					if(year%400==0) {
						System.out.println("29");
						
					}
					else if(year%4==0||year%100!=0) {
						System.out.println("29");
					}
					else {
						System.out.println("28");
					}
				}
				exit=1;
			}
			
			
			
		}
		
	}

}
