public class Inheritance{
    public static void main(String[] args) {
       veryadvcalc c=new veryadvcalc();
      int r1= c.add(10,10);
      int r2=c.sub(10,5);
      int r3=c.multi(20,30);
      int r4=c.div(30,10);
      double r5=c.square(10,2);
       System.out.println(r1 + " " + r2+ " " + r3+ " " + r4+" "+r5);
    }
}


//here the calc and advcalc is single level inheritance.
//and calc and veryadvcalc is multi level inheritance.
//veryadvcalc is inhrits all the properties of calc and advcalc
