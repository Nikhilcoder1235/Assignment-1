package Second;
import java.util.Scanner;

class Menu {
    int bill = 0;

    void order(int choice, int qty) {
        if (choice == 1)
            bill += qty * 50;
        else if (choice == 2)
            bill += qty * 20;
        else if (choice == 3)
            bill += qty * 30;
    }

    void generateBill() {
        System.out.println("Total Bill = Rs." + bill);
    }
}

public class Foodmenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu m = new Menu();
        int choice, qty;

        do {
            System.out.println("\n1.Dosa  2.Samosa  3.Idli  4.Generate Bill");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 3) {
                System.out.print("Enter quantity: ");
                qty = sc.nextInt();
                m.order(choice, qty);
            } else if (choice == 4) {
                m.generateBill();
            }

        } while (choice != 4);

        sc.close();
    }
}