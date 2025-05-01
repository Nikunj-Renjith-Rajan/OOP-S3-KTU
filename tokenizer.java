//STRING TOKENIZER-Nikunj Renjith Rajan,Roll No:16
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a set of numbers:");
        String str=sc.nextLine();
        StringTokenizer t=new StringTokenizer(str);
        int sum=0;
        while(t.hasMoreTokens()){
            String token=t.nextToken();
            int num=Integer.parseInt(token);
            System.out.println(num);
            sum+=num;
        }
        System.out.println("Sum="+sum);
    }
}
/*
OUTPUT
Enter a set of numbers:1 2 3 4 5 6
1
2
3
4
5
6
Sum=21 */
