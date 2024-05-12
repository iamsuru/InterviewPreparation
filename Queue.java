/*
    Queue -: It is an abstract data structure somewhat similar to Stack. 
            A Queue is an ordered collection of items from which items may be inserted at one one end called FRONT, and into which items may be deleted, called REAR.
                It is also known as FIFO Data Structure.

    Basic Operations -:
    1). add(E e) -: Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.

    2). element() -: Retrieves, but does not remove, the head of this queue.

    3). offer(E e) -: Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.

    4). peek() -: Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.

    5). poll() -: Retrieves and removes the head of this queue, or returns null if this queue is empty.

    6). remove() -: Retrieves and removes the head of this queue.

    7). size()

    8). isEmpty()

    9). rear()
 */

import java.util.*;

class SimpleQueueArray {
    int[] arr = new int[5];
    int rear = 0;
    int size = arr.length;

    boolean isEmpty() {
        return rear == 0;
    }

    boolean isFull() {
        return rear == size;
    }

    void add(int val) {
        if (isFull()) {
            System.out.println("Filled");
            return;
        }
        arr[rear++] = val;
        System.out.println(val + " is Enqueued");
    }

    void poll() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        System.out.println(arr[0] + " is dequed");
        for (int i = 0; i < rear - 1; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
    }

    void element() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        System.out.println(arr[0] + " is on Front");
    }

    void rear() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        System.out.println(arr[rear - 1] + " is on Reer");
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = 0; i < rear; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        SimpleQueueArray a = new SimpleQueueArray();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.poll();
        a.rear();
        a.print();
    }
}

class SimpleQueueUsingLL {
    static class QueueNode {
        int val;
        QueueNode next;

        QueueNode(int val) {
            this.val = val;
            next = null;
        }
    }

    static QueueNode front = null;
    static QueueNode rear = null;

    boolean isEmpty() {
        return front == null || rear == null;
    }

    void add(int val) {
        QueueNode newNode = new QueueNode(val);
        if (isEmpty()) {
            front = rear = newNode;
            System.out.println(newNode.val + " is Enqueued");
            return;
        }
        rear.next = newNode;
        rear = newNode;
        System.out.println(newNode.val + " is Enqueued");
    }

    void poll() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }

        int temp = front.val;
        front = front.next;
        System.out.println(temp);
    }

    void element() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        System.out.println(front.val + " is on front");
    }

    void rear() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        System.out.println(rear.val + " is on rear");
    }

    static void print() {
        if (front == null || rear == null) {
            System.out.println("Queue is Empty");
            return;
        }
        QueueNode currNode = front;
        while (currNode != null) {
            System.out.print(currNode.val + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SimpleQueueUsingLL s = new SimpleQueueUsingLL();
        s.add(1);
        s.add(2);
        s.add(3);
        s.element();
        print();
    }
}

class QueueUsingCF {
    // Questions
    // Q1. Queue Reversal
    // Approach 1-: Using Stack
    static void reverse_A1(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty()) {
            stack.push(q.poll());
        }
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
    }

    // Approach 2-: Using Recursion
    static void reverse_A2(Queue<Integer> q) {
        if (q.isEmpty())
            return;
        int front = q.poll();
        reverse_A2(q);
        q.add(front);
    }

    // Q2. First negative integer in every window of size k
    // Doubly Ended Queue -> 09:40 sec
    static long[] printFirstNegativeInteger(long nums[], int k) {
        return new long[0];
    }

    // Q3. Reverse First K elements of Queue
    // Approach-:1 using Stack
    static void reverseQueueK(Queue<Integer> q, int k) {
        // remove 1st k elements from queue
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < k; i++) {
            s.push(q.poll());
        }
        // fetch from stack and put into queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        // fetch n-k front value and put in into back to queue
        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.poll());
        }
        System.out.println(q);
    }

    // Q4. First non-repeating character in a stream
    // Approach -: using hashmap
    static String firstNonRepeating(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Queue<Character> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            q.add(ch);
            while (!q.isEmpty()) {
                if (map.get(q.element()) > 1)
                    q.poll();
                else {
                    sb.append(q.element());
                    break;
                }
            }
            if (q.isEmpty())
                sb.append('#');
        }
        return sb.toString();
    }

    // Q5. Circular Tour (skipped)

    // Q6. Interleave the first half of the queue with second half
    // Approach 1 - using queue
    static Queue<Integer> interleaveQueue_A1(Queue<Integer> q) {
        int half = q.size() / 2;
        Queue<Integer> newQ = new LinkedList<>();
        while (half != 0) {
            newQ.add(q.poll());
            half--;
        }
        while (!newQ.isEmpty()) {
            q.add(newQ.poll());
            q.add(q.poll());
        }
        return q;
    }

    // Approach 1 - using stack
    static Queue<Integer> interleaveQueue_A2(Queue<Integer> q) {
        int half = q.size() / 2;
        Stack<Integer> s = new Stack<>();

        while (half != 0) {
            s.push(q.poll());
            half--;
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        half = q.size() / 2;
        while (half != 0) {
            q.add(q.poll());
            half--;
        }
        //dobara isliy dale taki reverse hojay values jo front m h
        half = q.size() / 2;
        while (half != 0) {
            s.push(q.poll());
            half--;
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
            q.add(q.poll());
        }
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= 4; i++) {
            queue.add(i);
        }
        System.out.println(queue);
        System.out.println(interleaveQueue_A2(queue));
    }
}

/*
 * Circular Queue -: It is a type of queue in which all items are treated as
 * circular such that first node follows the last node.
 */
class CircularQueue {
    int arr[] = new int[5];
    int front = -1;
    int rear = -1;
    int size = arr.length;
    int result;

    boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    boolean isFull() {
        return (rear + 1) % size == front;
    }

    void Enqueue(int val) {
        if (isFull()) {
            System.out.println("Filled");
            return;
        }
        if (front == -1) {
            front = rear = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = val;
        System.out.println(arr[rear] + " is enqueued");
    }

    void Dequeue() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        result = arr[front];
        if (rear == front) {
            rear = front = -1;
        } else {
            front = (front + 1) % size;
        }
        System.out.println(result + " is dequeued");
    }

    void Front() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        System.out.println(arr[front] + " is on front");
    }

    void Rear() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        System.out.println(arr[rear] + " is on rear");
    }

    public static void main(String[] args) {
        CircularQueue c = new CircularQueue();
        c.Enqueue(1);
        c.Enqueue(2);
        c.Enqueue(3);
        c.Enqueue(4);
        c.Enqueue(5);
        c.Dequeue();
    }
}

/*
 * Doubly Ended Queue -: It is an abstract data type that generalizes a queue,
 * for which elements can be added to or removed from either the front (head) or
 * back (tail).
 */

class DoublyEndedQueue {

}