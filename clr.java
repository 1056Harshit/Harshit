import java.awt.*;
import javax.swing.*;

public class clr extends JFrame {
    public clr()
    {
        setTitle("Background Color :");

        setSize(400,400);//size of frame 

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set close opertn

        JPanel panel=new JPanel();
        
        //set background color
        panel.setBackground(Color.pink);


        //add panel to frame clr.java
        add(panel);

    }

    public static void main(String[] args) {
        clr f=new clr();
        f.setVisible(true);
    }

    
    
}
