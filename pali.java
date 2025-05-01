import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Pal implements ActionListener
{
    JFrame jf;
    JLabel jl;
    JTextField jt;
    JButton b1,b2;
    String s,s1,s2;
    int l;

    Pal() 
    {
        jf=new JFrame("Check plindrom");
        jf.setSize(400,400);
        jl=new JLabel("Enter String:");
        jt=new JTextField(20);
        b1=new JButton("Check");
        b2=new JButton("clear");
        FlowLayout f=new FlowLayout();
        jf.setLayout(f);
        jf.add(jl);
        jf.add(jt);
        jf.add(b1);
        jf.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        jf.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String s=ae.getActionCommand();
        if(s.equals("Check"))
        {
            s2="";
            s1=jt.getText();
            l=s1.length();
            for(int i=l-1;i>=0;i--)
            {
                s2+=s1.charAt(i);
            }
            if(s2.compareTo(s1)==0)
            {
                jt.setText("PALINDROME");
            }
            else
            {
                jt.setText("NOT PALINDROME");
            }
        }
        if(s.equals("clear"))
        {
            jt.setText("");
        }
    }
    
}
class pali{
    public static void main(String[] args) {
        Pal pa=new Pal();
    }
}
