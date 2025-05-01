//THREAD SYNCHRONIZATION-Nikunj Renjith Rajan,Roll No:16
class display{
    public synchronized void print(int num){
        System.out.print(" "+num);
        try{
            Thread.sleep(500);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
class ThreadSync extends Thread{
    private display d;
    private int num;
    public ThreadSync(display d,int num){
        this.d=d;
        this.num=num;
    }
    public void run(){
        d.print(num);
    }
}
class Main{
    public static void main(String[] args){
        int i;
        display d=new display();
        for(i=1;i<=5;i++){
            ThreadSync t1=new ThreadSync(d,i);
            t1.start();
        }
    }
}
/*OUTPUT
 0 1 2 3 4
 */
