import javax.swing.*;


public class SnakeGame extends JFrame {
    Board board;
    SnakeGame(){ // creating constructor
        board = new Board();
        add(board);
        pack();
        setResizable(false); // here we are not giving acess to users to resize the frame
        setVisible(true); // we are making frame visible
    }
    public static void main(String[] args) {

        SnakeGame snakeGame = new SnakeGame();
    }
}
