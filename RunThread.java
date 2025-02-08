class runmythread implements Runnable{
     public void run(){
        for (int i=0;i<=5;i++){
            System.out.println(i);
            System.out.println(Thread.currentThread());
        }
       
     }
}


public class RunThread {
    public static void main(String[] args) {
        runmythread obj = new runmythread();
        Thread t1 = new Thread(obj);

        runmythread obj2 = new runmythread();
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}

//
