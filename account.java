import java.util.Scanner;
class Acc {
     long acc_no;
     double balance;
    void input(Scanner sc) {
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextLong();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }
    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: Rs " + balance);
    }
}
class Person extends Acc {
    String name;
    long aadhar_no;
    void input(Scanner sc) {
        System.out.print("Enter Name: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextLong();
        super.input(sc);
    }
    @Override
    void disp() {
        System.out.println("\n--- Person Details ---");
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
        super.disp();
    }
}
public class account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] persons = new Person[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details of Person " + (i + 1));
            persons[i] = new Person();
            persons[i].input(sc);
        }
        System.out.println("Details of All Persons");
        for (int i = 0; i < 3; i++) {
            persons[i].disp();
        }

        sc.close();
    }
}
