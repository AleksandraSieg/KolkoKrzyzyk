package pl.madison;

import pl.madison.domain.TicTacToe;

import java.awt.*;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args )
    {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                TicTacToe ticTacToe = new TicTacToe();
            }
        });
    }

}
