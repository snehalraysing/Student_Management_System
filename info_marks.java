package Student_Result_Management_System;
import java.io.*;
import java.util.*;
import java.io.IOException;
import java.util.Scanner;

public class info_marks {
	String name;
	int roll;
	int p;
	int c;
	int m;
	int total;
	String result;

	Scanner sc = new Scanner(System.in);

	String get_name() {
		System.out.print("Enter Student Name: ");
		name = sc.next();
		return name;
	}


	int get_roll() {
		System.out.print("Enter Student Roll No.: ");
		roll = sc.nextInt();
		return roll;
	}

	int get_p() {
		System.out.print("Physics Marks: ");
		p = sc.nextInt();
		return p;
	}

	int get_c() {
		System.out.print("Chemistry Marks: ");
		c = sc.nextInt();
		return c;
	}

	int get_m() {
		System.out.print("Mathematics Marks: ");
		m = sc.nextInt();
		return m;
	}

	int getTotal()
	{

		total = p+c+m;
		return total;
	}

	String get_result(){
		if(total>=110 || total==300){
			return "PASS";
		}else{
			return "FAIL";
		}
	}

}



//	void Display() {
//		System.out.println("Student Name: " + name);
//
//		System.out.println("Student Rollno.: " + roll);
//
//		System.out.println("Physics: " + p);
//
//		System.out.println("Chemistry: " + c);
//
//		System.out.println("Mathematics: " + m);
//
//		total = p + c + m;
//		System.out.println("Out of 300: " + total);
//
//	}
//

//

//	void createAfile()
//	{
//		try {
//			File Obj = new File();
//			if (Obj.createNewFile())
//			{
//				System.out.println("File created");
//			} else
//			{
//				System.out.println("File already exists.");
//			}
//		}
//		catch (IOException e)
//		{
//			System.out.println("An error has occurred.");
//			e.printStackTrace();
//		}
//
//	}
//}