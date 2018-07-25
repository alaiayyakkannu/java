import java.util.Scanner; 
class Ques10
{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter 4 number");  
    double a=sc.nextDouble(); 
    int b=sc.nextInt(); 


    {
	System.out.println(a * (1 - (1.0/b) + (1.0/b+2) - (1.0/b+2) + (1.0/b+2) - (1.0/b+2))) ;
    }
    sc.close();
}
}