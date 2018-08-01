import java.lang.*;
 public class Ques68 {
 public static void main(String[] args)
 {
   String main_string = "Devaganesh 227";
      
   String last_three_chars = main_string.substring(main_string.length() - 3);
   System.out.println(last_three_chars + last_three_chars + last_three_chars + last_three_chars);
  }
    }