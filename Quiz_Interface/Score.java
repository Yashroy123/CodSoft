package QUIZ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Score extends JFrame {

    public Score(String name,int score){
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(Objects.requireNonNull(getClass().getResource("/resource/boy.jpg")));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 280, 300, 250);
        add(image);

        JLabel heading = new JLabel("Thank you " + name + " for playing Quiz");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Sanserif", Font.PLAIN, 26));
        add(heading);

        JLabel iscore = new JLabel("Your score is " + score);
        iscore .setBounds(350, 200, 300, 30);
        iscore .setFont(new Font("Sanserif", Font.PLAIN, 26));
        add(iscore );

        JButton submit = new JButton(" Play Again");
        submit.setBounds(380, 280, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.white);
        add(submit);

        JButton exit = new JButton("Exit");
        exit.setBounds(380, 320, 120, 30);
        exit.setBackground(new Color(30, 144, 255));
        exit.setForeground(Color.WHITE);
        add(exit);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Starting();
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setVisible(true);




    }

    public static void main(String[] args) {
        new  Score("USer",0);
    }
}
