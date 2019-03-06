package pl.kejbi.lifegame.window;

import javafx.scene.layout.GridPane;
import pl.kejbi.lifegame.game.LifeGame;

public class Board extends GridPane {

    private Tile tiles[][] = new Tile[LifeGame.SIZE][LifeGame.SIZE];

    public Board(){
        setHgap(1);
        setVgap(1);
        for(int x = 0; x < LifeGame.SIZE; x++){
            for(int y = 0; y < LifeGame.SIZE; y++){
                Tile tile = new Tile(x,y);
                tiles[x][y] = tile;
                add(tile,x,y);
            }
        }

    }
}
