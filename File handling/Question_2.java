import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;
import java.awt.Color;

class Showgrid extends JFrame{
    Showgrid(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3));
        panel.add(createColoredPanel(Color.BLUE));
        panel.add(createColoredPanel(Color.WHITE));
        panel.add(createColoredPanel(Color.GRAY));
        add(panel);
        JPanel panel2=new JPanel();
        JButton b1=new JButton("Blue");
        b1.setBackground(Color.BLUE);
        JButton b2=new JButton("White");
        b2.setBackground(Color.WHITE);
        JButton b3=new JButton("Gray");
        b3.setBackground(Color.GRAY);
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        add(panel2,BorderLayout.SOUTH);

    }
    private JPanel createColoredPanel(Color color) {
        JPanel coloredPanel = new JPanel();
        coloredPanel.setBackground(color);
        return coloredPanel;
    }
}
public class Question_2{
    public static void main(String[]args){
        Showgrid frame=new Showgrid();
        frame.setTitle("Panel Demo"); 
        frame.setSize(450, 300); 
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }   
}
