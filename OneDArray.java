
import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Scenario: Store student marks in one integer array
        int[] marks = new int[10];
        int size = 0;
        int choice = 0;

        while (choice != 7) {
            System.out.println("\n--- Student Marks Management ---");
            System.out.println("1. Add Marks");
            System.out.println("2. Display Marks");
            System.out.println("3. Search Marks");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Marks by Index");
            System.out.println("6. Show Total Students");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (size == marks.length) {
                        System.out.println("Array is full.");
                    } else {
                        System.out.print("Enter marks: ");
                        marks[size] = sc.nextInt();

                        if (marks[size] < 0 || marks[size] > 100) {
                            System.out.println("Marks must be 0 to 100.");
                        } else {
                            size++;
                            System.out.println("Marks added.");
                        }
                    }
                    break;

                case 2:
                    if (size == 0) {
                        System.out.println("No marks available.");
                    } else {
                        for (int i = 0; i < size; i++) {
                            System.out.println("Index " + i
                                    + " = " + marks[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter marks to search: ");
                    int search = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < size; i++) {
                        if (marks[i] == search) {
                            System.out.println(
                                    "Found at index " + i);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Marks not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter index to update: ");
                    int updateIndex = sc.nextInt();

                    if (updateIndex >= 0 && updateIndex < size) {
                        System.out.print("Enter new marks: ");
                        int newMarks = sc.nextInt();

                        if (newMarks >= 0 && newMarks <= 100) {
                            marks[updateIndex] = newMarks;
                            System.out.println("Marks updated.");
                        } else {
                            System.out.println(
                                    "Marks must be 0 to 100.");
                        }
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 5:
                    System.out.print("Enter index to delete: ");
                    int deleteIndex = sc.nextInt();

                    if (deleteIndex >= 0 && deleteIndex < size) {
                        for (int i = deleteIndex; i < size - 1; i++) {
                            marks[i] = marks[i + 1];
                        }

                        size--;
                        System.out.println("Marks deleted.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 6:
                    System.out.println("Total students: " + size);
                    break;

                case 7:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
