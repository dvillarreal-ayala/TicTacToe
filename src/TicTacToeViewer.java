import javax.swing.*;
import java.awt.*;

public class TicTacToeViewer extends JFrame {
    // TODO: Complete this class
    /**
     * Create constructor
     * set the board
     * one of the parameters could be Square[][]
     *Create Image objects
     * iterate through squares and call draw() on each. draw axes (1,2,3), display winning message
     * Create getImages() method
     *
     *
     *
     */
    public Square[][] squares;
    private TicTacToe t;
    private final int WINDOW_WIDTH = 1000;
    private final int WINDOW_HEIGHT = 800;
    private final int SQUARE_SIZE = 200;
    public TicTacToeViewer(Square[][] array, TicTacToe t)
    {
        this.squares = array;
        this.t = t;

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("TicTacToe Screen");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        // setVisible calls on paint()
        this.setVisible(true);
    }
    public void paint(Graphics g) {
        // TODO: Write the paint method.
        //Reset Canvas
        g.setColor(Color.white);
        g.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
        //Print text/borders
        g.setColor(Color.red);
        g.setFont(new Font("Serif", Font.ITALIC, 50));
        g.drawString("0", 300, 80);
        g.drawString("1", 500, 80);
        g.drawString("2", 700, 80);
        g.drawString("0", 150, 180);
        g.drawString("1", 150, 380);
        g.drawString("2", 150, 580);

        //Set color to black and create squares.
        g.setColor(Color.black);

        for(int row = 0; row < this.squares.length; row++)
        {
            for(int col = 0; col < this.squares[row].length; col++)
            {
                Square square = squares[row][col];
                square.draw(200, 100, SQUARE_SIZE, g, this);
            }
        }
        if(t.getWinner() == "X")
        {
            g.setColor(Color.red);
            g.drawString("X Wins!", 300, 775);
        }
        else if(t.getWinner() == "O")
        {
            g.setColor(Color.red);
            g.drawString("O Wins!", 300, 775);
        }
    }
}
