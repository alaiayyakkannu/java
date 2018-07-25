import java.util.*;
import java.util.Scanner;
public class Ques114 {
     public static void main(String[] arg) 
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	 String str = sc.next();
	System.out.println("Enter a offset"); 
		 int offset = sc.nextInt();

     char[] A = str.toCharArray();
     int len = A.length;
     offset %= len;
     reverse(A, 0, len - offset - 1);
     reverse(A, len - offset, len - 1);
     reverse(A, 0, len - 1);
     System.out.println("\n"+Arrays.toString(A));
    }

    private static void reverse(char[] str, int start, int end) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}