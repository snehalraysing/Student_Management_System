package Student_Result_Management_System;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Admin_Work {
	public static void main(String[] args) throws IOException {
		func_adwork();
	}

	public static void func_adwork() throws IOException {
		Scanner sc = new Scanner(System.in);
		info_marks obj = new info_marks();
		//List arrList = new ArrayList<String>();
		//List<String> ls = new ArrayList<>();

		System.out.println("--------------------Student_Result_Management_System-------------------");

		CreateFile cf = new CreateFile();
		cf.createfile();

		System.out.print("How many records do you want to enter: ");
		int r = sc.nextInt();

		//arrList.add("--------------------Student_Result_Management_System-------------------");

		//ls.add("--------------------Student_Result_Management_System-------------------");

		int chh;
		do {
			System.out.println("1.Add Records");
			System.out.println("2.Exit");
			System.out.print("Make Your Choice: ");
			chh = sc.nextInt();

			switch (chh) {
				case 1:

					try {
						FileWriter myWriter = new FileWriter("stud_filename.txt");
						myWriter.write("--------------------Student_Result_Management_System-------------------");
						myWriter.write("\nName ");
						myWriter.write("   Roll no ");
						myWriter.write("   Physics ");
						myWriter.write("   Chemistry ");
						myWriter.write("   Mathematics ");
						myWriter.write("   Out of 300 ");
						myWriter.write("   Result ");
						for (int i = 1; i <= r; i++) {

							myWriter.write("\n" + obj.get_name());

							myWriter.write("    " + obj.get_roll());
							myWriter.write("         " + obj.get_p());
							myWriter.write("          " + obj.get_c());
							myWriter.write("             " + obj.get_m());
							myWriter.write("           " + obj.getTotal());
							myWriter.write("          " + obj.get_result());

						}
						myWriter.close();
						System.out.println("Successfully wrote to the file.");
					} catch (IOException e) {
						System.out.println("An error occurred.");
						e.printStackTrace();
					}


					/*for (int i = 1; i <= r; i++)
					{
						System.out.println("---------------------------------------");
						arrList.add("Name: " + obj.get_name());
						arrList.add("Roll no: " + obj.get_roll());
						arrList.add("Physics: " + obj.get_p());
						arrList.add("Chemistry: " + obj.get_c());
						arrList.add("Mathematics: " + obj.get_m());
						arrList.add("Out of 300: " + obj.getTotal());
						System.out.println("---------------------------------------");

					}*/
					break;

				case 2:
					System.out.println("Thankyou.");
					break;
			}

		} while (chh != 2);
	}
}







