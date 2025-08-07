package personalExpenseApp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    /** Method that validates whether a file exists or not, and creates it if not */
    public static void fileCreator(String month) {
        try {
            File file = new File("./files/" + month + ".txt");
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
    public static void fileWriter(String fileContents, String month) {
        try (FileWriter fileWriter = new FileWriter("./files/" + month + ".txt", true)) {
            fileWriter.write(fileContents);
            fileWriter.write(System.lineSeparator());
            System.out.println("File written successfully");

        } catch (IOException e) {
            System.out.println("An error occurred when writing to the file");
            e.printStackTrace();
        }
    }

    /** Method for reading from the given file */
    public static ArrayList<Expenses> fileReader(String month) {
        // Feeds back to an ArrayList
        ArrayList<Expenses> fileData = new ArrayList<>();
        try {
            File file = new File("./files/" + month + ".txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String name = parts[0].trim();
                    double amount = Double.parseDouble(parts[1].trim());
                    String category = parts[2].trim();
                    String notes = parts[3].trim();

                    // Constructing an Expenses object from this data.
                    Expenses expense = new Expenses(name, amount, month, category, notes);
                    fileData.add(expense);
                }
            }
            scanner.close();

        } catch (IOException e) {
            System.out.println("An error occurred when reading from the expenses file.");
            e.printStackTrace();
        }

        return fileData;
    }
}
