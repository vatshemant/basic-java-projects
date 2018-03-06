package tiny;
import java.util.Scanner;

public class io{

public static void main(String[] args){
		Scanner read=new Scanner(System.in); 
		int x;
		double y;
		System.out.println("ENTER inch value:");
		x=read.nextInt();
		y=(x*0.0254);
		System.out.println("required meter value is" + y);
}
	
		}  
	