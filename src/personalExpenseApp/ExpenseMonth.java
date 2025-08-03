package personalExpenseApp;

import java.time.Month;
import java.util.ArrayList;

public class ExpenseMonth {
    private enum Months {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC};
    private final ArrayList<ExpenseDay> expenseDays;

    public ExpenseMonth(Month month) {
        this.expenseDays = new ArrayList<>();
    }

    public String getExpenseMonth() {
        return Months.valueOf(expenseDays.getFirst().getExpenseMonth()).toString();
    }

    public ArrayList<ExpenseDay> getExpenseDays() {
        return expenseDays;
    }

    public void addExpenseDay(ExpenseDay expenseDay) {
        expenseDays.add(expenseDay);
    }
}
