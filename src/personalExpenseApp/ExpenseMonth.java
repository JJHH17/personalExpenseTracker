package personalExpenseApp;

import java.util.ArrayList;

public class ExpenseMonth {
    private final ArrayList<Expenses> expenses;
    private final FileHandler file;

    public ExpenseMonth() {
        this.expenses = new ArrayList<>();
        this.file = new FileHandler();
    }

    public void addEntry(Expenses expense) {
        expenses.add(expense);
        FileHandler.fileWriter(expense.toString(), expense.getExpenseMonth());
    }

    public String returnInfo(String month) {
        ArrayList<Expenses> fileData = file.fileReader(month);

        StringBuilder response = new StringBuilder();

        // Pushing the entries from the existing file to the array
        for (Expenses expense : fileData) {
            response.append("Expense Name: ").append(expense.getExpenseName()).append(",");
            response.append("Amount: ").append(expense.getExpenseAmount()).append(",");
            response.append("Category: ").append(expense.getExpenseCategory()).append(",");
            response.append("Notes: ").append(expense.getExpenseNotes()).append(" \n");
        }

        return response.toString();
    }
}
