package personalExpenseApp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.util.ArrayList;
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

        // Allowing user to print a list of expenses for a given month
        Label printExpensesLabel = new Label("Print Expenses");
        Button printExpenses = new Button("Print Expenses");

        layout.getChildren().addAll(title, addExpenseLabel, addExpenseButton, printExpensesLabel, printExpenses);

        // Button handling
        addExpenseButton.setOnAction(e -> {
            addExpense(primaryStage);
        });

        printExpenses.setOnAction(e -> {
            printExpense(primaryStage);
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

    /** Method used for reading expenses from file to the UI */
    public void printExpense(Stage primaryStage) {
        Label title = new Label("Print Expenses");
        VBox layout = new VBox(10);

        // Used for selecting the month you wish to print the expenses of
        Label expenseMonthLabel = new Label("Select the months expenses you wish to view");
        ComboBox<String> expenseMonth = new ComboBox<>();
        expenseMonth.getItems().addAll("January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December");

        Button submit = new Button("Submit");
        submit.setOnAction(e -> {
            switch (expenseMonth.getValue()) {
                case ("January") -> printExpense(January, "january", layout, expenseMonthLabel, expenseMonth, submit);
                case ("February") -> printExpense(February, "february", layout, expenseMonthLabel, expenseMonth, submit);
                case ("March") -> printExpense(March, "march", layout, expenseMonthLabel, expenseMonth, submit);
                case ("April") -> printExpense(April, "april", layout, expenseMonthLabel, expenseMonth, submit);
                case ("May") -> printExpense(May, "may", layout, expenseMonthLabel, expenseMonth, submit);
                case ("June") -> printExpense(June, "june", layout, expenseMonthLabel, expenseMonth, submit);
                case ("July") -> printExpense(July, "july", layout, expenseMonthLabel, expenseMonth, submit);
                case ("August") -> printExpense(August, "august", layout, expenseMonthLabel, expenseMonth, submit);
                case ("September") -> printExpense(September, "september", layout, expenseMonthLabel, expenseMonth, submit);
                case ("October") -> printExpense(October, "october", layout, expenseMonthLabel, expenseMonth, submit);
                case ("November") -> printExpense(November, "november", layout, expenseMonthLabel, expenseMonth, submit);
                case ("December") -> printExpense(December, "december", layout, expenseMonthLabel, expenseMonth, submit);

            }
        });

        Button cancel = new Button("Cancel");
        cancel.setOnAction(e -> {
            start(primaryStage);
            layout.getChildren().clear();
        });

        layout.getChildren().addAll(title, expenseMonthLabel, expenseMonth, submit, cancel);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
    }

    /** Method used as a helper for printing expenses to UI */
    private void printExpense(ExpenseMonth expenseMonth, String month, VBox layout, Label expenseMonthLabel, ComboBox expenseMonthBox,
                              Button submit) {
        // Creates and sets a new Label for UI
        Label output = new Label();
        output.setText(expenseMonth.returnInfo(month));

        // Adds to the relevant layout of the page
        layout.getChildren().addAll(output);

        // Removing the "Submit" button and other components when these are printed
        layout.getChildren().remove(expenseMonthLabel);
        layout.getChildren().remove(expenseMonthBox);
        layout.getChildren().remove(submit);
    }
}