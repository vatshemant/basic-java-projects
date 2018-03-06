package tiny;
import java.util.Scanner;

public class io {
	public static void main(String[] args){
		Scanner read=new Scanner(System.in) ;
		int x;
		System.out.println("ENTER A NUMBER");
		x=read.nextInt();
	for(int i=0;i<=10;i++){
		
		System.out.println(x + "x" + i + "=" + (x*i));
		
		}
	  }
	}