package QUIZ;

import Task_4.QUIZ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

public class Rules extends JFrame {
    String name;
    public Rules(String name){
      this.name=name;

      getContentPane().setBackground(new Color(0x39DAAA));
      setLocation(300,100);
      setLayout(null);
      setSize(800,600);


      JLabel welcome=new JLabel("WELCOME-"+name);
      welcome.setBounds(200,5,550,100);
      welcome.setFont(new Font("Sanserif",Font.BOLD,40));
      add(welcome);


     JLabel text=new JLabel();
     text.setText("hello"+"world");
     text.setBounds(20,100,1000,350);
     text.setFont(new Font("Sanserif",Font.BOLD,16));
     text.setText( "<html>"+
             "1. This test contains 10 question" + "<br><br>" +
             "2. Each Questions have 10 marks" + "<br><br>" +
             "3. Read Carefully: Focus on details to avoid mistakes." + "<br><br>" +
             "4. Each Question have 15 sec only after that new Question will arrived." + "<br><br>" +
             "5. Don’t Overthink: Trust your preparation and avoid changing answers frequently" + "<br><br>" +
             "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
             "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
             "8. May you know more than what HE knows, Good Luck" + "<br><br>" +
             "<html>");
     text.setForeground(Color.black);
     add(text);

     JButton start=new JButton("START");
     start.setBounds(new Rectangle(400,430,100,30));
     start.setFont(new Font("Sanserif",Font.BOLD,20));
     add(start);

     JButton Back=new JButton("Back");
     Back.setBounds(new Rectangle(20,430,100,30));
     Back.setFont(new Font("Sanserif",Font.BOLD,20));
     add(Back);

    Back.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
            new Starting();
        }
    });

    start.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
            new Question(name);
        }
    });

     setVisible(true);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new Rules("-USER");
    }
}
