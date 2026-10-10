
import java.util.Scanner;

public class QueueProgram {
    static final int MAX = 10;
    static int[] queue = new int[MAX];
    static int front = 0;
    static int rear = -1;
    static int size = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- QUEUE MENU -----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    if (size == MAX) {
                        System.out.println("Queue Overflow. Queue is full.");
                    } else {
                        System.out.print("Enter value: ");
                        int value = input.nextInt();

                        rear++;
                        queue[rear] = value;
                        size++;

                        System.out.println("Value added to queue.");
                    }
                    break;

                case 2:
                    if (size == 0) {
                        System.out.println("Queue Underflow. Queue is empty.");
                    } else {
                        int removedValue = queue[front];

                        for (int i = 0; i < size - 1; i++) {
                            queue[i] = queue[i + 1];
                        }

                        rear--;
                        size--;

                        System.out.println("Dequeued value: " + removedValue);
                    }
                    break;

                case 3:
                    if (size == 0) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue elements (front to rear):");

                        for (int i = front; i <= rear; i++) {
                            System.out.println(queue[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Queue size: " + size);
                    break;

                case 5:
                    if (size == 0) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue is not empty.");
                    }
                    break;

                case 6:
                    if (size == MAX) {
                        System.out.println("Queue is full.");
                    } else {
                        System.out.println("Queue is not full.");
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

