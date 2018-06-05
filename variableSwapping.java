package tiny;
import java.util.Scanner;

public class io {
	public static void main(String[] args){
		Scanner read=new Scanner(System.in) ;
		int x,y;
		System.out.println("ENTER TWO NUMBERS:");
		x= read.nextInt();
	    y= read.nextInt();
	    System.out.println("VALUES BEFORE SWAPPING:  " + "X= " + x + "  Y= " + y);
	    x=x+y;             //swapping variables.
	    y=x-y;
	    x=x-y;
	    System.out.println("VALUES AFTER SWAPPING:   " + "X= " + x + "  Y= " + y);
		
		
		
		
		
		
		
		
		}
	  }
	
