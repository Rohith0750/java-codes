abstract class car{
    public abstarct void drive();
    public void playmusic()
    {
        System.out.println("Play music");
    }
}

class inova extends car
{
    public void drive(){
        System.out.println("Driving");
    }
}
public static void main(String a[]){
    car obj = new inova();
    obj.drive();
    obj.playmusic();
}

//acc to dynamic methoed dispath it will call ivova class drive but not the car drive methoed.
