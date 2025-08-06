package org.ejc55;

import java.util.HashMap;
import java.util.Map;

public class Board {
    Cell[][] gameBoard;
    Map<Character, Integer> xAxis = new HashMap<>();

    public Board() {
        this.gameBoard = new Cell[6][6];
        xAxis.put('A', 0);
        xAxis.put('B', 1);
        xAxis.put('C', 2);
        xAxis.put('D', 3);
        xAxis.put('E', 4);
        xAxis.put('F', 5);



        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                gameBoard[i][j] = new Cell();
            }
        }
    }

    public void draw() {
        int line = 0;
        char[]alphabet = {'A' , 'B' , 'C' , 'D' , 'E', 'F'};

        for (int i = 0; i <= 5; i++) {
            System.out.print(alphabet[i] + "  ");
            for (int j = 0; j <= 5; j++) {
                System.out.print(gameBoard[i][j].getPieceObj() + "  ");
            }
                System.out.print("\n");

        }

        System.out.print("   ");
        for (int i = 1; i <= 6; i++) {
            System.out.print(i + "  ");
        }

        System.out.println();
    }

    public void setObjectLocaton(GamePiece piece, char x, int y) {
        gameBoard[xAxis.get(x)][y-1].changePiece(piece);
    }

    public void movePiece(String loc1, String loc2) {
        //should add a check here to make sure that the piece is creating
        //a valid move
        //1. calculateValidMoves()
        //2. isInBounds() ?
        //3. from loc1 : loc2, Cell.occupied?
        //
        // IF NO return, if yes proceed;

        //should add a check here to make sure that the piece is creating
        //a valid move
        //1. calculateValidMoves()
        //2. isInBounds() ?
        //3. from loc1 : loc2, Cell.occupied?
        //
        // IF NO return, if yes proceed;
        char x1 = loc1.charAt(0);
        char cy1 = loc1.charAt(1);
        int y1 = cy1- '0';
        char x2 = loc2.charAt(0);
        char cy2 = loc2.charAt(1);
        int y2 = cy2- '0';



        GamePiece piece = gameBoard[xAxis.get(x1)][y1-1].getPiece();

        this.setObjectLocaton(piece , x2 , y2);

        clearOldLocation(xAxis.get(x1), y1);
    }

    private void clearOldLocation(int x, int y) {
        EmptyPiece emptyPiece = new EmptyPiece();
        gameBoard[x][y-1].changePiece(emptyPiece);
    }
}
