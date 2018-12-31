package pl.madison.domain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame {

    private int counter = 0;

    public TicTacToe() {
        setSize(500, 500);
        setVisible(true);
        setTitle("Kółko i krzyżyk");
        final GridLayout manager = new GridLayout(3, 3);
        setLayout(manager);
        for(int i = 0; i < 9; i++) {
            JButton jButton = new JButton();
            add(jButton);
            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton) e.getSource();
                    if(counter%2==0) {
                        button.setText("X");
                        System.out.println("X");
                    } else {
                        button.setText("O");
                        System.out.println("O");
                    }
                    button.setEnabled(false);
                    counter++;


                }
            });
        }
    }

}
