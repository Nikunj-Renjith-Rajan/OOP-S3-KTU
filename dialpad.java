import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class GUI implements ActionListener{
    String num="";
    JFrame jf;
    JLabel jl1,jl2;
    JTextField jt;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb0,jbcall,jbx;
    GUI(){
        jf=new JFrame("PHONE CALL");
        jt=new JTextField(40);
        jl1=new JLabel("    ");
        jl2=new JLabel("    ");
        jbx=new JButton("x");
        jb1=new JButton("1");
        jb2=new JButton("2");
        jb3=new JButton("3");
        jb4=new JButton("4");
        jb5=new JButton("5");
        jb6=new JButton("6");
        jb7=new JButton("7");
        jb8=new JButton("8");
        jb9=new JButton("9");
        jb0=new JButton("0");
        jb0.setBackground(Color.PINK);
        jb1.setBackground(Color.PINK);
        jb2.setBackground(Color.PINK);
        jb3.setBackground(Color.PINK);
        jb4.setBackground(Color.PINK);
        jb5.setBackground(Color.PINK);
        jb6.setBackground(Color.PINK);
        jb7.setBackground(Color.PINK);
        jb8.setBackground(Color.PINK);
        jb9.setBackground(Color.PINK);
        jbx.setBackground(Color.GRAY);
        jbcall=new JButton("Call");
        jbcall.setBackground(Color.GREEN);
        jf.setSize(500,500);
        jf.setVisible(true);
        jt.setEditable(false);
        BorderLayout bg=new BorderLayout(10,10);
        GridLayout g=new GridLayout(4,3,80,30);
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
        jf.add(jp1,BorderLayout.NORTH);
        jp2.setLayout(g);
        jp2.add(jb1);
        jp2.add(jb2);
        jp2.add(jb3);
        jp2.add(jb4);
        jp2.add(jb5);
        jp2.add(jb6);
        jp2.add(jb7);
        jp2.add(jb8);
        jp2.add(jb9);
        jp2.add(jbx);
        jp2.add(jb0);
        jp2.add(jbcall);
        jf.add(jp2,BorderLayout.CENTER);
        jf.getContentPane().setBackground(Color.BLACK);
        jbx.addActionListener(this);
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
        jbcall.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        String s=ae.getActionCommand();
        if(s.charAt(0)>='0' && s.charAt(0)<='9'){
            num+=s;
            jt.setText(num);
        }
        else if(s.charAt(0)=='x'){
            if(num.equals(""))
                jt.setText("Enter a number");
            else{
                int len=num.length();
                int i;
                String prev=num;
                num="";
                for(i=0;i<len-1;i++){
                    num+=prev.charAt(i);
                }
                jt.setText(num);
            }
        }
        else if(s.equals("Call")){
            if(num.equals(""))
                jt.setText("Enter a number");
            else{
                jt.setText("CALLING...");
                jbcall.setText("Hang up");
                jbcall.setBackground(Color.RED);
            }
        }
        else{
                jt.setText("CALL ENDED");
                jbcall.setText("Call");
                jbcall.setBackground(Color.GREEN);
                num="";
        }
    }
}
class Main{
    public static void main(String args[]){
        GUI k=new GUI();
    }
}
