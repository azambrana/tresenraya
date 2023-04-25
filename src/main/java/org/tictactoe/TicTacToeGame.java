package org.tictactoe;

import org.tictactoe.controller.TicTacToeGameController;

public class TicTacToeGame {
    private TicTacToeGameController ticTacToeGameController;

    TicTacToeGame() {
        ticTacToeGameController = new TicTacToeGameController();
    }

    private void startGame() {
        ticTacToeGameController.start();
    }

    public static void main(String args[]) {
        new TicTacToeGame().startGame();
    }
}
