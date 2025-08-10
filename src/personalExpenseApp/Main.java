package personalExpenseApp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.util.List;
import java.util.Arrays;

public class Main extends Application {
    private final ExpenseMonth January;
    private final ExpenseMonth February;
    private final ExpenseMonth March;
    private final ExpenseMonth April;
    private final ExpenseMonth May;
    private final ExpenseMonth June;
    private final ExpenseMonth July;
    private final ExpenseMonth August;
    private final ExpenseMonth September;
    private final ExpenseMonth October;
    private final ExpenseMonth November;
    private final ExpenseMonth December;

    public static void main(String[] args) {
        launcher();
    }

    public Main() {
        January = new ExpenseMonth();
        February = new ExpenseMonth();
        March = new ExpenseMonth();
        April = new ExpenseMonth();
        May = new ExpenseMonth();
        June = new ExpenseMonth();
        July = new ExpenseMonth();
        August = new ExpenseMonth();
        September = new ExpenseMonth();
        October = new ExpenseMonth();
        November = new ExpenseMonth();
        December = new ExpenseMonth();
    }

    /** Method used for initializing and starting the frontend application */
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Personal Expense Tracker");
        Label title = new Label("Personal Expense Tracker");
        VBox layout = new VBox(10);

        // Allowing user to add new expenses
        Label addExpenseLabel = new Label("Add new Expense");
        Button addExpenseButton = new Button("Add new Expense");

        layout.getChildren().addAll(title, addExpenseLabel, addExpenseButton);

        // Button handling
        addExpenseButton.setOnAction(e -> {
            addExpense(primaryStage);
        });

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /** Method used as launcher of application */
    public static void launcher() {
        launch();
    }

    /** Method used for adding new expenses page */
    public void addExpense(Stage primaryStage) {
        Label title = new Label("Add Expense");
        VBox layout = new VBox(10);

        // Form fields and input
        Label currentMonthLabel = new Label("Expense Month");
        ComboBox<String> currentMonth = new ComboBox<>();
        currentMonth.getItems().addAll("January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December");

        Label expenseNameLabel = new Label("Expense Name");
        TextField expenseName = new TextField();

        Label expenseAmountLabel = new Label("Expense Amount");
        TextField expenseAmount = new TextField();

        Label expenseCategoryLabel = new Label("Expense Category");
        TextField expenseCategory = new TextField();

        Label expenseNotesLabel = new Label("Expense Notes");
        TextField expenseNotes = new TextField();

        // Submit Button and creation of expense instance
        Button submit = new Button("Submit");
        submit.setOnAction( e-> {
            Expenses newEntry = new Expenses(expenseName.getText(), Double.parseDouble(expenseAmount.getText()), currentMonth.getValue(),
                    expenseCategory.getText(), expenseNotes.getText());

            // Parsing month selected into relevant expense month
            switch (currentMonth.getValue()) {
                case "January" -> January.addEntry(newEntry);
                case "February" -> February.addEntry(newEntry);
                case "March" -> March.addEntry(newEntry);
                case "April" -> April.addEntry(newEntry);
                case "May" -> May.addEntry(newEntry);
                case "June" -> June.addEntry(newEntry);
                case "July" -> July.addEntry(newEntry);
                case "August" -> August.addEntry(newEntry);
                case "September" -> September.addEntry(newEntry);
                case "October" -> October.addEntry(newEntry);
                case "November" -> November.addEntry(newEntry);
                case "December" -> December.addEntry(newEntry);
            }

            // Clearing existing data on page
            List<TextField> fields = Arrays.asList(expenseName, expenseAmount, expenseCategory, expenseNotes);
            for (TextField field : fields) {
                field.clear();
            }
        });

        // Cancel/Quit button
        Button cancel = new Button("Cancel");
        cancel.setOnAction( e -> {
            start(primaryStage);
            layout.getChildren().clear();
        });

        layout.getChildren().addAll(title, currentMonthLabel, currentMonth, expenseNameLabel, expenseName, expenseAmountLabel,
                expenseAmount, expenseCategoryLabel, expenseCategory, expenseNotesLabel, expenseNotes, submit, cancel);

        // Used to display and load page when user navigates here
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
    }
}
