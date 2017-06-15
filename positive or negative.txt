package tiny;
import java.util.Scanner;

public class io{

public static void main(String[] args){
		Scanner read=new Scanner(System.in); 
		int x ;
		System.out.println("enter any number to check whether it is positive or not:");
		x=read.nextInt();
		if(x>0){
	System.out.println("the entered number is positive");
		}  else if(x<0){
			System.out.println("the given number is negative");
		}
           }
   }