import java.util.Scanner;

// Base class
class Plate1 {
    double length, width;

    Plate1(double l, double w) {
        length = l;
        width = w;
        System.out.println("Plate constructor called");
    }
}

// Derived class
class Box4 extends Plate1 {
    double height;

    Box4(double l, double w, double h) {
        super(l, w);   // call Plate constructor
        height = h;
        System.out.println("Box constructor called");
    }
}

// Derived class of Box
class WoodBox1 extends Box4 {
    double thick;

    WoodBox1(double l, double w, double h, double t) {
        super(l, w, h);   // call Box constructor
        thick = t;
        System.out.println("WoodBox constructor called");
    }
}

class Dimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        System.out.print("Enter thickness: ");
        double t = sc.nextDouble();

        // Creating object of most derived class
        WoodBox1 wb = new WoodBox1(l, w, h, t);
    }
}
