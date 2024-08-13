import java.io.*;

class Queue {
    int q[], front, rear;

    Queue() {
        q = new int[5];
        front = rear = -1;
    }

    void enqueue(int data) {
        if (rear + 1 == 5) {
            System.out.println("Queue is full");
        } else {
            if (rear == 4) {
                System.out.println("Queue is full");
            } else {
                if (front == -1) {
                    front = 0;
                }
                q[++rear] = data;
                System.out.println("Enqueued item is " + data);
            }
        }
    }

    void dequeue() {
        if (front == -1)
            System.out.println("Queue is empty");
        else {
            System.out.println("Dequeued item is :" + q[front]);
            if (front == rear) {
                // Reset the queue when the last element is dequeued
                front = rear = -1;
            } else {
                front++;
            }
        }
    }

    void display() {
        int i;
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("The Queue is:");
            for (i = front; i <= rear; i++) {
                System.out.println(q[i] + " ");
            }
            System.out.println();
        }
    }
}

public class QueueOperations {
    public static void main(String args[]) {
        int ch, n;
        System.out.println("Khadeeja Beevi C N");
        Queue q = new Queue();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            do {
                System.out.println(" 1-Insertion \n  2-Deletion \n 3-Display \n 4- exit Enter your choice : ");
                ch = Integer.parseInt(reader.readLine());

                switch (ch) {
                    case 1:
                        System.out.println("Enter the element to queue :");
                        n = Integer.parseInt(reader.readLine());
                        q.enqueue(n);
                        break;
                    case 2:
                        q.dequeue();
                        break;
                    case 3:
                        q.display();
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("invalid choice");
                        break;
                }
            } while (ch != 4);
        } catch (IOException e) {
            System.out.println("Error " + e);
        }
    }
}
