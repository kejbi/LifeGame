package pl.kejbi.lifegame.window;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import pl.kejbi.lifegame.game.LifeGame;

public class BottomPanel extends HBox {

    private Board board;

    public BottomPanel(double spacing, Board board) {
        super(spacing);
        this.board = board;
        setPadding(new Insets(10));
        setAlignment(Pos.BASELINE_CENTER);

        Button next = new Button("Next Division");
        next.setOnAction(event -> {
            LifeGame.updateBoard();
            board.updateBoard();

        });

        getChildren().addAll(next);

    }
}
