package personalExpenseApp;

import java.time.Month;
import java.util.ArrayList;

public class ExpenseMonth {
    private final Month month;
    private final ArrayList<ExpenseDay> expenseDays;

    public ExpenseMonth(Month month) {
        this.month = month;
        this.expenseDays = new ArrayList<>();
    }

    public Month getMonth() {
        return month;
    }

    public ArrayList<ExpenseDay> getExpenseDays() {
        return expenseDays;
    }

    public void addExpenseDay(ExpenseDay expenseDay) {
        expenseDays.add(expenseDay);
    }

    @Override
    public String toString() {
        return "ExpenseMonth{" +
                "Month=" + month +
                ", number of expense days=" + expenseDays.size() +
                "}";
    }

    /** Used to provide more in-depth return of expenses */
    public String getMonthExpenses() {
        ArrayList<ExpenseDay> monthExpenses = new ArrayList<>();
        for (ExpenseDay expenseDay : expenseDays) {
            if (expenseDay.getExpenseTotal() > 0) {
                monthExpenses.add(expenseDay);
            }
        }
        return monthExpenses.toString();
    }
}
