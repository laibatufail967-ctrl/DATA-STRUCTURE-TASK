
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] marks = new int[2][3];
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n--- 2D Array Menu ---");
            System.out.println("1. Enter Marks");
            System.out.println("2. Display Matrix");
            System.out.println("3. Update Marks");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(
                                    "Student " + (i + 1)
                                    + ", Subject " + (j + 1) + ": ");
                            marks[i][j] = sc.nextInt();
                        }
                    }
                    System.out.println("Marks entered.");
                    break;

                case 2:
                    System.out.println("Marks Matrix:");

                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(marks[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Enter student row (0-1): ");
                    int row = sc.nextInt();

                    System.out.print("Enter subject column (0-2): ");
                    int col = sc.nextInt();

                    if (row >= 0 && row < 2
                            && col >= 0 && col < 3) {
                        System.out.print("Enter new marks: ");
                        marks[row][col] = sc.nextInt();
                        System.out.println("Marks updated.");
                    } else {
                        System.out.println("Invalid row or column.");
                    }
                    break;

                case 4:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}