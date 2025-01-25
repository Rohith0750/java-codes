public class threads extends Thread {
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }
    }
    public static void main(String []args){
        threads t1=new threads();
        threads t2=new threads();
        System.out.println("thread started");
        t1.start();
        t2.start();
       
    }
}
