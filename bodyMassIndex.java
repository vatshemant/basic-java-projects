package tiny;
import java.util.Scanner;

public class io{
//CALCULATING BMI OF A PERSON
public static void main(String[] args){
		Scanner read=new Scanner(System.in); 
		int a,b;
		double c;
		
		System.out.println("enter you weight");
		a=read.nextInt();
		System.out.println("enter your height");
		b=read.nextInt();
		b=b/100;
		c=(a/(b^2));
		System.out.println("the calculated BMI is=" + c);
	
		}
		
		
           }
   
