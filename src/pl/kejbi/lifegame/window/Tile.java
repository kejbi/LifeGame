package pl.kejbi.lifegame.window;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import pl.kejbi.lifegame.game.LifeGame;

public class Tile extends Rectangle{
        private final int x;
        private final int y;

        public Tile(int x, int y){
            super(40,40);
            this.x = x;
            this.y = y;
            setFill(Color.BLUE);
            setOnMouseClicked(event -> {
                if(LifeGame.isAlive(this.x, this.y)){
                    setFill(Color.BLUE);
                    LifeGame.setDead(this.x, this.y);
                }
                else{
                    setFill(Color.ORANGE);
                    LifeGame.setAlive(this.x, this.y);
                }
            });
        }
}
