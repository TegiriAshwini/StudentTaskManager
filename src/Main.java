import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Task Manager =====");

        System.out.print("Enter task 1: ");
        String task1 = sc.nextLine();

        System.out.print("Enter task 2: ");
        String task2 = sc.nextLine();

        System.out.println("\n===== Task List =====");
        System.out.println("1. " + task1);
        System.out.println("2. " + task2);

        sc.close();
    }
}