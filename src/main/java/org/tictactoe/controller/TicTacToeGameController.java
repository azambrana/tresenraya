package org.tictactoe.controller;

import org.tictactoe.model.TicTacToeModel;
import org.tictactoe.view.TicTacToeBoardView;
import org.tictactoe.view.TicTacToeView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TicTacToeGameController implements MouseListener {
    private TicTacToeModel model;
    private TicTacToeView view;

    public TicTacToeGameController() {
        this.model = new TicTacToeModel();
        this.view = new TicTacToeView();
        this.view.addController(this);
    }

    public void start() {
        view.showView();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("x: " + x + " y: " + y);
        int row = y / TicTacToeBoardView.CELL_HEIGHT;
        int col = x / TicTacToeBoardView.CELL_WIDTH;

        model.setCell(row, col);

        view.updateView(model);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
