package pl.kejbi.lifegame.game;

import java.util.Arrays;

public class LifeGame {
    private static final int SIZE = 50;
    private boolean board[][];
    private int generation;

    public LifeGame(){
        board = new boolean[SIZE][SIZE];
        for(int i=0; i<SIZE; i++){
            Arrays.fill(board[i],false);
        }
        generation = 0;
    }

    
}
