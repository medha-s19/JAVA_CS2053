import java.util.Scanner;

class lab2 {
    public static void main(String[] args) {
        String n;
        int id;
        double sal;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name:");
        n = sc.nextLine();
        System.out.println("Enter employee id:");
        id = sc.nextInt();
        System.out.println("Enter employee salary:");
        sal = sc.nextDouble();

        System.out.println("Employee Details:");
        System.out.println("Name: " + n);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + sal);

        if (args.length > 0) {
            System.out.println("\nProcessing batch updates...");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Update " + (i + 1) + ": " + args[i]);
            }
        }
    }
}
