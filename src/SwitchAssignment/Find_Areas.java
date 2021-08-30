package SwitchAssignment;
import java.util.Scanner;
public class Find_Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Type number for the following operation you want to perform :");
		System.out.println("1.Area of Square 2.Area of Right angle Triangle 3.Area of Circle 4.Area of Rectangle 5.Perimeter of Square 6.Circumference of the Circle :");
	    int ch=sc.nextInt() ;
	    switch(ch) {
	    case 1:System.out.println("Enter the Side of the square: ");
			   int s = sc.nextInt();
			   int A = s*s;
			   System.out.println("Area of Square: "+A);
			   break;
	    case 2:System.out.println("Enter the Height and Base for the Triangle:");
				int h = sc.nextInt();
				int b = sc.nextInt();
				double A1 = 0.5*h*b;
				System.out.println("Area of Triangle: "+A1);
				break;
	    case 3:	System.out.println("Enter the Radius of the Circle: ");
	    		int r = sc.nextInt();
	    		double A2 = 3.14*r;
	    		System.out.println("Area of Circle:"+A2);
	    		break;
	    case 4:	System.out.println("Enter the Length and Width of the Rectangle: ");
	    		int l = sc.nextInt();
	    		int w = sc.nextInt();
	    		double A3 = 0.5*l*w;
	    		System.out.println("Area of Rectangle:"+A3);
	    		break;
	    case 5: System.out.println("Enter of side of the Square: ");
	    		int pd = sc.nextInt();
	    		double A4 = 4*pd;
	    		System.out.println("Perimeter of Square: "+A4);
	    		break;
	    case 6: System.out.println("Enter the radius for Circumference of the circle:");
	    		int r1 = sc.nextInt();
	    		double A5 = 2*3.14*r1;
	    		System.out.println("Area of Circumference of Circle: "+A5);
	   		
	    default: break;
	    
	    }

	}

}
