import java.util.*;

public class Const_ovrld {

    int a, b;

    Const_ovrld() {
        a = 3;
        b = 4;
    }
    Const_ovrld(int x, int y) {
        a = x;
        b = y;
    }

    Const_ovrld(Const_ovrld obj) {
        a = obj.a;
        b = obj.b;
    }

    void display() {
        System.out.println("a: " + a + " b: " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int x = sc.nextInt();
        System.out.print("Enter value for b: ");
        int y = sc.nextInt();

        Const_ovrld obj1 = new Const_ovrld();
        Const_ovrld obj2 = new Const_ovrld(x, y);
        Const_ovrld obj3 = new Const_ovrld(obj2);

        System.out.println("Default constructor:");
        obj1.display();

        System.out.println("Parameterized constructor:");
        obj2.display();
        System.out.println("Copy constructor:");
        obj3.display();

        sc.close();
    }
}