import java.awt.*;
import javax.swing.*;


public class swng extends JFrame {

    public swng()
    {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    

    JPanel panel = new JPanel();
      
    panel.setBackground(Color.pink);
   
      //Initialize Frame
      JFrame f=new JFrame();
      

      //  JLabel 
      JLabel l=new JLabel("Enter Your Name: ");
      l.setBounds(100, 90, 200, 100);

      //jTextField
      JTextField t=new JTextField();
      t.setBounds(250, 100, 300, 50);

      //Jpassword label
      JLabel t1=new JLabel("Enter Password");
      t1.setBounds(100, 150, 300, 100);

      //JPassword 
      JPasswordField p=new JPasswordField();
      p.setBounds(250, 170, 300, 50);


      //JButton
      JButton b=new JButton("Ok");
      b.setBounds(300, 800, 260, 70);


      //Adding items to Frame
      f.add(panel);
      f.add(p);
      f.add(t1);
      f.add(t);
      f.add(l);
      f.add(b);
 
      
     
     //Setting the Size of the Frame 
     f.setSize(1000,1000);
     f.setLayout(null);
     f.setVisible(true);
   

    }
    
    public static void main(String[] args) {  
        clr f=new clr();
        f.setVisible(true);
    }

   
}
