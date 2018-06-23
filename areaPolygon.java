
import java.util.Scanner;

public class io {
	public static double area(double x,double y){
		return ((x*y*y)/(4*Math.tan(Math.PI/x)));
		
}
	public static void main(String[] args){
		Scanner read=new Scanner(System.in) ;
		double x,y;
		System.out.println("ENTER NUMBER OF SIDES OF POLYGON: ");
		x= read.nextDouble();
		System.out.println("ENTER DIMENSION OF SIDE OF POLYGON: ");
		y=read.nextDouble();
		System.out.println("AREA OF POLYGON IS:" + area(x,y));
	}
		
}  
	
