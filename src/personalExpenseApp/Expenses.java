package personalExpenseApp;

public class Expenses {
    private final String expenseName;
    private final double expenseAmount;
    private final String expenseDate;
    private final String expenseCategory;
    private final String expenseNotes;

    public Expenses(String expenseName, double expenseAmount, String expenseDate, String expenseCategory, String expenseNotes) {
        this.expenseName = expenseName;
        this.expenseAmount = expenseAmount;
        this.expenseDate = expenseDate;
        this.expenseCategory = expenseCategory;
        this.expenseNotes = expenseNotes;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public double getExpenseAmount() {
        return expenseAmount;
    }

    public String getExpenseDate() {
        return expenseDate;
    }

    public String getExpenseCategory() {
        return expenseCategory;
    }

    public String getExpenseNotes() {
        return expenseNotes;
    }
}
