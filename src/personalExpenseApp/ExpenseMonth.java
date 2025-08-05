package personalExpenseApp;

import java.util.ArrayList;

public class ExpenseMonth {
    private final ArrayList<Expenses> expenses;

    public ExpenseMonth() {
        this.expenses = new ArrayList<>();
    }

    public void addEntry(Expenses expense) {
        expenses.add(expense);
    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder();

        for (Expenses expense : expenses) {
            response.append("Expense Name: ").append(expense.getExpenseName()).append("\n");
            response.append("Amount: ").append(expense.getExpenseAmount()).append("\n");
            response.append("Category: ").append(expense.getExpenseCategory()).append("\n");
            response.append("Notes: ").append(expense.getExpenseNotes()).append("\n");
        }

        return response.toString();
    }
}
