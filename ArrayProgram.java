
import java.util.Scanner;

public class ArrayProgram {
    static final int MAX = 10;
    static int[] arr = new int[MAX];
    static int size = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- ARRAY MENU -----");
            System.out.println("1. Add value");
            System.out.println("2. Insert at index");
            System.out.println("3. Fill array");
            System.out.println("4. Delete last element");
            System.out.println("5. Delete by index");
            System.out.println("6. Display");
            System.out.println("7. Search value");
            System.out.println("8. Get value at index");
            System.out.println("9. Replace/Update value at index");
            System.out.println("10. Size");
            System.out.println("11. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    if (size == MAX) {
                        System.out.println("Array is full. Cannot add value.");
                    } else {
                        System.out.print("Enter value: ");
                        int value = input.nextInt();
                        arr[size] = value;
                        size++;
                        System.out.println("Value added successfully.");
                    }
                    break;

                case 2:
                    if (size == MAX) {
                        System.out.println("Array is full. Cannot insert.");
                    } else {
                        System.out.print("Enter index: ");
                        int index = input.nextInt();

                        if (index < 0 || index > size) {
                            System.out.println("Invalid index.");
                        } else {
                            System.out.print("Enter value: ");
                            int newValue = input.nextInt();

                            for (int i = size; i > index; i--) {
                                arr[i] = arr[i - 1];
                            }

                            arr[index] = newValue;
                            size++;
                            System.out.println("Value inserted successfully.");
                        }
                    }
                    break;

                case 3:
                    size = 0;
                    System.out.println("Enter values.");
                    System.out.println("Enter -1 to stop.");

                    while (size < MAX) {
                        System.out.print("Enter value: ");
                        int fillValue = input.nextInt();

                        if (fillValue == -1) {
                            break;
                        }

                        arr[size] = fillValue;
                        size++;
                    }

                    System.out.println("Array filled successfully.");
                    break;

                case 4:
                    if (size == 0) {
                        System.out.println("Array is empty. Nothing to delete.");
                    } else {
                        int deleted = arr[size - 1];
                        size--;
                        System.out.println("Deleted value: " + deleted);
                    }
                    break;

                case 5:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        System.out.print("Enter index to delete: ");
                        int deleteIndex = input.nextInt();

                        if (deleteIndex < 0 || deleteIndex >= size) {
                            System.out.println("Invalid index.");
                        } else {
                            int deletedValue = arr[deleteIndex];

                            for (int i = deleteIndex; i < size - 1; i++) {
                                arr[i] = arr[i + 1];
                            }

                            size--;
                            System.out.println("Deleted value: " + deletedValue);
                        }
                    }
                    break;

                case 6:
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        System.out.println("Array elements:");

                        for (int i = 0; i < size; i++) {
                            System.out.println("Index " + i + " = " + arr[i]);
                        }
                    }
                    break;

                case 7:
                    System.out.print("Enter value to search: ");
                    int searchValue = input.nextInt();
                    boolean found = false;

                    for (int i = 0; i < size; i++) {
                        if (arr[i] == searchValue) {
                            System.out.println("Value found at index: " + i);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Value does not exist.");
                    }
                    break;

                case 8:
                    System.out.print("Enter index: ");
                    int getIndex = input.nextInt();

                    if (getIndex < 0 || getIndex >= size) {
                        System.out.println("Invalid index.");
                    } else {
                        System.out.println(
                            "Value at index " + getIndex + " = " + arr[getIndex]
                        );
                    }
                    break;

                case 9:
                    System.out.print("Enter index: ");
                    int updateIndex = input.nextInt();

                    if (updateIndex < 0 || updateIndex >= size) {
                        System.out.println("Invalid index.");
                    } else {
                        System.out.print("Enter new value: ");
                        int updatedValue = input.nextInt();
                        arr[updateIndex] = updatedValue;
                        System.out.println("Value updated successfully.");
                    }
                    break;

                case 10:
                    System.out.println("Current size: " + size);
                    break;

                case 11:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 11);

        input.close();
    }
}
