package ConditionalAssignment;
import java.util.Scanner;
public class Leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		     int year;
		      System.out.println("Enter an Year : ");
		      Scanner sc = new Scanner(System.in);
		      year = sc.nextInt();

		      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))//if 
		         System.out.println("It is a leap year");
		      else
		         System.out.println("It is not a leap year");
		   
		
	}

}
