package personalExpenseApp;

import java.util.ArrayList;

public class ExpenseMonth {
    private ArrayList<Expenses> expenses;

    public ExpenseMonth() {
        this.expenses = new ArrayList<>();
    }

    @Override
    public String toString() {
        String response = "";

        for (Expenses expense : expenses) {
            response += expense ;
        }

        return response;
    }
}
