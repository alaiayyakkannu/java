import java.util.*;
 public class Ques52 {
 public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = sc.nextInt();  
		System.out.print("Input the second number: ");
		int y = sc.nextInt(); 
		System.out.print("Input the third number : ");
        int z = sc.nextInt(); 
        System.out.print("The result is: "+sumoftwo(x, y, z));
		System.out.print("\n");
    }
    
    public static boolean sumoftwo(int p, int q, int r)
      {	
         return ((p + q) == r || (q + r) == p || (r + p) == q);	
	   }
}