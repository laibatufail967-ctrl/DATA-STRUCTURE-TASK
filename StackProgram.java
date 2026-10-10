
import java.util.Scanner;

public class StackProgram {
    static final int MAX = 10;
    static int[] stack = new int[MAX];
    static int top = -1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- STACK MENU -----");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    if (top == MAX - 1) {
                        System.out.println("Stack Overflow. Stack is full.");
                    } else {
                        System.out.print("Enter value: ");
                        int value = input.nextInt();

                        top++;
                        stack[top] = value;

                        System.out.println("Value pushed successfully.");
                    }
                    break;

                case 2:
                    if (top == -1) {
                        System.out.println("Stack Underflow. Stack is empty.");
                    } else {
                        int poppedValue = stack[top];
                        top--;

                        System.out.println("Popped value: " + poppedValue);
                    }
                    break;

                case 3:
                    if (top == -1) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack elements (top to bottom):");

                        for (int i = top; i >= 0; i--) {
                            System.out.println(stack[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Stack size: " + (top + 1));
                    break;

                case 5:
                    if (top == -1) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;

                case 6:
                    if (top == MAX - 1) {
                        System.out.println("Stack is full.");
                    } else {
                        System.out.println("Stack is not full.");
                    }
                    break;

                case 7:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        input.close();
    }
}

