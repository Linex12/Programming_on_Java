package Practice20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    public static void createGUI(CalculatorModel model) {
        JFrame jFrame = new JFrame("Polish Calculator");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        JLabel calcResult = new JLabel("",SwingConstants.RIGHT);
        calcResult.setBounds(0,0,400,60);
        calcResult.setFont(new Font("Times",Font.BOLD, 32));
        jFrame.setSize(418,400);
        JButton[][] buttons = new JButton[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setBounds(100 * i, 60*(j + 1), 100, 60);
                int i0 = i;
                int j0 = j;
                switch (i0) {
                    case 0:
                        switch (j0) {
                            case 0:
                                buttons[i0][j0].setText("n");
                                break;
                            case 1:
                                buttons[i0][j0].setText("7");
                                break;
                            case 2:
                                buttons[i0][j0].setText("4");
                                break;
                            case 3:
                                buttons[i0][j0].setText("1");
                                break;
                            case 4:
                                buttons[i0][j0].setText(".");
                                break;
                        }
                        break;
                    case 1:
                        switch (j0) {
                            case 0:
                                buttons[i0][j0].setText("C");
                                break;
                            case 1:
                                buttons[i0][j0].setText("8");
                                break;
                            case 2:
                                buttons[i0][j0].setText("5");
                                break;
                            case 3:
                                buttons[i0][j0].setText("2");
                                break;
                            case 4:
                                buttons[i0][j0].setText("0");
                                break;
                        }
                        break;
                    case 2:
                        switch (j0) {
                            case 0:
                                buttons[i0][j0].setText("<");
                                break;
                            case 1:
                                buttons[i0][j0].setText("9");
                                break;
                            case 2:
                                buttons[i0][j0].setText("6");
                                break;
                            case 3:
                                buttons[i0][j0].setText("3");
                                break;
                            case 4:
                                buttons[i0][j0].setText("_");
                                break;
                        }
                        break;
                    case 3:
                        switch (j0) {
                            case 0:
                                buttons[i0][j0].setText("/");
                                break;
                            case 1:
                                buttons[i0][j0].setText("*");
                                break;
                            case 2:
                                buttons[i0][j0].setText("-");
                                break;
                            case 3:
                                buttons[i0][j0].setText("+");
                                break;
                            case 4:
                                buttons[i0][j0].setText("=");
                                break;
                        }
                        break;
                }
                buttons[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        calcResult.setText(CalculatorController.buttonMethod(model, buttons[i0][j0].getText(), calcResult.getText()));
                    }
                });
            }
        }
        jFrame.setLocationRelativeTo(null);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                jFrame.add(buttons[i][j]);
            }
        }
        jFrame.add(calcResult);
        jFrame.setVisible(true);
    }
    public static void Result(CalculatorModel model) {
        System.out.println(model);
    }
}
/*
if ((i0 == 0) && (j0 == 0)) {

                        }
                        else if ((i0 == 0) && (j0 == 1)) {

                        }
                        else if ((i0 == 0) && (j0 == 2)) {

                        }
                        else if ((i0 == 0) && (j0 == 3)) {

                        }
                        else if ((i0 == 0) && (j0 == 4)) {

                        }
                        else if ((i0 == 1) && (j0 == 0)) {

                        }
                        else if ((i0 == 1) && (j0 == 1)) {

                        }
                        else if ((i0 == 1) && (j0 == 2)) {

                        }
                        else if ((i0 == 1) && (j0 == 3)) {

                        }
                        else if ((i0 == 1) && (j0 == 4)) {

                        }
                        else if ((i0 == 2) && (j0 == 0)) {

                        }
                        else if ((i0 == 2) && (j0 == 1)) {

                        }
                        else if ((i0 == 2) && (j0 == 2)) {

                        }
                        else if ((i0 == 2) && (j0 == 3)) {

                        }
                        else if ((i0 == 2) && (j0 == 4)) {

                        }
                        else if ((i0 == 3) && (j0 == 0)) {

                        }
                        else if ((i0 == 3) && (j0 == 1)) {

                        }
                        else if ((i0 == 3) && (j0 == 2)) {

                        }
                        else if ((i0 == 3) && (j0 == 3)) {

                        }
                        else {

                        }
 */