package tiny;
import java.util.Scanner;

public class io{

public static void main(String[] args){
		Scanner read=new Scanner(System.in); 
	int x,i,y;
	System.out.println("enter a NUMBER....");
		x=read.nextInt();
		for(i=1; i<=x ; i++){
			y=i*i*i;
			System.out.println("Number is: " + i + "  and its cube is  " + y );
		}
		
		
           }
   }