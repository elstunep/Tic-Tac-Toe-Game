package edu.wofford;

import java.util.Scanner;

public class ConsoleMain {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        TicTacToeModel new_game = new TicTacToeModel();
        int i = 0;
        char location00 = ' ';
        char location01 = ' ';
        char location02 = ' ';
        char location10 = ' ';
        char location11 = ' ';
        char location12 = ' ';
        char location20 = ' ';
        char location21 = ' ';
        char location22 = ' ';
        while(i < 9 && new_game.hasWon() != true) {
            String input_move = keyboard.nextLine();
            int row = Character.getNumericValue(input_move.charAt(0));
            int col = Character.getNumericValue(input_move.charAt(2));
            if (new_game.isValidPlay(new_game.getRow(row), col)) {
                    new_game.makeAMove(row, col);
                if (input_move.equals("0 0")) {
                    location00 = new_game.XorOChar().charAt(0);
                } else if (input_move.equals("0 1")) {
                    location01 = new_game.XorOChar().charAt(0);
                } else if (input_move.equals("0 2")) {
                    location02 = new_game.XorOChar().charAt(0);
                } else if (input_move.equals("1 0")) {
                    location10 = new_game.XorOChar().charAt(0);
                } else if (input_move.equals("1 1")) {
                    location11 = new_game.XorOChar().charAt(0);
                } else if (input_move.equals("1 2")) {
                    location12 = new_game.XorOChar().charAt(0);
                } else if (input_move.equals("2 0")) {
                    location20 = new_game.XorOChar().charAt(0);
                } else if (input_move.equals("2 1")) {
                    location21 = new_game.XorOChar().charAt(0);
                } else {
                    location22 = new_game.XorOChar().charAt(0);
                }
                System.out.println(location00 + "|" + location01 + "|" + location02);
                System.out.println("-----");
                System.out.println(location10 + "|" + location11 + "|" + location12);
                System.out.println("-----");
                System.out.println(location20 + "|" + location21 + "|" + location22);
                i = i + 1;
            } else {
                i = i + 0;
            }
        }
        if (new_game.hasWon() == true) {
            System.out.println(new_game.getWinner() + " wins");
        } else {
            System.out.println("Tie");
        }
    }
}
