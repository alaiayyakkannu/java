import java.util.Scanner; 
class Ques13
{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter length and bredth");  
    double l=sc.nextDouble(); 
    double b=sc.nextDouble();

    {
	System.out.println("Perimeter is ="+(2*(l+b))) ;
	
	System.out.println("Area  is ="+(l*b)) ;
    }
    sc.close();
}
}