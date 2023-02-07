import javax.swing.*;
import java.awt.*;

/**
 * A class written to support the TicTacToe Game.
 *
 * Each Square object is one position of the TicTacToe
 * board. It maintains information on the marker, its
 * location on the board, and whether it is part
 * of the winning set.
 *
 * @author: Nandhini Namasivayam
 * @version: Jan 2023
 */

/**
 *  Create a draw() method
 *  should take in the x and y values, view, Graphics g, and the dimensions of the square.
 *  Use marker to decide which image to draw.
 */
public class Square {

    private String marker;
    private int row;
    private int col;
    private boolean isWinningSquare;
    private int screenWidth;
    private int screenHeight;
    private Image X, O;

    /**
     * Constructor to initialize one Square of the
     * TicTacToe board
     * @param row the row the square is in
     * @param col the column the square is in
     */
    public Square(int row, int col) {
        this.row = row;
        this.col = col;
        this.X = new ImageIcon("Resources/X.png").getImage();
        this.O = new ImageIcon("Resources/O.png").getImage();
//        this.screenWidth = screen.getWidth();
//        this.screenHeight = screen.getHeight();




        this.marker = TicTacToe.BLANK;
        this.isWinningSquare = false;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    /******************** Getters and Setters ********************/

    public String getMarker() {
        return this.marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public void setWinningSquare() {
        this.isWinningSquare = true;
    }

    /**
     * Checks if the square has the BLANK marker
     * @return True if the square is empty, False otherwise
     */
    public boolean isEmpty() {
        return this.marker.equals(TicTacToe.BLANK);
    }

    /**
     * Draw method
     */
    public void draw(int x, int y, int dim, Graphics g, TicTacToeViewer t)
    {
        //insert stuff
        int newX = x + dim * col;
        int newY = y + dim * row;
        if(this.isWinningSquare == true)
        {
            g.setColor(Color.green);
            g.fillRect(newX, newY, dim, dim);
        }
        if(this.marker == "X")
        {
            g.drawImage(X, newX, newY, dim, dim, t);
        }
        if(this.marker == "O")
        {
            g.drawImage(O, newX, newY, dim, dim, t);
        }
        g.setColor(Color.black);
        g.drawRect(newX, newY, dim, dim);
    }

    /**
     * @return the marker for the square
     */
    public String toString() {
        return this.marker;
    }
}
