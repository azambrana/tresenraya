package org.tictactoe.model;

public class TicTacToeModel {
    private String[][] cells = new String[3][3];
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public TicTacToeModel() {
        player1 = new Player("Player 1", "X");
        player2 = new Player("Player 2", "O");
        currentPlayer = player1;
    }

    public void setCell(int row, int col) {
        if ( isValidMove(row, col) ) {
            cells[row][col] = currentPlayer.getSymbol();
            System.out.println("(row: " + row + " col: " + col + ") = " + currentPlayer.getSymbol());

            swapPlayers();
        }
    }

    private void swapPlayers() {
        if ( currentPlayer == player1 ) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    public String getCell(int row, int col) {
        return cells[row][col];
    }

    public void reset() {
        cells = new String[3][3];
    }
    public boolean isGameOver() {
        return getWinner() != null || isDraw();
    }
    public String getWinner() {
        // ToDo traverse cells and return winner
        return null;
    }
    public boolean isDraw() {
        // ToDo traverse cells and return true if draw
        return false;
    }
    public boolean isValidMove(int row, int col) {
        // ToDo return true if cell is empty
        return getCell(row, col) == null;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public String[][] getCells() {
        return this.cells;
    }
}
