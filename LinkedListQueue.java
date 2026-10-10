import java.util.Scanner;

public class LinkedListQueue {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node front = null;
    static Node rear = null;
    static int size = 0;

    static void enqueue(int value) {
        Node newNode = new Node(value);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        System.out.println("Element added.");
    }

    static void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Removed: " + front.data);
        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    static void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Node current = front;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("\n--- Linked List Queue ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Show Size");
            System.out.println("5. Exit");
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
                    System.out.println("Queue size: " + size);
                    break;

                case 5:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}