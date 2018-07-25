import java.util.Scanner; 
class Ques15
{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter 3 number");  
    int a=sc.nextInt(); 
    int b=sc.nextInt(); 
    


    
	System.out.println("Before swap:  a="+a  +"b="  +b) ;
	b=a+b;
        a=b-a;
        b=b-a;
        System.out.println("Before swap:  a="+a  +"b="  +b) ;
	
    sc.close();
}
}
