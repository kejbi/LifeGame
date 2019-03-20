package pl.kejbi.lifegame.window;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class TopPanel extends HBox {

    public TopPanel(double spacing) {
        super(spacing);

        setAlignment(Pos.BASELINE_CENTER);
        setPadding(new Insets(10));

        Text title = new Text();
        title.setText("Life Game");
        title.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        
        getChildren().addAll(title);
    }
}
