
import java.util.Scanner;

public class io{

public static void main(String[] args){
		Scanner read=new Scanner(System.in); 
		int x,d1,d2,d3,r;
		System.out.println("ENTER number between 0 to 1000");
		
		x = read.nextInt();
        d1=x%10;
        r=x/10;
        d2=r%10;
        r=r/10;
        d3=r%10;
        System.out.println("THE SUM OF DIGITS IS  " + (d1+d2+d3));
	
		}  
}