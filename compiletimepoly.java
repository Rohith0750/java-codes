public class compiletimepoly {
    public void display() {
        System.out.println("No arguments");
    }

    public void display(int a) {
        System.out.println("One integer argument: " + a);
    }

    public void display(int a, int b) {
        System.out.println("Two integer arguments: " + a + " " + b);
    }

    public static void main(String[] args) {
        compiletimepoly obj = new compiletimepoly();
        obj.display();
        obj.display(5);
        obj.display(5, 10);
    }
    }
