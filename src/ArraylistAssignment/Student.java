package ArraylistAssignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
public class Student {
private static ArrayList<Student> list;
int id;
int marks;
String name;
public void Data() {
	this.id = id;
	this.name = name;
	this.marks =marks;	
}
public static void getvalue(int id,int marks,String name) {
	ArrayList<Student> al = new ArrayList<>();
	
	for(int i=0;i<=5;i++) {
		List.addAll(id[i],name[i],marks[i]);
	
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] id =new int[] {101,102,103,104,105};
		int[] marks =new int[] {23,24,22,21,25};
		String[] name = new String[]{"Atharva","Ankita","Sneha","Sameer","Shikhar"};
		Student st = new Student();
		st.getvalue(id,marks,name);
	
		for(int i=0,i<=5;i++) {
			
		}
		
		
	}

}
