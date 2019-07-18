package tic.tac.toe.using.ai;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class HumanVsComputer extends JFrame {

    private JButton button1, button2, button3,
            button4, button5, button6, button7,
            button8, button9;
    private int turn = 2;
    private int machineCount = 0;
    private int humanCount = 0;
    int result = 0;
    int values[] = {8, 3, 4, 1, 5, 9, 6, 7, 2};
    int[] human = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    int[] machine = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    public HumanVsComputer() {
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

        for (int i = 0; i < 9; i++) {
            if (turn % 2 == 0) {
                machineTurn();
            } else {
                humanTurn();
            }

        }
    }

    public void machineTurn() {
        if (machineCount == 0) {
            Random random = new Random();
            int ran;
            ran = random.nextInt(9);
            checkIndexFunction(ran);
        } else if (machine[1] == 0) {
            if (button1.getText() == "") {
                button1.setText("X");
                machine[1] = 8;
                turn++;
                values[0] = 0;
                machineCount++;
            } else if (button2.getText() == "") {
                button2.setText("X");
                machine[1] = 3;
                turn++;
                values[1] = 0;
                machineCount++;
            } else if (button3.getText() == "") {
                button3.setText("X");
                machine[1] = 4;
                turn++;
                values[2] = 0;
                machineCount++;
            }
        } else {
            int value = 0;
            int c1 = 0;
            int index = 0;
            int count = 0;
            for (int i = 0; i < machineCount; i++) {
                for (int j = i + 1; j < machineCount; j++) {
                    value = machine[i] + machine[j];
                    int resultt = 15 - value;
                    for (int k = 0; k < 9; k++) {
                        if (values[k] == resultt && c1 == 0) {
                            c1++;
                            index = k;
                            result = resultt;
                        }
                    }
                }
            }
            System.out.println("Result...." + result + " " + c1 + " " + index);
            if (c1 == 1) {
                System.out.println("count bata aako ");
                checkIndexFunction(index);
            } else {
                c1 = 0;
                System.out.println("IN HUMAN");
                for (int i = 0; i < humanCount; i++) {
                    for (int j = i + 1; j < humanCount; j++) {
                        int humanSum = human[i] + human[j];
                        System.out.println("Human " + i + " " + j + " " + humanSum);
                        result = 15 - humanSum;
                        System.out.println("Human Result" + result);
                        if (result > 0 && result < 10) {
                            c1++;
                            break;
                        }

                    }
                }

                if (c1 > 0) {
                    for (int i = 0; i < 9; i++) {
                        if (values[i] == result) {
                            index = i;
                            count++;
                        }
                    }
                    if (count == 1) {
                        checkIndexFunction(index);

                    }
                } else {
                    int c = 0;
                    for (int i = 0; i < 9; i++) {
                        if (values[i] != 0 && c == 0) {
                            System.out.println("INDEX: " + i);
                            checkIndexFunction(i);
                            c++;
                        }

                    }

                }

            }
        }
    }

    public void checkIndexFunction(int j) {
        if (j == 0) {
            if (button1.getText() == "") {
                button1.setText("X");
                machine[machineCount] = 8;
                values[j] = 0;
                machineResult(machine[machineCount]);
                machineCount++;
                turn++;
            }
        } else if (j == 1) {
            if (button2.getText() == "") {
                button2.setText("X");
                machine[machineCount] = 3;
                values[j] = 0;
                machineResult(machine[machineCount]);
                turn++;
                machineCount++;
            }
        }
        if (j == 2) {
            if (button3.getText() == "") {
                button3.setText("X");
                machine[machineCount] = 4;
                values[j] = 0;
                machineResult(machine[machineCount]);
                turn++;
                machineCount++;

            }
        } else if (j == 3) {
            if (button4.getText() == "") {
                button4.setText("X");
                machine[machineCount] = 1;
                values[j] = 0;
                machineResult(machine[machineCount]);
                turn++;
                machineCount++;
            }
        }
        if (j == 4) {
            if (button5.getText() == "") {
                button5.setText("X");
                machine[machineCount] = 5;
                values[j] = 0;
                machineResult(machine[machineCount]);
                turn++;
                machineCount++;
            }
        } else if (j == 5) {
            if (button6.getText() == "") {
                button6.setText("X");
                machine[machineCount] = 9;
                values[j] = 0;
                machineResult(machine[machineCount]);
                turn++;
                machineCount++;
            }
        }
        if (j == 6) {
            if (button7.getText() == "") {
                button7.setText("X");
                machine[machineCount] = 6;
                values[j] = 0;
                machineResult(machine[machineCount]);
                turn++;
                machineCount++;
            }
        } else if (j == 7) {
            if (button8.getText() == "") {
                button8.setText("X");
                machine[machineCount] = 7;
                values[j] = 0;
                machineResult(machine[machineCount]);
                turn++;
                machineCount++;
            }
        } else if (j == 8) {
            if (button9.getText() == "") {
                button9.setText("X");
                machine[machineCount] = 2;
                values[j] = 0;
                machineResult(machine[machineCount]);
                turn++;
                machineCount++;
            }
        }

    }

    public void machineResult(int result) {
        for (int i = 0; i < machineCount; i++) {
            for (int j = i + 1; j < machineCount; j++) {
                int sum = machine[i] + machine[j] + result;
                System.out.println("SUM " + machine[i] + " " + machine[j] + " " + result + " " + sum);
                if (sum == 15) {
                    JOptionPane.showMessageDialog(rootPane, "Machine has Won");
                    dispose();
                    MainClass mainClass = new MainClass();
                    mainClass.setSize(340, 340);
                    mainClass.setVisible(true);
                    mainClass.setLocationRelativeTo(null);
                    mainClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    break;
                }
            }
        }
    }

    public void humanTurn() {

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (button1.getText() == "") {
                    if (turn % 2 == 1) {
                        turn++;
                        button1.setText("Y");
                        human[humanCount] = 8;
                        values[0] = 0;
                        humanCount++;
                        check();
                        machineTurn();
                    }

                }
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (button2.getText() == "") {
                    if (turn % 2 == 1) {
                        turn++;
                        human[humanCount] = 3;
                        humanCount++;
                        button2.setText("Y");
                        values[1] = 0;
                        check();
                        machineTurn();
                    }
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (button3.getText() == "") {
                    if (turn % 2 == 1) {
                        turn++;
                        human[humanCount] = 4;
                        values[2] = 0;
                        humanCount++;
                        button3.setText("Y");
                        check();
                        machineTurn();
                    }
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (button4.getText() == "") {
                    if (turn % 2 == 1) {
                        turn++;
                        human[humanCount] = 1;
                        humanCount++;
                        button4.setText("Y");
                        values[3] = 0;
                        check();
                        machineTurn();
                    }
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (button5.getText() == "") {
                    if (turn % 2 == 1) {
                        turn++;
                        human[humanCount] = 5;
                        humanCount++;
                        button5.setText("Y");
                        values[4] = 0;
                        check();
                        machineTurn();
                    }
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (button6.getText() == "") {
                    if (turn % 2 == 1) {
                        turn++;
                        human[humanCount] = 9;
                        humanCount++;
                        button6.setText("Y");
                        values[5] = 0;
                        check();
                        machineTurn();
                    }
                }
            }
        });
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (button7.getText() == "") {
                    if (turn % 2 == 1) {
                        turn++;
                        human[humanCount] = 6;
                        humanCount++;
                        button7.setText("Y");
                        values[6] = 0;
                        check();
                        machineTurn();
                    }
                }
            }
        });
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (button8.getText() == "") {
                    if (turn % 2 == 1) {
                        turn++;
                        human[humanCount] = 7;
                        humanCount++;
                        values[7] = 0;
                        button8.setText("Y");
                        check();
                        machineTurn();
                    }
                }
            }
        });
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (button9.getText() == "") {
                    if (turn % 2 == 1) {
                        turn++;
                        human[humanCount] = 2;
                        humanCount++;
                        values[8] = 0;
                        button9.setText("Y");
                        check();
                        machineTurn();
                    }
                }
            }
        });

    }

    public void check() {
        int sum = 0;
        for (int i = 0; i < humanCount; i++) {
            for (int j = i + 1; j < humanCount; j++) {
                for (int k = j + 1; k < humanCount; k++) {
                    sum = human[i] + human[j] + human[k];
                    if (sum == 15) {
                        JOptionPane.showMessageDialog(rootPane, "Human win");
                        dispose();
                        MainClass mainClass = new MainClass();
                        mainClass.setSize(340, 340);
                        mainClass.setVisible(true);
                        mainClass.setLocationRelativeTo(null);
                        mainClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        break;
                    }
                }

            }
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
