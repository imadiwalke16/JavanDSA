import java.util.Scanner;

class Emp {
    int id;
    String name;

    Emp(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
class EmpRec {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Emp emp[] = new Emp[5];//array of objects
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter ID for employee " + (i + 1) + ": ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline
            System.out.println("Enter Name for employee " + (i + 1) + ": ");
            String name = sc.nextLine();
            emp[i] = new Emp(id, name);
        }
        System.out.println("Employee Records:");
        for (int i = 0; i < 5; i++) {
            emp[i].display();
        }
        sc.close(); // Close the Scanner to prevent resource leaks
    }
}