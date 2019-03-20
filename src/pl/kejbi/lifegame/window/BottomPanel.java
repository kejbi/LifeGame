package pl.kejbi.lifegame.window;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import pl.kejbi.lifegame.game.LifeGame;

public class BottomPanel extends HBox {

    private Board board;

    public BottomPanel(double spacing, Board board) {
        super(spacing);
        this.board = board;
        setPadding(new Insets(10));
        setAlignment(Pos.BASELINE_CENTER);

        Label generation = new Label();
        generation.setText("Generation: 0");

        Button next = new Button("Next Division");
        next.setOnAction(event -> {
            LifeGame.updateBoard();
            board.updateBoard();
            generation.setText("Generation: " + Integer.toString(LifeGame.getGeneration()));
        });

        getChildren().addAll(next, generation);

    }
}
