import java.util.*; 
import java.io.*; 
 public class Ques84 {
 public static void main(String[] args)
 {
   String string1 = "Devaganesh";
    int slength = 3;
    if (slength > string1.length()) {
      slength = string1.length();
    }

    String subpart = string1.substring(string1.length()-3);
    System.out.println(subpart + string1 + subpart);
  }
}