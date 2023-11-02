package power.supply.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Splash extends JFrame implements ActionListener {
    JButton b;
    Splash() {
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/elect.jpg"));
        Image i2 = i1.getImage().getScaledInstance(930, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100, 10, 500, 470);
        add(image);
        
        b=new JButton("next");
        b.setBounds(500, 300, 150, 30);
        b.setForeground(Color.BLACK);
        b.addActionListener(this);
        add(b);
        
        
        
        
        
        
        setBounds(450, 150, 700, 400);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setVisible(true);
    }
    
    
    public void run() {
        try {
            
            new Login();
        } catch (Exception e) {
        }
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b){
            setVisible(false);
            new Signup();
        }
    }
    
    public static void main(String[] args) {
        new Splash();
    }

   
   
}