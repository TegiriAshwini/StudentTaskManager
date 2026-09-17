import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Task Manager =====");

        System.out.print("Enter a task: ");
        String task = sc.nextLine();

        System.out.println("Task added successfully!");
        System.out.println("Task: " + task);

        sc.close();
    }
}