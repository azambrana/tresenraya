package org.tictactoe.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeModelTest {

    @Test
    void setCell() {
    }

    @Test
    void getCell() {
    }

    @Test
    void reset() {
        // Arrange
        TicTacToeModel model = new TicTacToeModel();
        model.getCells();
        String[][] cells = new String[3][3];

        // Act

        model.setCell(0, 0);
        model.reset(); // SUT

        // Assert
        assertArrayEquals(cells, model.getCells());
    }

    @Test
    void isGameOver() {
    }

    @Test
    void getWinner() {
    }

    @Test
    void isDraw() {
    }

    @Test
    void isValidMove() {
        // Arrange
        TicTacToeModel model = new TicTacToeModel();
        model.setCell(0, 1);

        // Act

        boolean actual = model.isValidMove(0, 1); // SUT

        // Assert

        assertFalse(actual);
    }

    @Test
    void getCurrentPlayer() {
    }
}