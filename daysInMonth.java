package tiny;
import java.util.Scanner;

public class io{

public static void main(String[] args){
		Scanner read=new Scanner(System.in); 
		
		int days= 0; 
        String Name = "Unknown";

        System.out.print("Input a month number: ");
        int month = read.nextInt();

        System.out.print("Input a year: ");
        int year = read.nextInt();

        switch (month) {
            case 1:
                Name = "January";
                days = 31;
                break;
            case 2:
                Name = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 3:
                Name = "March";
               days = 31;
                break;
            case 4:
                Name = "April";
               days = 30;
                break;
            case 5:
                Name = "May";
               days = 31;
                break;
            case 6:
                Name = "June";
                days= 30;
                break;
            case 7:
                Name = "July";
                days = 31;
                break;
            case 8:
                Name = "August";
               days = 31;
                break;
            case 9:
                Name = "September";
                days= 30;
                break;
            case 10:
                Name = "October";
                days = 31;
                break;
            case 11:
                Name = "November";
                days = 30;
                break;
            case 12:
                Name = "December";
                days = 31;
        }
        System.out.print(Name + " " + year + " has " + days+ " days");
		
		}
		
		}
		
		
           
   