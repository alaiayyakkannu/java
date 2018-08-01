import java.lang.*;
import java.util.Scanner;
 public class Ques72 {
 public static void main(String[] args)
 {
	
	Scanner sc=new Scanner(System.in);
        System.out.printf("Enter a string \n");
        String str1 = sc.next();    
	int len = str1.length();
	if(len >= 3)
		System.out.println( str1.substring(0, 3));
	else if(len == 1)
		System.out.println( (str1.charAt(0)+"##"));
	else
		System.out.println("###");
	}
}