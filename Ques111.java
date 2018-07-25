import java.util.Scanner;
public class Ques111 {
     public static void main(String[] arg) 
	 {
	   int x, y ;
	   Scanner sc = new Scanner(System.in);	
	   System.out.print("Input first number: ");
	   x = sc.nextInt(); 
	   System.out.print("Input second number: ");
	   y = sc.nextInt(); 
      while(y != 0){
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        System.out.print("Sum: "+x); 
		System.out.print("\n");     	
	}	
}