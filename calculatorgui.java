import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class GUI implements ActionListener{
    JFrame jf;
    JTextField jt;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb0,jbadd,jbsub,jbmul,jbdiv,jbeq,jbrem,jbclr;
    JLabel jl1,jl2;
    double res;
    String s;
    String s0="";
    String s1="";
    String s2="";

    GUI() {
        jf=new JFrame("Calculator");
        jt=new JTextField(40);
        jb0=new JButton("0");
        jb1=new JButton("1");
        jb2=new JButton("2");
        jb3=new JButton("3");
        jb4=new JButton("4");
        jb5=new JButton("5");
        jb6=new JButton("6");
        jb7=new JButton("7");
        jb8=new JButton("8");
        jb9=new JButton("9");
        jbadd=new JButton("+");
        jbsub=new JButton("-");
        jbmul=new JButton("*");
        jbdiv=new JButton("/");
        jbeq=new JButton("=");
        jbrem=new JButton("x");
        jbclr=new JButton("AC");
        jl1=new JLabel(" ");
        jl2=new JLabel(" ");
        jb0.setBackground(Color.GRAY);
        jb1.setBackground(Color.GRAY);
        jb2.setBackground(Color.GRAY);
        jb3.setBackground(Color.GRAY);
        jb4.setBackground(Color.GRAY);
        jb5.setBackground(Color.GRAY);
        jb6.setBackground(Color.GRAY);
        jb7.setBackground(Color.GRAY);
        jb8.setBackground(Color.GRAY);
        jb9.setBackground(Color.GRAY);
        jbadd.setBackground(Color.RED);
        jbsub.setBackground(Color.RED);
        jbmul.setBackground(Color.RED);
        jbdiv.setBackground(Color.RED);
        jbeq.setBackground(Color.ORANGE);
        jbrem.setBackground(Color.WHITE);
        jbclr.setBackground(Color.WHITE);
        jf.setSize(500,500);
        jf.setVisible(true);
        jt.setEditable(false);
        BorderLayout bg=new BorderLayout(10,10);
        GridLayout g=new GridLayout(4,3,40,20);
        FlowLayout f=new FlowLayout();
        jf.setLayout(bg);
        JPanel jp1=new JPanel();
        jp1.setBackground(Color.BLACK);
        JPanel jp2=new JPanel();
        jp2.setBackground(Color.BLACK);
        JPanel jp3=new JPanel();
        JPanel jp4=new JPanel();
        jp3.setBackground(Color.BLACK);
        jp4.setBackground(Color.BLACK);
        jp3.add(jl1);
        jf.add(jp3,BorderLayout.EAST);
        jp4.add(jl2);
        jf.add(jp4,BorderLayout.WEST);
        jp1.setLayout(f);
        jp1.add(jt);
        jp1.add(jbrem);
        jf.add(jp1,BorderLayout.NORTH);
        jp2.setLayout(g);
        jp2.add(jb7);
        jp2.add(jb8);
        jp2.add(jb9);
        jp2.add(jbclr);
        jp2.add(jb4);
        jp2.add(jb5);
        jp2.add(jb6);
        jp2.add(jbdiv);
        jp2.add(jb1);
        jp2.add(jb2);
        jp2.add(jb3);
        jp2.add(jbmul);
        jp2.add(jbeq);
        jp2.add(jb0);
        jp2.add(jbadd);
        jp2.add(jbsub);
        jf.add(jp2,BorderLayout.CENTER);
        jf.getContentPane().setBackground(Color.BLACK);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        jb5.addActionListener(this);
        jb6.addActionListener(this);
        jb7.addActionListener(this);
        jb8.addActionListener(this);
        jb9.addActionListener(this);
        jb0.addActionListener(this);
        jbrem.addActionListener(this);
        jbadd.addActionListener(this);
        jbsub.addActionListener(this);
        jbmul.addActionListener(this);
        jbdiv.addActionListener(this);
        jbeq.addActionListener(this);
        jbclr.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        s=ae.getActionCommand();
        if(s.charAt(0)>='0' && s.charAt(0)<='9'){
            if(!s1.equals(""))
                s2=s2+s;
            else
                s0=s0+s;
            jt.setText(s0+s1+s2);
        }
        else if(s.charAt(0)=='C'){
            res=0;
            s0="";
            s1="";
            s2="";
            jt.setText(s0+s1+s2);
        }
        else if(s.charAt(0)=='='){
            jt.setText("");
            if(s1.equals("+"))
                res=(Double.parseDouble(s0)+Double.parseDouble(s2));
            else if(s1.equals("-"))
                res=(Double.parseDouble(s0)-Double.parseDouble(s2));
            else if(s1.equals("*"))
                res=(Double.parseDouble(s0)*Double.parseDouble(s2));
            else
                res=(Double.parseDouble(s0)/Double.parseDouble(s2));
            s0="";
            s1="";
            s2="";
            s0=Double.toString(res);
            jt.setText(s0);    
            jt.setText(s0+s1+s2);
        }
        else if(s.equals("AC")){
            s0 = "";
            s1 = "";
            s2 = "";
            jt.setText("");
        }
        else if(s.equals("x")){
            if(!s2.equals("")){
                s2 = s2.substring(0, s2.length() - 1);
            } else if(!s1.equals("")){
                s1 = "";
            } else if(!s0.equals("")){
                s0 = s0.substring(0, s0.length() - 1);
            }
            jt.setText(s0 + s1 + s2);
        }
        else{
            if((s1.equals(""))||(s2.equals("")))
                s1=s;
            s1=s;
            s2="";
            jt.setText(s0+s1+s2);
        }
    }
}
class Main{
    public static void main(String args[]){
        GUI g=new GUI();
    }
}