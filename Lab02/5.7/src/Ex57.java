import java.util.Scanner;
public class Ex57 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter size of matrix: \n");
		System.out.print("Enter a: \n");
		int a= scanner.nextInt();
		System.out.print("Enter b:\n");
		int b= scanner.nextInt();
		System.out.print("Enter first matrix:\n");
		int matrix1[][]= new int[a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.print("matrix1["+i+"]"+"["+j+"]");
				matrix1[i][j]=scanner.nextInt();
			}
		}
		
		System.out.print("Enter second matrix:\n");
		int matrix2[][]= new int[a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.print("matrix2["+i+"]"+"["+j+"]");
				matrix2[i][j]=scanner.nextInt();
			}
		}
		
		System.out.println("Add two matries: ");
		for(int i=0;i<a;i++) {
			System.out.print("|");
			for(int j=0;j<b;j++) {
				matrix1[i][j]+=matrix2[i][j];
				if(j==b-1) {
				System.out.print(matrix1[i][j]);
				}
				else System.out.print(matrix1[i][j]+"\t");
			}
			System.out.print("|");
			System.out.print("\n");
		}
		
		
		scanner.close();
		
	}
}
