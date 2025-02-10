class Mythread extends Thread{
    String name;
    Mythread(String name){
        setName(name);
        this.name=name;
        System.out.println(name );
    }
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println(name + ":" + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(name+ "threadinterrupted");
        }
        System.out.println(name + "Thread existing");
    }
}
public class Main{
    public static void main(String[] args){
    Mythread obj1 = new Mythread("one");
    Mythread obj2 = new Mythread("two");
    Mythread obj3 = new Mythread("Three");
    obj1.start();
    obj2.start();
    obj3.start();
        try{
            Thread.sleep(8000);
            
        }catch(InterruptedException excetion){
            System.out.println("We are exiting");
        }
    }
}
