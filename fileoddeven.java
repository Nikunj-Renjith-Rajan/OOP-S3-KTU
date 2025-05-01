import java.io.*;
import java.util.*;
class Evennum extends Thread{
    public void run(){
        try {
            FileInputStream fin=new FileInputStream("num.txt");
            FileOutputStream fout1=new FileOutputStream("even.txt");
            int num=fin.read();
            while(num!=-1){
                if(num%2==0){
                    fout1.write(num);
                }
                num=fin.read();
            }
        }catch (IOException e) {
            System.out.println(e);
        }
    }
}
class Oddnum extends Thread{
    public void run(){
        try{
            FileInputStream fin=new FileInputStream("num.txt");
            FileOutputStream fout2=new FileOutputStream("odd.txt");
            int num=fin.read();
            while(num!=-1){
                if(num%2!=0){
                    fout2.write(num);
                }
                num=fin.read();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
class Main{
    public static void main(String args[]){
        Evennum ev=new Evennum();
        Oddnum od=new Oddnum();
        ev.start();
        od.start();
    }
}
