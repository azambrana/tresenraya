package org.tictactoe.view;

import org.tictactoe.controller.TicTacToeGameController;
import org.tictactoe.model.TicTacToeModel;

import javax.swing.JFrame;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;

public class TicTacToeView extends JFrame {

    private int width;
    private int height;
    private TicTacToeModel model;


    public TicTacToeView() {
        super("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.width = TicTacToeBoardView.CELL_WIDTH * 3;
        this.height = TicTacToeBoardView.CELL_HEIGHT * 3;
        setSize(this.width, this.height);
        setLocationRelativeTo(null);
    }

    public void showView() {
        setVisible(true);
    }

    public void addController(TicTacToeGameController ticTacToeGameController) {
        addMouseListener(ticTacToeGameController);
    }

    public void updateView(TicTacToeModel model) {
        // ToDo update view based on model
        this.model = model;
        this.repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Definir el color de la figura
        // En base al modelo dibujar la figura

        for ( int row = 0; row < 3; row++ ) {
            for (int col = 0; col < 3; col++ ) {
                String symbol = model.getCell(row, col);
                if (symbol.equals("X")) {
                    // dibujar equis
                } else if (symbol.equals("O")) {
                    // dibujar circulo
                }
            }
        }

        /*
        // Definir el color de la "X"
        g.setColor(Color.RED);

        // Definir el tamaño de la "X"
        int tamanio_x = 100;

        // Definir la posición de la "X"
        int posicion_x = getWidth() / 2 - tamanio_x / 2;
        int posicion_y = getHeight() / 2 - tamanio_x / 2;

        // Dibujar la "X" en la posición determinada
        g.drawLine(posicion_x, posicion_y, posicion_x + tamanio_x, posicion_y + tamanio_x);
        g.drawLine(posicion_x + tamanio_x, posicion_y, posicion_x, posicion_y + tamanio_x);
        */
    }
}
