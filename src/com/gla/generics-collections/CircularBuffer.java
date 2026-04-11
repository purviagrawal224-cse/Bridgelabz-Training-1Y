import java.util.*;

class CircularBuffer<T> {

    Object[] arr;
    int size, front, rear, count;

    CircularBuffer(int size) {
        this.size = size;
        arr = new Object[size];
        front = 0;
        rear = 0;
        count = 0;
    }

    void add(T x) {
        arr[rear] = x;
        rear = (rear + 1) % size;

        if (count == size) front = (front + 1) % size;
	else count++;
    }
    void display() {
        int i = front;
        int c = 0;
        while(c<count) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % size;
            c++;
        }
        System.out.println();
    }
}
public class CircularBuffer {
    public static void main(String[] args) {
        CircularBuffer<Integer> b = new CircularBuffer<>(3);
        b.add(1);
        b.add(2);
        b.add(3);
        b.display();
        b.add(4);
        b.display();
    }
}