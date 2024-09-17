import java.awt.*;
import javax.swing.*;
class TestPanel extends JFrame{
    TestPanel(){
        JPanel p1=new JPanel();
        p1.setLayout(new GridLayout(4,4));
        
        for (int i = 7; i <=9; i++) { 
            p1.add(new JButton("" + i)); 
        }
        p1.add(new JButton("/"));
        for (int i = 4; i <=6; i++) { 
            p1.add(new JButton("" + i)); 
        }
        p1.add(new JButton("*"));
        for (int i = 1; i <=3 ; i++) { 
            p1.add(new JButton("" + i)); 
        }
        p1.add(new JButton("-"));
        p1.add(new JButton("0"));
        p1.add(new JButton("."));
        p1.add(new JButton("="));
        p1.add(new JButton("+"));
        
        JPanel p2 = new JPanel(new BorderLayout()); 
        p2.add(new JTextField(), 
        BorderLayout.NORTH); 
        p2.add(p1, BorderLayout.CENTER); 
        add(p2, BorderLayout.BEFORE_FIRST_LINE); 
        add(p1);
    }
}
public class jui_5{
    public static void main(String[] args) {
        TestPanel frame = new TestPanel(); 
        frame.setTitle("Calculator"); 
        frame.setSize(300, 400); 
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setVisible(true);       
    }  
}
