package SwitchAssignment;
import java.util.Scanner;
public class Number_of_Days {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the month name : ");
		String st = sc.next();
		switch(st) {
		case "January" , "january" , "jan": System.out.println("Jan Total number of days are 31"); 
				break;
		case "Febuary" , "febuary" , "feb": System.out.println("Feb Total number of days are 28/29");
				break;
		case "March" , "march": System.out.println("March Total number of days are 31");
				break;
		case "April" , "april": System.out.println("April Total number of days are 30");
				break;
		case "May" , "may": System.out.println("May Total number of days are 31");
				break;
		case "June" , "june": System.out.println("June Total number of days are 30");
				break;
		case "July" , "july": System.out.println("July Total number of days are 31");
				break;
		case "August" , "august": System.out.println("August Total number of days are 31");
				break;
		case "September" , "september": System.out.println("September Total number of days are 30");
				break;
		case "October" , "october": System.out.println("October Total number of days are 31");
				break;
		case "November" , "november":System.out.println("November Total number of days are 30");
				break;
		case "December" , "december": System.out.println("December Total number of days are 31");	
				break;
		default: break;
		}

	}

}
