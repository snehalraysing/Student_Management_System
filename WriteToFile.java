package Student_Result_Management_System;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class CreateFile {
    public void createfile() {
        try {
            File myObj = new File("stud_filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }




}
public class WriteToFile {
    public static void main(String[] args) {

        CreateFile cf = new CreateFile();
        cf.createfile();

    }
}
