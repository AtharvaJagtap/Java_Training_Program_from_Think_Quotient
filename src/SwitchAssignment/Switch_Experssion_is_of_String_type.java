package SwitchAssignment;
import java.util.Scanner;
public class Switch_Experssion_is_of_String_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the game name and see if its indoor or outdoor game : ");
		  String gm=sc.next();
		  switch(gm) {
		  case "chess","snake and ladder","Card game","Puzzle","Carrom": System.out.println("Indoor Game");
		  																	break;
		  case "Football","Basketball","Badminton","Tennnis","Cricket","Baseball": System.out.println("Outdoor Game");
		  																			break;
		  default: break;
		  }

	}

}
