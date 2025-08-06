package org.ejc55;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //IMPORTANT:
        //PLEASE ONLY USE VALID PARAMS, NO USER INPUT VALIDATION
        //HAS BEEN ADDED, WHICH MEANS THAT INPUTING SOMETHING
        //WRONG WILL CRASH THE PROGRAM
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("▖  ▖  ▜            ▗     ▄▖▌       ▌");
        System.out.println("▌▞▖▌█▌▐ ▛▘▛▌▛▛▌█▌  ▜▘▛▌  ▌ ▛▌█▌▛▘▛▘▌");
        System.out.println("▛ ▝▌▙▖▐▖▙▖▙▌▌▌▌▙▖  ▐▖▙▌  ▙▖▌▌▙▖▄▌▄▌▖");
        System.out.println();

        int player = 1;
        Scanner scnr = new Scanner(System.in);
        String loc1;
        String loc2;

        System.out.println("WARNING: This program is only a prototype, as such no ");
        System.out.println("input safety checking has been added, therefor typing");
        System.out.println("anything other than a valid command will crash the program!");


//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);

        Board board = new Board();
        Bishop bishop1 = new Bishop();
        board.setObjectLocaton(bishop1 , 'A' , 2);

        board.draw();

        while (true) {
            System.out.println("Player " + player + ": Please type location of piece to move:");
            System.out.println("Example: \"C5\"");
            loc1 = scnr.nextLine();
            System.out.println("Please input location to move");
            loc2 = scnr.nextLine();
            board.movePiece(loc1 , loc2);
            board.draw();
            player = (player % 2) + 1;
        }
    }
}