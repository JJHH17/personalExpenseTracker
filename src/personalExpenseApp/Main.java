package personalExpenseApp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Main extends Application {
    public static void main(String[] args) {
//        UserInterface userInterface = new UserInterface();
//        userInterface.start();
        launcher();
    }

    /** Method used for initializing and starting the frontend application */
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Personal Expense Tracker");
        Label title = new Label("Personal Expense Tracker");
        VBox layout = new VBox(10);

        // Allowing user to add new expenses
        Label addExpenseLabel = new Label("Add new Expense");
        Button addExpenseButton = new Button("Add new Expense");

        layout.getChildren().addAll(title);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /** Method used as launcher of application */
    public static void launcher() {
        launch();
    }

    /** Method used for adding new expenses page */
    public static void addExpense() {
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

        // Submit Button
        Button submit = new Button("Submit");

        // Cancel/Quit button
        Button cancel = new Button("Cancel");

        layout.getChildren().addAll(title, currentMonthLabel, currentMonth, expenseNameLabel, expenseName, expenseAmountLabel,
                expenseAmount, expenseCategoryLabel, expenseCategory, expenseNotesLabel, expenseNotes, submit, cancel);

    }
}
