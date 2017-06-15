package tiny;
import java.util.Scanner;

public class io {
	public static double area(double x){
		return ((6*x*x)/(4*Math.tan(Math.PI/6)));
		
}
	public static void main(String[] args){
		Scanner read=new Scanner(System.in) ;
		double x,y;
		System.out.println("ENTER DIMENSION OF SIDE OF HEXAGON: ");
		x= read.nextDouble();
		System.out.println("THE AREA OF HEXAGON IS:" + area(x));
	}
		
}  
	