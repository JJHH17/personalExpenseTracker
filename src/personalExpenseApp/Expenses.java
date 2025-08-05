package personalExpenseApp;

public class Expenses {
    private final String expenseName;
    private final double expenseAmount;
    private final String expenseMonth;
    private final String expenseCategory;
    private final String expenseNotes;

    public Expenses(String expenseName, double expenseAmount, String expenseMonth, String expenseCategory, String expenseNotes) {
        this.expenseName = expenseName;
        this.expenseAmount = expenseAmount;
        this.expenseMonth = expenseMonth;
        this.expenseCategory = expenseCategory;
        this.expenseNotes = expenseNotes;
    }

    public double getExpenseAmount() {
        return expenseAmount;
    }

    public String getExpenseCategory() {
        return expenseCategory;
    }

    public String getExpenseNotes() {
        return expenseNotes;
    }

    public String getExpenseMonth() {
        return expenseMonth;
    }

    public String getExpenseName() {
        return expenseName;
    }
}
