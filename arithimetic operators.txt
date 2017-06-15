package tiny;
import java.util.Scanner;

public class io {
	public static void main(String[] args){
		Scanner read=new Scanner(System.in) ;
		int x,y;
		System.out.println("enter first number");
		x=read.nextInt();
		System.out.println("enter second number\n");
		y=read.nextInt();
		System.out.println("OUTPUT\n");
		System.out.println(x + "+" + y + "=" + (x+y));
		System.out.println(x + "-" + y + "=" + (x-y));
		System.out.println(x + "x" + y + "=" + (x*y));
		System.out.println(x + "/" + y + "=" + (x/y));
		System.out.println(x + "mod" + y + "=" + (x%y));
		
	        }
	}