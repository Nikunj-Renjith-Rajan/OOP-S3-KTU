import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class GUI implements ActionListener{
    JFrame jf;
    JLabel jl1,jl2;
    JTextField jt1,jt2;
    JButton jb1;
    GUI(){
        jf=new JFrame("TEMP CONVERTER");
        jl1=new JLabel("C:");
        jl2=new JLabel("F:");
        jt1=new JTextField(20);
        jt2=new JTextField(20);
        jb1=new JButton("CONVERT");
        jf.setSize(500,500);
        jf.setVisible(true);
        FlowLayout f=new FlowLayout();
        jf.setLayout(f);
        jf.add(jl1);
        jf.add(jt1);
        jf.add(jb1);
        jf.add(jl2);
        jf.add(jt2);
        jb1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        String c=jt1.getText();
        Double a=Double.parseDouble(c);
        Double res=(a*9/5)+32;
        String f=String.valueOf(res);
        jt2.setText(f);
    }
}
class Main{
    public static void main(String args[]){
        GUI g=new GUI();
    }
}
