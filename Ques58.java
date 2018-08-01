import java.util.*;
 public class Ques58 {
     public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
     System.out.print("Input a Sentence: ");
	 String line = sc.nextLine();
	 String upper_case_line = ""; 
       Scanner sc1 = new Scanner(line); 
         while(sc1.hasNext()) {
             String word = sc1.next(); 
             upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
         }
      System.out.println(upper_case_line.trim()); 
    }
}