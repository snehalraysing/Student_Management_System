package Student_Result_Management_System;
import java.io.IOException;
import java.util.Scanner;

public class login_type
{
	public static void print(){

	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("  ");
		int choice2;

		do
		{
			System.out.println("---------WELCOME TO THE PORTAL---------");
			System.out.println("1.Login As Admin");
			System.out.println("2.Login As Student");
			System.out.println("3.Exit");

			System.out.print("Enter Your Choice: ");
			choice2 = sc.nextInt();

			switch(choice2)
			{
				case 1:
					Admin_login.login_check();
					break;

				case 2:
					Student_Get_Result.stud_action();
					break;


				case 3:
					System.out.println("Thankyou For Using The Portal !");

			}

		}while(choice2!=3);

	}
}
