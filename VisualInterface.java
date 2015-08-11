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

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    MyListener listener = new MyListener();

    public VisualInterface() throws HeadlessException {
        super(TITLE);
        init();
    }

    public void init() {
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setupButton();
    }

    public void buttonLogic(JButton button, int position) {
        if (isEnabled()) {
            String logicResult = String.valueOf(gameEngine.pressButtonLogic(position));
            Font font = new Font(Font.MONOSPACED, Font.BOLD, 40);
            button.setFont(font);
            //button.setForeground(Color.black);dont work if setEnable false
            button.setText(logicResult);
            button.setEnabled(false);

            if (gameEngine.isWin()) {
                if (gameEngine.isPress()) {
                    JOptionPane.showMessageDialog(new JFrame(), "P1 win");
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "P2 win");
                    System.exit(0);
                }
            }
            if (gameEngine.isDraw()) {
                JOptionPane.showMessageDialog(new JFrame(), "Game ended in a draw");
                System.exit(0);
            }

        }
    }

    public void setupButton() {
        JPanel buttonPanel = new JPanel(new GridLayout(3, 3));
        getContentPane().add(buttonPanel, BorderLayout.CENTER);
        buttonPanel.setBackground(Color.LIGHT_GRAY);

        button1 = new JButton();
        button1.addActionListener(listener);
//        button1.setBackground(Color.green);
//        button1.setOpaque(true);
        buttonPanel.add(button1);

        button2 = new JButton();
        button2.addActionListener(listener);
        buttonPanel.add(button2);

        button3 = new JButton();
        button3.addActionListener(listener);
        buttonPanel.add(button3);

        button4 = new JButton();
        button4.addActionListener(listener);

        buttonPanel.add(button4);

        button5 = new JButton();
        button5.addActionListener(listener);
        buttonPanel.add(button5);

        button6 = new JButton();
        button6.addActionListener(listener);
        buttonPanel.add(button6);

        button7 = new JButton();
        button7.addActionListener(listener);
        buttonPanel.add(button7);

        button8 = new JButton();
        button8.addActionListener(listener);
        buttonPanel.add(button8);

        button9 = new JButton();
        button9.addActionListener(listener);
        buttonPanel.add(button9);
    }

    private class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==button1){
                buttonLogic(button1,0);
            }
            else if(e.getSource()==button2){
                buttonLogic(button2,1);
            }
            else  if(e.getSource()==button3){
                buttonLogic(button3,2);
            }
            else  if(e.getSource()==button4){
                buttonLogic(button4,3);
            }
            else  if(e.getSource()==button5){
                buttonLogic(button5,4);
            }
            else  if(e.getSource()==button6){
                buttonLogic(button6,5);
            }
            else  if(e.getSource()==button7){
                buttonLogic(button7,6);
            }
            else  if(e.getSource()==button8){
                buttonLogic(button8,7);
            }
            else  if(e.getSource()==button9){
                buttonLogic(button9,8);
            }
        }
    }
}