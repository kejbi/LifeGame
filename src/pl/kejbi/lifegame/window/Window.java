package pl.kejbi.lifegame.window;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import pl.kejbi.lifegame.game.LifeGame;

public class Window extends Application {

    public static void main(String[] args){
        launch(args);
    }

    private Parent createContent(){
        BorderPane root = new BorderPane();


        root.setPadding(new Insets(10));

        //Top
        TopPanel top = new TopPanel(10);
        root.setTop(top);

        //Center
        Board board = new Board();
        root.setCenter(board);

        //Bottom
        BottomPanel bottomPanel = new BottomPanel(10, board);
        root.setBottom(bottomPanel);

        return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(createContent());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Life Game");
        primaryStage.show();
    }
}
