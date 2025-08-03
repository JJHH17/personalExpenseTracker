package personalExpenseApp;

import java.time.Month;
import java.util.EnumMap;
import java.util.Map;

public class UserInterface {
    private final Map<Month, ExpenseMonth> expenseMonths;

    public UserInterface() {
        expenseMonths = new EnumMap<>(Month.class);
        // Here we're populating all months to the list based on the enums
        for (Month month : Month.values()) {
            expenseMonths.put(month, new ExpenseMonth(month));
        }
    }

    public Map<Month, ExpenseMonth> getExpenseMonths() {
        return expenseMonths;
    }


}
