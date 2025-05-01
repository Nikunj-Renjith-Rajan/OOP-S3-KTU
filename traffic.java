//TRAFFIC LIGHT-Nikunj Renjith Rajan,Roll no:16
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class GUI implements ActionListener{
    JFrame jf;
    JLabel jl;
    JRadioButton jr1,jr2,jr3;
    GUI(){
        jf=new JFrame("GUI");
        jl=new JLabel("Select");
        jl.setForeground(Color.BLUE);
        jr1=new JRadioButton();
        jr2=new JRadioButton();
        jr3=new JRadioButton();
        jf.setSize(300,300);
        jf.setVisible(true);
        GridLayout f=new GridLayout(4,1);
        jf.setLayout(f);
        ButtonGroup bg=new ButtonGroup();
        bg.add(jr1);
        bg.add(jr2);
        bg.add(jr3);
        jf.add(jl);
        jf.add(jr1);
        jf.add(jr2);
        jf.add(jr3);
        jr1.addActionListener(this);
        jr2.addActionListener(this);
        jr3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        if(jr1.isSelected()){
            jl.setText("STOP");
            jl.setForeground(Color.RED);
        }
        if(jr2.isSelected()){
            jl.setText("SET");
            jl.setForeground(Color.YELLOW);
        }
        if(jr3.isSelected()){
            jl.setText("GO");
            jl.setForeground(Color.GREEN);
        }
    }
}
class Main{
    public static void main(String[] args) {
        GUI g=new GUI();
    }
}
