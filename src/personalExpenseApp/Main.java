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

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Personal Expense Tracker");
        Label title = new Label("Personal Expense Tracker");
        VBox layout = new VBox(10);
        Label label = new Label("Hello World!");
        layout.getChildren().addAll(title, label);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void launcher() {
        launch();
    }
}
