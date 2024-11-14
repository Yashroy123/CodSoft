package Student_grade_calculator;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class result extends JFrame {

    result(String name,int math,int phy,int che,int eng,int comp){
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setBounds(200,50,1000,600);


        ImageIcon il=new ImageIcon(Objects.requireNonNull(getClass().getResource("/ImageG/score.png")));
        Image i2=il.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,300,300);
        add(image);

        JLabel label=new JLabel("Your Result");
        label. setBounds(600,50,800,25);
        label. setFont(new Font("Sanserif",Font.BOLD,28));
        label.setForeground(Color.black);
        add(label);

        JLabel label2=new JLabel("Name");
        label2. setBounds(600,250,800,25);
        label2. setFont(new Font("Sanserif",Font.BOLD,28));
        label2.setForeground(Color.black);
        add(label2);

       JTextField username= new JTextField(name);
        username.setBounds(700,250,200,25);
        username.setFont(new Font("Sanserif",Font.BOLD,20));
        add( username);

        int sum=math+phy+che+eng+comp;

        int percentage=sum/5;

        String grade=getgrade(percentage);

        JLabel label3=new JLabel("Total");
        label3. setBounds(600,300,800,25);
        label3. setFont(new Font("Sanserif",Font.BOLD,28));
        label3.setForeground(Color.black);
        add(label3);

        JTextField Total= new JTextField();
        Total.setText(String.valueOf(sum));
        Total.setBounds(700,300,200,25);
        Total.setFont(new Font("Sanserif",Font.BOLD,20));
        add( Total);

        JLabel label4=new JLabel("%");
        label4. setBounds(600,350,800,25);
        label4. setFont(new Font("Sanserif",Font.BOLD,28));
        label4.setForeground(Color.black);
        add(label4);

        JTextField per= new JTextField();
        per.setText(String.valueOf(percentage));
        per.setBounds(700,350,200,25);
        per.setFont(new Font("Sanserif",Font.BOLD,20));
        add(  per);

        JLabel label5=new JLabel("Grade");
        label5. setBounds(600,400,800,25);
        label5. setFont(new Font("Sanserif",Font.BOLD,28));
        label5.setForeground(Color.black);
        add(label5);

        JTextField grad= new JTextField(grade);
        grad.setBounds(700,400,200,25);
        grad.setFont(new Font("Sanserif",Font.BOLD,20));
        add(  grad);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    String getgrade(int percentage){
        if(percentage<35 && percentage>=0){
            return "E";
        } else if (percentage>35 && percentage <=50) {
            return "d";
        } else if (percentage>51 && percentage<60 ) {
            return "C";
        } else if (percentage>=60 && percentage <70) {
            return "B";
        } else if (percentage>=70 && percentage<90) {
            return "A";
        } else if (percentage>=90 && percentage<=100) {
            return "A++";
        }else {
            return "F";
        }

    }


    public static void main(String[] args) {
        new result("user",0,0,0,0,0);
    }
}
