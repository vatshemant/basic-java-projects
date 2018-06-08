
import java.util.Scanner;

public class io{

public static void main(String[] args){
		Scanner read=new Scanner(System.in); 
		int x;
		double y;
		System.out.println("ENTER TEMPRATURE IN FAHRENIET:");
		x=read.nextInt();
		y=((x-32)/1.8);
		System.out.println("THE TEMPRATURE IN CELCIUS IS:" + y);
}
	
		}  
	