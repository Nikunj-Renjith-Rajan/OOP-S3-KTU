import java.io.*;
class Upper extends Thread{
    public void run(){
        try {
            FileInputStream fin=new FileInputStream("f1.txt");
            FileOutputStream fout1=new FileOutputStream("f2.txt");
            int u=fin.read();
            while(u!=-1){
                if(u>=65 && u<=90){
                    u+=32;
                    fout1.write(u);
                }
                u=fin.read();
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
class Lower extends Thread{
    public void run(){
        try {
            FileInputStream fin=new FileInputStream("f1.txt");
            FileOutputStream fout2=new FileOutputStream("f3.txt");
            int u=fin.read();
            while(u!=-1){
                if(u>=97 && u<=122){
                    u-=32;
                    fout2.write(u);
                }
                u=fin.read();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
class Main{
    public static void main(String[] args) {
        Upper up=new Upper();
        Lower low=new Lower();
        up.start();
        low.start();
    }
}
