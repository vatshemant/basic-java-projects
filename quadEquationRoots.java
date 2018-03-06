package tiny;
import java.util.Scanner;

public class io{

public static void main(String[] args){
		Scanner read=new Scanner(System.in); 
		int a,b,c;
		double d;
		System.out.println("Enter the value for a");
		a=read.nextInt();
		System.out.println("Enter the value for b");
		b=read.nextInt();
		System.out.println("Enter the value for c");
		c=read.nextInt();
			
		d= (b*b)-(4*a*c);
		if(d>0){
			System.out.println("root 1 for the equation is=" +(-b+ Math.pow(d,0.5)/2*a) );
			System.out.println("\nroot 2 for the equation is=" +(-b- Math.pow(d,0.5)/2*a ));
		
}
		else if(d==0){
			System.out.println("Roots of the given equation is="+(-b/2*a));
		}
		
		else{System.out.println("The equation has no real roots");}
		}
		
		
           }
   