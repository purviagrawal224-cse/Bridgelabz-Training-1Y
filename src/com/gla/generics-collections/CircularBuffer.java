import java.util.*;
public class CircularBufferSimulation {
    static class CircularBuffer {
        int[] arr;
        int size, front, rear;
        CircularBuffer(int size) {
            this.size = size;
            arr = new int[size];
            front = 0;
            rear = 0;
        }
        void insert(int val) {
            arr[rear] = val;
            rear = (rear + 1) % size;
            if (rear == front) front = (front + 1) % size;
        }
        void display() {
            int i = front;
            do {
                System.out.print(arr[i] + " ");
                i = (i + 1) % size;
            } while (i != rear);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter buffer size: ");
        int n = sc.nextInt();
        CircularBuffer cb = new CircularBuffer(n);
        System.out.print("Enter number of elements: ");
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            cb.insert(x);
        }
        System.out.println("Buffer:");
        cb.display();
    }
}
