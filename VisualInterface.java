package homework7.gameXO;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ErrorMessages_it;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Razer on 09.08.15.
 */
public class VisualInterface extends JFrame {
    private static final String TITLE = "Game";
    GameEngine gameEngine = new GameEngine();


    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;

    public VisualInterface() throws HeadlessException {
        super(TITLE);
        init();
    }

    public void init() {
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setupButton();
    }

    public void buttonLogic(JButton button, int position) {
        if (isEnabled()) {
            String logicResult = String.valueOf(gameEngine.pressButtonLogic(position));
            button.setText(logicResult);
            button.setEnabled(false);
            if (gameEngine.isWin()) {
                if (gameEngine.isPress()) {
                    JOptionPane.showMessageDialog(new JFrame(), "P1 win");
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "P2 win");
                }
            }
            if (gameEngine.isDraw()) {
                JOptionPane.showMessageDialog(new JFrame(), "Game ended in a draw");
            }

        }
    }

    public void setupButton() {
        JPanel buttonPanel = new JPanel(new GridLayout(3, 3));
        getContentPane().add(buttonPanel, BorderLayout.CENTER);
        buttonPanel.setBackground(Color.LIGHT_GRAY);

        button1 = new JButton();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonLogic(button1, 0);
            }
        });
//        button1.setBackground(Color.green);
//        button1.setOpaque(true);
        buttonPanel.add(button1);

        button2 = new JButton();
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonLogic(button2, 1);
            }
        });
        buttonPanel.add(button2);

        button3 = new JButton();
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonLogic(button3, 2);
            }
        });
        buttonPanel.add(button3);

        button4 = new JButton();
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonLogic(button4, 3);
            }
        });
        buttonPanel.add(button4);

        button5 = new JButton();
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonLogic(button5, 4);
            }
        });
        buttonPanel.add(button5);

        button6 = new JButton();
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonLogic(button6, 5);
            }
        });
        buttonPanel.add(button6);

        button7 = new JButton();
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonLogic(button7, 6);
            }
        });
        buttonPanel.add(button7);

        button8 = new JButton();
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonLogic(button8, 7);
            }
        });
        buttonPanel.add(button8);

        button9 = new JButton();
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonLogic(button9, 8);
            }
        });
        buttonPanel.add(button9);
    }

}