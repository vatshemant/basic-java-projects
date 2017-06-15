package tiny;
import java.util.Scanner;

public class io{

public static void main(String[] args){
		Scanner read=new Scanner(System.in); 
		 int[] numbers = new int[]{207, 3065, 2577, 353, -16, 601, -10};
	      
	       int sum = 0;
	       for(int i=0; i < numbers.length ; i++)
	        sum = sum + numbers[i];
	       
	        double average = sum / numbers.length;
	        System.out.println("Average value of the array elements is : " + average); 
		
}
		
}
           
   