import java.util.*;
 public class Ques62 {
 public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = sc.nextInt();  
		System.out.print("Input the second number: ");
		int y = sc.nextInt(); 
		System.out.print("Input the third number : ");
        int z = sc.nextInt(); 
        System.out.println((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20));
    }
}