import java.util.Scanner;

class Sheet2D {
    protected double length;
    protected double breadth;
    protected final double RATE_2D = 40;

    void getDimensions(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double calculateCost() {
        double area = length * breadth;
        return area * RATE_2D;
    }
}
class Box3D extends Sheet2D {
    private double height;
    private final double RATE_3D = 60;

    void getDimensions(double length, double breadth, double height) {
        super.getDimensions(length, breadth);
        this.height = height;
    }

    double calculateCost() {
        double volume = length * breadth * height;
        return volume * RATE_3D;
    }
}

public class box {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter choice:");
        System.out.println("1. 2D Sheet");
        System.out.println("2. 3D Box");
        int choice = sc.nextInt();

        if (choice == 1) {
            Sheet2D sheet = new Sheet2D();
            System.out.print("Enter length: ");
            double l = sc.nextDouble();
            System.out.print("Enter breadth: ");
            double b = sc.nextDouble();

            sheet.getDimensions(l, b);
            System.out.println("Cost of plastic sheet: Rs " + sheet.calculateCost());
        }
        else if (choice == 2) {
            Box3D box = new Box3D();
            System.out.print("Enter length: ");
            double l = sc.nextDouble();
            System.out.print("Enter breadth: ");
            double b = sc.nextDouble();
            System.out.print("Enter height: ");
            double h = sc.nextDouble();

            box.getDimensions(l, b, h);
            System.out.println("Cost of plastic box: Rs " + box.calculateCost());
        }
        else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}