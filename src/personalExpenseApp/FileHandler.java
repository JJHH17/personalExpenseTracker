package personalExpenseApp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    /** Method that validates whether a file exists or not, and creates it if not */
    public static void fileCreator() {
        try {
            File file = new File("personalExpenseApp.txt");
            // Checking whether the file exists or not
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred when creating the file");
            e.printStackTrace();
        }
    }

    /** Method for writing to a given file */
    /** Method for writing to a given file */
    public static void fileWriter(String fileContents) {
        try (FileWriter fileWriter = new FileWriter("personalExpenseApp.txt", true)) {
            fileWriter.write(fileContents);
            fileWriter.write(System.lineSeparator());
            System.out.println("File written successfully");

        } catch (IOException e) {
            System.out.println("An error occurred when writing to the file");
            e.printStackTrace();
        }
    }
}
