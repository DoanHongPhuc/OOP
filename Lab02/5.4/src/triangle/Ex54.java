package triangle;
import java.util.Scanner;
public class Ex54 {
	public static void main(String[] args){
        System.out.println("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.next());
        for(int i=0;i<num;i++){
            String s="";
            for(int j=0;j<num-i;j++){
                s=s+" ";
            }
            for(int k=0;k<2*i+1;k++){
                s=s+"*";
            }
            System.out.println(s);
        }
        scanner.close();
    }

}
