import java.io.*;
import java.util.*;

public class FileInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read file name from user
        System.out.print("Enter file name (with path if needed): ");
        String fileName = sc.nextLine();

        // Create File object
        File file = new File(fileName);

        // Check if file exists
        if (file.exists()) {
            System.out.println("File exists.");

            // Check readability
            if (file.canRead()) {
                System.out.println("File is readable.");
            } else {
                System.out.println("File is NOT readable.");
            }

            // Check writability
            if (file.canWrite()) {
                System.out.println("File is writable.");
            } else {
                System.out.println("File is NOT writable.");
            }

            // Check file type
            if (file.isFile()) {
                System.out.println("It is a regular file.");
            } else if (file.isDirectory()) {
                System.out.println("It is a directory.");
            }

            // Display file length
            System.out.println("File size: " + file.length() + " bytes");

        } else {
            System.out.println("File does NOT exist.");
        }

        sc.close();
    }
}