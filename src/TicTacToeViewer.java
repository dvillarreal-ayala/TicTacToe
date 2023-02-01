import java.awt.*;

public class TicTacToeViewer {
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
     */
    public Square[][] squares;
    public Image[][] array;
    public TicTacToeViewer(Image[][] array)
    {
        this.array = array;
    }
}
