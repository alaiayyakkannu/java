import java.util.Scanner; 
class Ques11
{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter radius");  
    double r=sc.nextDouble(); 
    double pi=3.14;

    {
	System.out.println("Perimeter is ="+(2*pi*r)) ;
	
	System.out.println("Area  is ="+(pi*r*r)) ;
    }
    sc.close();
}
}