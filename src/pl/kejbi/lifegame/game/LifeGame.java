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

    private int getIndex(int index){
        if(index<0) return SIZE-1;
        if(index==SIZE) return 0;
        return index;
    }

    public void updateBoard(){
        boolean newBoard[][] = new boolean[SIZE][SIZE];
        int neighbours;
        for(int x=0; x<SIZE; x++){
            for(int y=0; y<SIZE; y++){
                neighbours = countNeighbours(x,y);
                if(board[x][y]){
                    if(neighbours>3 || neighbours<2){
                        newBoard[x][y] = false;
                    }
                    else {
                        newBoard[x][y] = true;
                    }
                }
                else{
                    if(neighbours==3){
                        newBoard[x][y]=true;
                    }
                    else{
                        newBoard[x][y] = false;
                    }
                }
            }
        }
        board = newBoard;
    }

    private int countNeighbours(int x, int y){
        int counter = 0;
        int xIndex = getIndex(x-1);
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(board[xIndex][y-1+j]){
                    counter++;
                }
            }
            xIndex = getIndex(xIndex+1);
        }
        return board[x][y] ? counter-1 : counter;
    }


}
