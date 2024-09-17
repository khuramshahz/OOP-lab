import javax.swing.*;
import java.awt.*;
class showGridLayout extends JFrame{
    showGridLayout(){
        setLayout(new GridLayout(3,2,5,5));
        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("MI"));
        add(new JTextField(1));
        add(new JLabel("LastName"));
        add(new JTextField(8));
    }

}
public class jui_4{
    public static void main(String[] args) {
        showGridLayout frame=new showGridLayout();
        frame.setSize(200,125);
        frame.setTitle("GridLayout");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);   
    }
}
