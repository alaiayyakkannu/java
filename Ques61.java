import java.util.*;
 public class Ques61 {
     public static void main(String[] args){	
     Scanner sc = new Scanner(System.in);
     System.out.print("\nInput a word: ");
	 String word = sc.nextLine();
	 word = word.trim();
	 String result = ""; 
     char[] ch=word.toCharArray();  
	 for (int i = ch.length - 1; i >= 0; i--) {
			 result += ch[i];
		 }
	 System.out.println("Reverse word: "+result.trim()); 
	 }			
}