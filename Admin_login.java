package Student_Result_Management_System ;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Admin_login
{
	public static void main(String[] args) throws IOException {

		login_check();

	}
	public static void login_check() throws IOException {
		int code;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Admin Code: ");
		code = sc.nextInt();

		if(code == 6547 ) {
			System.out.println("Logged In Successfully. !");

			info_marks obj = new info_marks();
			Admin_Work c = new Admin_Work();
			c.func_adwork();
		}
	   else
		{
			System.out.println("Invaild Credentials. " );
		}
	}
}
