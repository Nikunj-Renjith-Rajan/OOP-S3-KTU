import java.io.*;
class Main{
    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new FileReader("hello.txt"));
            int charCount=0;
            int wordsCount=0;
            int linesCount=0;
            String line;
            while((line=br.readLine())!=null){
                linesCount++;
                charCount+=line.length();
                String[] words=line.split("\\s+");
                wordsCount+=words.length;
            }
            br.close();
            System.out.println("lines="+linesCount);
            System.out.println("Char="+charCount);
            System.out.println("Words="+wordsCount);
        } 
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
