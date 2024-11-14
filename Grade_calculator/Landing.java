package Student_grade_calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Landing extends JFrame {
    JTextField jName;
    Landing(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(350,200,600,300);


        ImageIcon il=new ImageIcon(Objects.requireNonNull(getClass().getResource("/ImageG/login2.jpg")));
        JLabel image=new JLabel(il);
        image.setBounds(0,0,300,300);
        add(image);

        JLabel welcome=new JLabel("Welcome Student");
        welcome. setBounds(350,10,500,20);
        welcome. setFont(new Font("Sanserif",Font.BOLD,25));
        welcome.setForeground(Color.black);
        add(welcome);

        JLabel name =new JLabel("Enter your name");
        name.setBounds(350,100,550,20);
        name.setFont(new Font("Mongolian ", Font.BOLD,20));
        name.setForeground(Color.black);
        add(name);

        jName= new JTextField();
        jName.setBounds(350,130,200,25);
        jName.setFont(new Font("Sanserif",Font.PLAIN,20));
        add(jName);

        JButton next=new JButton("NEXT");
        next.setBounds(460,200,90,25);
        next.setFont(new Font("Sanserif",Font.BOLD,20));
        next.setForeground(Color.blue);
        add(next);

        JButton EXIT=new JButton("EXIT");
        EXIT.setBounds(350,200,90,25);
        EXIT.setFont(new Font("Sanserif",Font.BOLD,20));
        EXIT.setForeground(Color.blue);
        add(EXIT);

        EXIT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String name=jName.getText();
               setVisible(false);
               new marks(name);
            }
        });






        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new Landing();
    }
}
