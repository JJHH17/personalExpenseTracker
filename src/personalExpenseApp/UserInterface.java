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
                    break;

                case 2:
                    scanner.nextLine();
                    System.out.println("Please enter the expense name");
                    String expenseName = scanner.nextLine();
                    System.out.println("Please enter the expense amount");
                    double expenseAmount = scanner.nextDouble();
                    scanner.nextLine(); // Used to clear the scanner buffer
                    System.out.println("Please enter the expense date (day/month)");
                    String expenseDate = scanner.nextLine();
                    System.out.println("Please enter the expense category");
                    String expenseCategory = scanner.nextLine();
                    System.out.println("Please enter the expense notes");
                    String expenseNotes = scanner.nextLine();

                    Expenses newExpense = new Expenses(expenseName, expenseAmount, expenseDate, expenseCategory, expenseNotes);

                    Month expenseMonth = null;
                    if (expenseDate.toLowerCase().contains("jan")) {
                        expenseMonth = Month.JANUARY;
                    } else if (expenseDate.toLowerCase().contains("feb")) {
                        expenseMonth = Month.FEBRUARY;
                    } else if (expenseDate.toLowerCase().contains("mar")) {
                        expenseMonth = Month.MARCH;
                    } else if (expenseDate.toLowerCase().contains("apr")) {
                        expenseMonth = Month.APRIL;
                    } else if (expenseDate.toLowerCase().contains("may")) {
                        expenseMonth = Month.MAY;
                    } else if (expenseDate.toLowerCase().contains("jun")) {
                        expenseMonth = Month.JUNE;
                    } else if (expenseDate.toLowerCase().contains("jul")) {
                        expenseMonth = Month.JULY;
                    } else if (expenseDate.toLowerCase().contains("aug")) {
                        expenseMonth = Month.AUGUST;
                    } else if (expenseDate.toLowerCase().contains("sep")) {
                        expenseMonth = Month.SEPTEMBER;
                    } else if (expenseDate.toLowerCase().contains("oct")) {
                        expenseMonth = Month.OCTOBER;
                    } else if (expenseDate.toLowerCase().contains("nov")) {
                        expenseMonth = Month.NOVEMBER;
                    } else if (expenseDate.toLowerCase().contains("dec")) {
                        expenseMonth = Month.DECEMBER;
                    }

                    if (expenseMonth != null) {
                        ExpenseMonth monthObject = expenseMonths.get(expenseMonth);
                        ExpenseDay expenseDay = new ExpenseDay(expenseDate.split("/")[0], expenseDate.split("/")[1]);
                        expenseDay.addExpense(newExpense);
                        monthObject.addExpenseDay(expenseDay);
                        expenseMonths.put(expenseMonth, monthObject);
                        System.out.println("Expense added successfully");
                    } else {
                        System.out.println("Invalid date entered");
                    }
                    break;

                case 3:
                    active = false;
                    break;
            }
        }
    }
}
