import java.util.Scanner;
public class Ques108 {
     public static void main(String[] arg) {	
        Scanner sc = new Scanner(System.in);	
       System.out.print("Input a positive integer: ");
        int n = sc.nextInt(); 
		if (n>0)
		{
           System.out.print("The single digit number is: "+(n == 0 ? 0 : (n % 9 == 0 ? 9 : n % 9)));
		}
		System.out.println("\n");  
    }
}