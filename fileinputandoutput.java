//FILE COPY-Nikunj Renjith Rajan,Roll no:16
import java.io.*;
class Main{
    public static void main(String[] args) {
        try {
            FileInputStream fin=new FileInputStream("hello.txt");
            FileOutputStream fout=new FileOutputStream("hi.txt");
            int b;
            char c;
            do { 
                b=fin.read();
                if(b!=-1){
                    fout.write(b);
                    c=(char)b;  
                    System.out.print(c);
                }
            } while (b!=-1);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
/*OUTPUT
hello world
hi hello
gudmrng
gud afternoon
guf evng
 */
