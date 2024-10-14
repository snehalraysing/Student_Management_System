package Student_Result_Management_System;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

public class Student_Get_Result {
	public static void main(String[] args)
	{

		int choice1;
		Scanner sc = new Scanner(System.in);
		info_marks obj1 = new info_marks();

		stud_action();

	}


	public static void stud_action() {
		int ch;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("---------GET RESULT--------");
			System.out.println("1.Get Result");
			System.out.println("2.Logout");

			System.out.print("Enter Your Choice: ");
			ch = sc.nextInt();

			switch (ch) {
				case 1:
					Student_login oo = new Student_login();
					oo.show_result();

				case 2:
					break;

			}


		}while(ch!=2);

	}
}


