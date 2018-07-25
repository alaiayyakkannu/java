import java.util.Scanner;

public class Ques27 {
public static void main(String args[])
    {
        String octal_num, hex_num;
        int decnum;
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Input a octal number : ");
        octal_num = sc.nextLine();
		
        decnum = Integer.parseInt(octal_num, 8);
        hex_num = Integer.toHexString(decnum);
		
        System.out.print("Equivalent hexadecimal number: "+ hex_num+"\n");
     }
}