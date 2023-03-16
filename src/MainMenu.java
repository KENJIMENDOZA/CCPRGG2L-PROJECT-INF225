import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.xml.stream.events.StartDocument;

import java.awt.*;
import java.awt.event.ActionListener;
import java.beans.EventHandler;
import java.util.Scanner;
import java.awt.event.ActionEvent;




public class MainMenu extends JFrame{

    

    MainMenu(){
        



    
    ImageIcon pic = new ImageIcon("Logo.png");
    JLabel Logoname= new JLabel();
   

    Logoname.setText("ROCKPAPERSCISSORS GAME!!");
    Logoname.setHorizontalTextPosition(JLabel.CENTER);
    Logoname.setVerticalTextPosition(JLabel.TOP);
    Logoname.setVerticalAlignment(JLabel.TOP);
    Logoname.setHorizontalAlignment(JLabel.CENTER);
    Logoname.setLocation(700,700);
   

   
    

    JLabel Devs = new JLabel("This game was made by: Carl Jay Margate, GiannCarlo Alcantara, Kenji Mendoza");
    Devs.setLocation(300,300);
    Devs.setVerticalTextPosition(JLabel.BOTTOM);
    Devs.setHorizontalTextPosition(JLabel.CENTER);
    Devs.setVerticalAlignment(JLabel.BOTTOM);
    Devs.setHorizontalAlignment(JLabel.CENTER);
    Devs.setIcon(pic);
   
    
    JButton startButton= new JButton("Start Game");

    startButton.setText("Start Game");
    startButton.setFont(new Font("Arial", Font.BOLD, 25));
    startButton.setSize(100,100);
    startButton.setBounds(50, 50, 250, 50);
    startButton.setLocation(300, 380);
    startButton.setVerticalTextPosition(JButton.CENTER);
    startButton.setHorizontalTextPosition(JButton.CENTER);
    startButton.setLayout(new FlowLayout());
    startButton.setFocusable(false);

    EventHandler startHandler= new EventHandler();

    startButton.addActionListener(startHandler);

    this.add(startButton);
    this.add(Logoname);
    this.add(Devs);
    
    this.setTitle("RockPaperScissors");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setSize(900,900);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    this.setResizable(true);
    this.getContentPane();
    



    
}

    private class EventHandler implements ActionListener{


     public void actionPerformed(ActionEvent event){

        new ColorMenu();

        dispose();




    }




}








}