package personalExpenseApp;

import java.io.File;
import java.io.IOException;

public class FileHandler {

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
}
