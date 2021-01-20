package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("User.fxml"));
        primaryStage.setTitle("Library App");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

/*

        Create a JavaFX app for a library. This app should allow users to create books and list the books.
        Create a fxml file with the following:

        Use BorderPane as the outer container. Use only the top and center.
        The top will have a menu
        The center will be used to display books that have been created
        Have a menu at the top with a File item. There should be only one option: "Create book".
        When the "Create Book" button is clicked, have a new window appear.
        This window should allow a user to enter a title and author.
        Clicking ok should create a new book object and display it in the center of the BorderPane


        20 Bonus Points:

        Use a .txt or a .json file to store the book data.
        When the app is opened, previously created books should appear in the center.
        New books that are created should also be added to the .txt file.
*/
