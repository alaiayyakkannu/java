import java.util.Scanner;
public class Ques32 {
 public static void main( String args[] )    
    {
        Scanner sc = new Scanner(System.in);
        int number1;        
        int number2; 
        System.out.print( "Input first integer: " );      
        number1 = sc.nextInt();   
 
        System.out.print( "Input second integer: " );       
        number2 = sc.nextInt();             
        
        if ( number1 == number2 )           
            System.out.printf( "%d == %d\n", number1, number2 );  
        if ( number1 != number2 )          
            System.out.printf( "%d != %d\n", number1, number2 );  
        if ( number1 < number2 )          
            System.out.printf( "%d < %d\n", number1, number2 );  
        if ( number1 > number2 )          
            System.out.printf( "%d > %d\n", number1, number2 );  
        if ( number1 <= number2 )          
            System.out.printf( "%d <= %d\n", number1, number2 );  
        if ( number1 >= number2 )          
            System.out.printf( "%d >= %d\n", number1, number2 );  
    }
  }
  