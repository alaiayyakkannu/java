import java.util.Scanner;

public class Ques35 {
    
  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of sides on the polygon: ");
        int ns = sc.nextInt();
        System.out.print("Input the length of one of the sides: ");
        double side = sc.nextDouble();
        System.out.print("The area is: " + polygonArea(ns, side)+"\n");
    }
    public static double polygonArea(int ns, double side) {
        return (ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns)));
    }
}