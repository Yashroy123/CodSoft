package QUIZ;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Starting extends JFrame  {
    JTextField jName;
     public Starting(){


         getContentPane().setBackground(new Color(0xDAC016));//Changing Background color:
         setLocation(350,200);
         setSize(700,300);


         JLabel heading =new JLabel("WELCOME BRO");
         heading.setBounds(200,10,660,80);
         heading.setFont(new Font("Viner Hand ITC", Font.BOLD,40));
         heading.setForeground(new Color(3446));
         add(heading);

         JLabel name =new JLabel("Enter your name");
         name.setBounds(200,90,550,20);
         name.setFont(new Font("Mongolian beiti", Font.BOLD,20));
         name.setForeground(Color.black);
         add(name);

         jName= new JTextField();
         jName.setBounds(200,130,450,25);
         jName.setFont(new Font("Sanserif",Font.CENTER_BASELINE,18));
         add(jName);

         JButton rules=new JButton("Rules");
         rules.setBounds(new Rectangle(200,200,120,25));
         rules.setFont(new Font("Sanserif",Font.BOLD,20));
         add(rules);

         JButton Back=new JButton("Back");
         Back.setBounds(new Rectangle(400,200,120,25));
         Back.setFont(new Font("Sanserif",Font.BOLD,20));
         add(Back);




         setLayout(null);
         setVisible(true);
         setDefaultCloseOperation(EXIT_ON_CLOSE);

         rules.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 String name=jName.getText();
                 setVisible(false);
                 new Rules(name);

             }
         });

         Back.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 setVisible(false);
             }
         });
     }


    public static void main(String[] args) {
        Starting starting = new Starting();

    }
}
