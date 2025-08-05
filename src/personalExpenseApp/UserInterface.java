package personalExpenseApp;

import java.time.Month;
import java.util.EnumMap;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {
    private final ExpenseMonth January;
    private final ExpenseMonth February;
    private final ExpenseMonth March;
    private final ExpenseMonth April;
    private final ExpenseMonth May;
    private final ExpenseMonth June;
    private final ExpenseMonth July;
    private final ExpenseMonth August;
    private final ExpenseMonth September;
    private final ExpenseMonth October;
    private final ExpenseMonth November;
    private final ExpenseMonth December;

    public UserInterface() {
        January = new ExpenseMonth();
        February = new ExpenseMonth();
        March = new ExpenseMonth();
        April = new ExpenseMonth();
        May = new ExpenseMonth();
        June = new ExpenseMonth();
        July = new ExpenseMonth();
        August = new ExpenseMonth();
        September = new ExpenseMonth();
        October = new ExpenseMonth();
        November = new ExpenseMonth();
        December = new ExpenseMonth();

    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Expense Tracker!");
        boolean active = true;

        // Main program loop
        while (active) {
            System.out.println("1. Add an expense\n2. View all Expenses\n3. Quit");
            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Enter the current month");
                    String month = scanner.next();
                    System.out.println("Enter an expense name");
                    scanner.next(); // moving the cursor
                    String expenseName = scanner.nextLine();
                    System.out.println("Enter the expense amount");
                    Double amount = scanner.nextDouble();
                    System.out.println("Enter the expense category");
                    scanner.next();
                    String category = scanner.nextLine();
                    System.out.println("Enter any expense notes");
                    String notes = scanner.nextLine();

                    // Creating an object
                    Expenses entry = new Expenses(expenseName, amount, month, category, notes);

                    // Adding to relevant month
                    if (month.equalsIgnoreCase("january")) {
                        January.addEntry(entry);
                    } else if (month.equalsIgnoreCase("february")) {
                        February.addEntry(entry);
                    } else if (month.equalsIgnoreCase("march")) {
                        March.addEntry(entry);
                    } else if (month.equalsIgnoreCase("april")) {
                        April.addEntry(entry);
                    } else if (month.equalsIgnoreCase("may")) {
                        May.addEntry(entry);
                    } else if (month.equalsIgnoreCase("june")) {
                        June.addEntry(entry);
                    } else if (month.equalsIgnoreCase("july")) {
                        July.addEntry(entry);
                    } else if (month.equalsIgnoreCase("august")) {
                        August.addEntry(entry);
                    } else if (month.equalsIgnoreCase("september")) {
                        September.addEntry(entry);
                    } else if (month.equalsIgnoreCase("october")) {
                        October.addEntry(entry);
                    } else if (month.equalsIgnoreCase("november")) {
                        November.addEntry(entry);
                    } else if (month.equalsIgnoreCase("december")) {
                        December.addEntry(entry);
                    }

                    System.out.println("Entry has been added!");
                    break;

                case 2:
                    System.out.println("Hello");
                    break;

                case 3:
                    System.out.println("Exiting");
                    active = false;
                    break;
            }
        }
    }
}
