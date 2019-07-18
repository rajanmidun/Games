package tic.tac.toe.using.ai;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class MainClass extends JFrame {
    private JLabel humanVsComputer,humanVsHuman;
    
    public MainClass(){
     setLayout(new GridLayout(2,1));
     humanVsComputer =new JLabel("HUMAN_VS_COMPUTER",JLabel.CENTER);
     humanVsComputer.setBorder(BorderFactory.createLineBorder(Color.BLACK));
     humanVsComputer.setFont(new Font("serif",Font.BOLD,26));
     humanVsComputer.setForeground(Color.BLACK);
     humanVsComputer.setBackground(Color.YELLOW);
     humanVsComputer.setOpaque(true);
     add(humanVsComputer);
     humanVsHuman=new JLabel("HUMAN_VS_HUMAN",JLabel.CENTER);
     humanVsHuman.setBorder(BorderFactory.createLineBorder(Color.BLACK));
     humanVsHuman.setFont(new Font("serif",Font.BOLD,26));
     humanVsHuman.setForeground(Color.WHITE);
     humanVsHuman.setBackground(Color.BLUE);
     humanVsHuman.setOpaque(true);
     add(humanVsHuman);
     
     humanVsHuman.addMouseListener(new MouseAdapter(){
     public void mouseClicked(MouseEvent e){
        HumanVsHuman human= new HumanVsHuman();
        human.setSize(340, 340);
        human.setVisible(true);
        human.setLocationRelativeTo(null);
        human.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
     });
      humanVsComputer.addMouseListener(new MouseAdapter(){
     public void mouseClicked(MouseEvent e){
        HumanVsComputer computer= new HumanVsComputer();
        computer.setSize(340, 340);
        computer.setVisible(true);
        computer.setLocationRelativeTo(null);
        computer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
     });
    }
    public static void main(String[] args) {
        
        MainClass mainclass = new MainClass();
        mainclass.setSize(340, 340);
        mainclass.setVisible(true);
        mainclass.setLocationRelativeTo(null);
        mainclass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
