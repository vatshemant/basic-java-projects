package tiny;
import java.util.Scanner;

public class io{

public static void main(String[] args){
		Scanner read=new Scanner(System.in); 
		int m, n, a, b;
	      
	 
	      System.out.println("Input number of rows of matrix");
	      m = read.nextInt();
	      System.out.println("Input number of columns of matrix");
	      n  = read.nextInt();
	 
	      int array1[][] = new int[m][n];
	      int array2[][] = new int[m][n];
	      int sum[][] = new int[m][n];
	 
	      System.out.println("Input elements of first matrix");
	 
	      for (  a = 0 ; a < m ; a++ )
	         for ( b = 0 ; b < n ; b++ )
	            array1[a][b] = read.nextInt();
	 
	      System.out.println("Input the elements of second matrix");
	 
	      for ( a = 0 ; a < m ; a++ )
	         for ( b = 0 ; b < n ; b++ )
	            array2[a][b] = read.nextInt();
	 
	      for ( a= 0 ; a < m ; a++ )
	         for ( b = 0 ; b < n ; b++ )
	             sum[a][b] = array1[a][b] + array2[a][b]; 
	 
	      System.out.println("Sum of the matrices:-");
	 
	      for ( a = 0 ; a < m ; a++ )
	      {
	         for ( b = 0 ; b < n ; b++ )
	            System.out.print(sum[a][b]+"\t");
	 
	         System.out.println();
	      }
		
	      
}
		
}
           
   