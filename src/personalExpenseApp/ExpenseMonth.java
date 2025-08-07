package personalExpenseApp;

import java.util.ArrayList;

public class ExpenseMonth {
    private final ArrayList<Expenses> expenses;

    public ExpenseMonth() {
        this.expenses = new ArrayList<>();
    }

    public void addEntry(Expenses expense) {
        expenses.add(expense);
        FileHandler.fileWriter(expense.toString(), expense.getExpenseMonth());
    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder();

        for (Expenses expense : expenses) {
            response.append("Expense Name: ").append(expense.getExpenseName()).append(",");
            response.append("Amount: ").append(expense.getExpenseAmount()).append(",");
            response.append("Category: ").append(expense.getExpenseCategory()).append(",");
            response.append("Notes: ").append(expense.getExpenseNotes()).append(" \n");
        }

        return response.toString();
    }
}
