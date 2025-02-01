public class Inheritance{
    public static void main(String[] args) {
       Advcalc c=new Advcalc();
      int r1= c.add(10,10);
      int r2=c.sub(10,5);
      int r3=c.multi(20,30);
      int r4=c.div(30,10);
       System.out.println(r1 + " " + r2+ " " + r3+ " " + r4);
    }
}