package tic.tac.toe.using.ai;


import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

class HumanVsHuman extends JFrame {

    private JButton button1, button2, button3,
            button4, button5, button6, button7,
            button8, button9;
    private int turn = 2;
    int player1[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int player2[] = {1, 1, 1, 1, 1, 1, 1, 1, 1};

    public HumanVsHuman() {
        super("Tic Tac Toe");
        setLayout(new GridLayout(3, 3));
        button1 = new JButton();
        add(button1);
        button2 = new JButton();
        add(button2);
        button3 = new JButton();
        add(button3);
        button4 = new JButton();
        add(button4);
        button5 = new JButton();
        add(button5);
        button6 = new JButton();
        add(button6);
        button7 = new JButton();
        add(button7);
        button8 = new JButton();
        add(button8);
        button9 = new JButton();
        add(button9);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (button1.getText() == "") {
                    if (turn % 2 == 0) {
                        turn++;
                        button1.setText("X");
                        player1[0] = 1;
                        check();

                    } else {
                        turn++;
                        button1.setText("Y");
                        player2[0] = 0;
                        check();
                    }
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (button2.getText() == "") {
                    if (turn % 2 == 0) {
                        turn++;
                        player1[1] = 1;
                        button2.setText("X");
                        check();
                    } else {
                        turn++;
                        player2[1] = 0;
                        button2.setText("Y");
                        check();
                    }
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (button3.getText() == "") {
                    if (turn % 2 == 0) {
                        turn++;
                        player1[2] = 1;
                        button3.setText("X");
                        check();
                    } else {
                        turn++;
                        player2[2] = 0;
                        button3.setText("Y");
                        check();
                    }
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (button4.getText() == "") {
                    if (turn % 2 == 0) {
                        turn++;
                        player1[3] = 1;
                        button4.setText("X");
                        check();
                    } else {
                        turn++;
                        player2[3] = 0;
                        button4.setText("Y");
                        check();
                    }
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (button5.getText() == "") {
                    if (turn % 2 == 0) {
                        turn++;
                        player1[4] = 1;
                        button5.setText("X");
                        check();
                    } else {
                        turn++;
                        player2[4] = 0;
                        button5.setText("Y");
                        check();
                    }
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (button6.getText() == "") {
                    if (turn % 2 == 0) {
                        turn++;
                        player1[5] = 1;
                        button6.setText("X");
                        check();
                    } else {
                        turn++;
                        player2[5] = 0;
                        button6.setText("Y");
                        check();
                    }
                }
            }
        });
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (button7.getText() == "") {
                    if (turn % 2 == 0) {
                        turn++;
                        player1[6] = 1;
                        button7.setText("X");
                        check();
                    } else {
                        turn++;
                        player2[6] = 0;
                        button7.setText("Y");
                        check();
                    }
                }
            }
        });
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (button8.getText() == "") {
                    if (turn % 2 == 0) {
                        turn++;
                        player1[7] = 1;
                        button8.setText("X");
                        check();
                    } else {
                        turn++;
                        player2[7] = 0;
                        button8.setText("Y");
                        check();
                    }
                }
            }
        });
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (button9.getText() == "") {
                    if (turn % 2 == 0) {
                        turn++;
                        player1[8] = 1;
                        button9.setText("X");
                        check();
                    } else {
                        turn++;
                        player2[8] = 0;
                        button9.setText("Y");
                        check();
                    }
                }
            }
        });

    }

    public int firstPlayer() {
        if (player1[0] == 1 && player1[1] == 1 && player1[2] == 1) {
            return 1;
        }
        if (player1[0] == 1 && player1[3] == 1 && player1[6] == 1) {
            return 1;
        }
        if (player1[0] == 1 && player1[4] == 1 && player1[8] == 1) {
            return 1;
        }
        if (player1[2] == 1 && player1[4] == 1 && player1[6] == 1) {
            return 1;
        }
        if (player1[1] == 1 && player1[4] == 1 && player1[7] == 1) {
            return 1;
        }
        if (player1[2] == 1 && player1[5] == 1 && player1[8] == 1) {
            return 1;
        }
        if (player1[6] == 1 && player1[7] == 1 && player1[8] == 1) {
            return 1;
        }
        if (player1[3] == 1 && player1[4] == 1 && player1[5] == 1) {
            return 1;
        }

        return 0;
    }

    public int secondPlayer() {
        if (player2[0] == 0 && player2[1] == 0 && player2[2] == 0) {
            return 1;
        }
        if (player2[0] == 0 && player2[3] == 0 && player2[6] == 0) {
            return 1;
        }
        if (player2[0] == 0 && player2[4] == 0 && player2[8] == 0) {
            return 1;
        }
        if (player2[2] == 0 && player2[4] == 0 && player2[6] == 0) {
            return 1;
        }
        if (player2[1] == 0 && player2[4] == 0 && player2[7] == 0) {
            return 1;
        }
        if (player2[2] == 0 && player2[5] == 0 && player2[8] == 0) {
            return 1;
        }
        if (player2[6] == 0 && player2[7] == 0 && player2[8] == 0) {
            return 1;
        }
        if (player2[3] == 0 && player2[4] == 0 && player2[5] == 0) {
            return 1;
        }

        return 0;
    }

    public void check() {
        int resultFirst = firstPlayer();
        int resultSecond = secondPlayer();
        resultF(resultFirst);
        resultS(resultSecond);
        draw();
    }

    public void resultF(int a) {
        if (a == 1) {
            JOptionPane.showMessageDialog(rootPane, "X Won");
            playAgain();
        }
    }

    public void resultS(int a) {
        if (a == 1) {
            JOptionPane.showMessageDialog(rootPane, "Y Won");
            playAgain();

        }
    }

    public void playAgain() {
        dispose();
        MainClass mainClass = new MainClass();
        mainClass.setSize(340, 340);
        mainClass.setVisible(true);
        mainClass.setLocationRelativeTo(null);
        mainClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void draw() {
        if (button1.getText() != "" && button2.getText() != "" && button3.getText() != ""
                && button4.getText() != "" && button5.getText() != "" && button6.getText() != ""
                && button7.getText() != "" && button8.getText() != "" && button9.getText() != "") {
            JOptionPane.showMessageDialog(rootPane, "Draw");
             playAgain();
        }
       

    }
}

