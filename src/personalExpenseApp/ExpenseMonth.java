package personalExpenseApp;

import java.util.ArrayList;

public class ExpenseMonth {
    private final String expenseMonth;
    private ArrayList<ExpenseDay> expenseDays;

    public ExpenseMonth(String expenseMonth) {
        this.expenseMonth = expenseMonth;
        this.expenseDays = new ArrayList<>();
    }

    public String getExpenseMonth() {
        return expenseMonth;
    }

    public ArrayList<ExpenseDay> getExpenseDays() {
        return expenseDays;
    }

    public void addExpenseDay(ExpenseDay expenseDay) {
        expenseDays.add(expenseDay);
    }
}
