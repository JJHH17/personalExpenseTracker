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
}
