package Student_Result_Management_System;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.*;
import java.io.File;

public class Student_login
{
	public static void show_result() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name to get Result: ");
		String rr = sc.nextLine();
		String line = " ";

		try
		{
			File myObj = new File("stud_filename.txt");
			Scanner myReader = new Scanner(myObj);
			Scanner s = new Scanner(myObj);
			while(s.hasNextLine())
			{
				line = s.nextLine();
				if(line.startsWith(rr))
					System.out.println(line);
				else ;

			}
			s.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		}

	}




