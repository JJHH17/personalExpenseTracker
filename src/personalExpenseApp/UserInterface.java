package personalExpenseApp;

import java.time.Month;
import java.util.EnumMap;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {
    private final Map<Month, ExpenseMonth> expenseMonths;
    private final Scanner scanner = new Scanner(System.in);

    public UserInterface() {
        expenseMonths = new EnumMap<>(Month.class);
        // Here we're populating all months to the list based on the enums
        for (Month month : Month.values()) {
            expenseMonths.put(month, new ExpenseMonth(month));
        }
    }

    public Map<Month, ExpenseMonth> getExpenseMonths() {
        return expenseMonths;
    }

    public void startApp() {
        System.out.println("Welcome to Personal Expense Tracker");
        boolean active = true;

        while (active) {
            System.out.println("1. View Expenses by Month \n2. Add Expense \n3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Please enter a month (3 word abbreviation) to view expenses for that month");
                    System.out.println("Example: JAN");
                    System.out.println("To exit the app, enter QUIT");
                    String monthInput = scanner.next();

                    switch (monthInput.toUpperCase()) {
                        case "QUIT":
                            active = false;
                            break;

                        case "JAN":
                            System.out.println(expenseMonths.get(Month.JANUARY));
                            break;

                        case "FEB":
                            System.out.println(expenseMonths.get(Month.FEBRUARY));
                            break;

                        case "MAR":
                            System.out.println(expenseMonths.get(Month.MARCH));
                            break;

                        case "APR":
                            System.out.println(expenseMonths.get(Month.APRIL));
                            break;

                        case "MAY":
                            System.out.println(expenseMonths.get(Month.MAY));
                            break;

                        case "JUN":
                            System.out.println(expenseMonths.get(Month.JUNE));
                            break;

                        case "JUL":
                            System.out.println(expenseMonths.get(Month.JULY));
                            break;

                        case "AUG":
                            System.out.println(expenseMonths.get(Month.AUGUST));
                            break;

                        case "SEP":
                            System.out.println(expenseMonths.get(Month.SEPTEMBER));
                            break;

                        case "OCT":
                            System.out.println(expenseMonths.get(Month.OCTOBER));
                            break;

                        case "NOV":
                            System.out.println(expenseMonths.get(Month.NOVEMBER));
                            break;

                        case "DEC":
                            System.out.println(expenseMonths.get(Month.DECEMBER));
                            break;

                        default:
                            System.out.println("Invalid month entered");
                            break;
                    }
            }
        }
    }
}
