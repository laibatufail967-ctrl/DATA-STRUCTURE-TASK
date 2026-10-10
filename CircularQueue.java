import java.util.Scanner;

public class CircularQueue {
    static final int MAX = 5;
    static int[] queue = new int[MAX];
    static int front = 0;
    static int rear = -1;
    static int size = 0;

    static void enqueue(int value) {
        if (size == MAX) {
            System.out.println("Queue is full.");
            return;
        }

        rear = (rear + 1) % MAX;
        queue[rear] = value;
        size++;
        System.out.println("Element added.");
    }

    static void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Removed: " + queue[front]);
        front = (front + 1) % MAX;
        size--;
    }

    static void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }

        for (int i = 0; i < size; i++) {
            int index = (front + i) % MAX;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 6) {
            System.out.println("\n--- Circular Queue Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Check Empty");
            System.out.println("5. Check Full");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    enqueue(value);
                    break;

                case 2:
                    dequeue();
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    System.out.println(
                            size == 0 ? "Queue is empty."
                                      : "Queue is not empty.");
                    break;

                case 5:
                    System.out.println(
                            size == MAX ? "Queue is full."
                                        : "Queue is not full.");
                    break;

                case 6:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}