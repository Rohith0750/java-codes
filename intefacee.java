interface Vehicle {  
    void start();  // Abstract method
}

class Car implements Vehicle {  
    public void start() {  
        System.out.println("Car is starting...");
    }
}

public class intefacee{
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();  // Output: Car is starting...
    }
}
