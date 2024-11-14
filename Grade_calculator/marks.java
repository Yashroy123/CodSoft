package Student_grade_calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class marks extends JFrame {
   JTextField m,p,c,ee,com;
   String name;


    public marks(String name){
        this.name=name;
        getContentPane().setBackground(Color.yellow);
        setLayout(null);
        setBounds(300,50,800,600);

        JLabel l=new JLabel("Hello "+name+" Enter the marks of following Subject");
        l. setBounds(50,50,800,20);
        l. setFont(new Font("Sanserif",Font.BOLD,26));
        l.setForeground(Color.black);
        add(l);

        JLabel ll=new JLabel("Out of 100");
        ll. setBounds(50,100,800,20);
        ll. setFont(new Font("Sanserif",Font.BOLD,26));
        ll.setForeground(Color.black);
        add(ll);

        JLabel math=new JLabel("Math");
        math. setBounds(50,150,800,20);
        math. setFont(new Font("Sanserif",Font.BOLD,26));
        math.setForeground(Color.black);
        add(math);

        m= new JTextField();
        m.setBounds(200,150,200,25);
        m.setFont(new Font("Sanserif",Font.PLAIN,20));
        add(m);

        JLabel phy=new JLabel("Physics");
        phy. setBounds(50,200,800,25);
        phy. setFont(new Font("Sanserif",Font.BOLD,26));
        phy.setForeground(Color.black);
        add(phy);

        p= new JTextField();
        p.setBounds(200,200,200,25);
        p.setFont(new Font("Sanserif",Font.PLAIN,20));
        add(p);

        JLabel che=new JLabel("chemistry");
        che. setBounds(50,250,800,25);
        che. setFont(new Font("Sanserif",Font.BOLD,26));
        che.setForeground(Color.black);
        add(che);

        c= new JTextField();
        c.setBounds(200,250,200,25);
        c.setFont(new Font("Sanserif",Font.PLAIN,20));
        add(c);

        JLabel eng=new JLabel("English");
        eng. setBounds(50,300,800,25);
        eng. setFont(new Font("Sanserif",Font.BOLD,26));
        eng.setForeground(Color.black);
        add(eng);

        ee= new JTextField();
        ee.setBounds(200,300,200,25);
        ee.setFont(new Font("Sanserif",Font.PLAIN,20));
        add(ee);

        JLabel computer=new JLabel("computer");
        computer. setBounds(50,350,800,25);
        computer. setFont(new Font("Sanserif",Font.BOLD,26));
        computer.setForeground(Color.black);
        add(computer);

        com= new JTextField();
        com.setBounds(200,350,200,25);
        com.setFont(new Font("Sanserif",Font.PLAIN,20));
        add( com);


        JButton Submit=new JButton("Submit");
        Submit.setBounds(300,400,100,25);
        Submit.setFont(new Font("Sanserif",Font.PLAIN,18));
        Submit.setForeground(Color.black);
        add(Submit);

        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int math=Integer.parseInt(m.getText());
                int phy=Integer.parseInt(p.getText());
                int che=Integer.parseInt(c.getText());
                int comp=Integer.parseInt(com.getText());
                int eng=Integer.parseInt(ee.getText());
                setVisible(false);
                new result(name,math,phy,che,comp,eng);
            }
        });






        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new marks("User");
    }
}
