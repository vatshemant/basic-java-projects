package tiny;
import java.util.Scanner;

public class io{

public static void main(String[] args){
		Scanner read=new Scanner(System.in); 
	int x;
	System.out.println("enter a number to fetch the name of the day ");
	x=read.nextInt();
	switch(x){
	case 1: System.out.println("MONDAY");break;
	case 2: System.out.println("TUESDAY");break;
	case 3: System.out.println("WEDNESDAY");break;
	case 4: System.out.println("THURSDAY");break;
	case 5: System.out.println("FRIDAY");break;
	case 6: System.out.println("SATURDAY");break;
	case 7: System.out.println("SUNDAY");break;
	default:System.out.println("INVALID ENTRY"); 
	break;
	
	}
		
		
		
		
           }
   }