import java.util.*;
class Complex{
    int real,imag;
    Complex(int real,int imag){
        this.real=real;
        this.imag=imag;
    }
    Complex complexAdd(Complex y){
        Complex z=new Complex(real+y.real,imag+y.imag);
        return z;
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter real and imaginary part of complex number a:");
        int r=sc.nextInt();
        int i=sc.nextInt();
        Complex a=new Complex(r,i);
        System.out.println("Enter real and imaginary part of complex number b:");
        r=sc.nextInt();
        i=sc.nextInt();
        Complex b=new Complex(r,i);
        Complex c=a.complexAdd(b);
        System.out.print("The sum of "+a.real+"+i"+a.imag+" and "+b.real+"+i"+b.imag+" is "+c.real+"+i"+c.imag);
    }
}
