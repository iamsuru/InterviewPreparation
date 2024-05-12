/*
    Data Structures -: A Data Structure is a particular way of organizing data in a computer so that it can be used efficiently.

    Types -: 1). Linear Data Structure
             2). Non-Linear Data Structure

    1). Linear Data Structure -: It a kind of Data Structure in which data items are organized in a sequential order one after the other.

    2). Non-Linear Data Structure -: It a kind of Data Structure in which data items are not organized in a sequential order. In a non-linear data structure, we can not traverse all the elements in a single run only.
 */

/*
    LinkedList -: It is a linear data structure which is generally a collection of node and node is a combination of data & address of next node.
        It is a dynamic data structure which can be grow or shrink at run time(no memory wastage). It is a non-continuous data structure.
            Insertion & Deletion is easy in Linked List as no shifting is needed.

    Types -: 1). Singly Linked List
             2). Doubly Linked List
             3). Circular Linked List
             4). Circular Doubly Linked List
    
    
    1). Singly Linked List -: It is the most basic linked list, which is made up of several nodes.
        Each Node is connected to another node as each node holds the address of the next node.
            The first node is called as HEAD & the last node is called as tail.
        
        Node -> [ val | next ]
 */

import java.util.*;

class SinglyLinkedList {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;

    // insertion at head
    static void insertAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // insertion at tail
    static void insertAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // insertion at specific position
    static void insertAtPosition(int pos, int val) {
        if (pos < 1) {
            System.out.println("Invalid position or Empty List.");
            return;
        }

        // insertion at head if pos is 1
        if (pos == 1 || head == null) {
            insertAtHead(val);
            return;
        }
        Node newNode = new Node(val);
        Node currNode = head;
        int count = 1;
        while (count < pos - 1) {
            currNode = currNode.next;
            count++;
        }

        // insertion at tail if the position is the last position
        if (currNode.next == tail) {
            insertAtTail(val);
            return;
        }

        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    // deletion of head
    static void deleteAtHead() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        int val = head.val;
        head = head.next;
        // Update tail if head becomes null after deletion
        if (head == null) {
            tail = null;
        }
        System.out.println(val + " is deleted.");
    }

    // deletion of tail
    static void deleteAtTail() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        if (head.next == null) {
            int val = head.val;
            head = tail = null;
            System.out.println(val + " is deleted.");
            return;
        }

        Node currNode = head;
        while (currNode.next != tail) {
            currNode = currNode.next;
        }

        int val = tail.val;
        currNode.next = null;
        tail = currNode;

        if (tail == null) {
            head = null;
        }
        System.out.println(val + " is deleted.");
    }

    // deletion of specific postion
    static void deleteAtPosition(int pos) {
        // if head
        if (pos == 1) {
            deleteAtHead();
            return;
        }
        Node currNode = head;
        Node prev = null;
        int count = 1;

        while (count < pos) {
            count++;
            prev = currNode;
            currNode = currNode.next;
        }
        // lastnode
        if (currNode == tail) {
            deleteAtTail();
            return;
        }
        prev.next = currNode.next;
    }

    // printing the list
    static void printList(Node head) {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.val + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Q1. Remove nth Node from the end of linked list (L - 19)
    /*
     * 1). brute force approach -: copy element into an array and remove that
     * position from array and than create an new list.
     * 
     * 2). get the length of linked list & traverse till the position and then
     * remove it.
     * 
     * 3).using 2 pointers approach -: when removing the nth node from the end of a
     * linked list using two pointers, we utilize a 'fast' and 'slow' pointer
     * approach. The 'fast' pointer moves 'n + 1' steps ahead while 'slow' remains
     * at the beginning. Then, both pointers advance simultaneously until 'fast'
     * reaches the end. At this point, 'slow' is positioned precisely before the
     * node to be removed. Adjusting pointers accordingly allows us to skip over and
     * remove the targeted node efficiently. This technique enables us to achieve
     * the task in a single pass through the list, making it a space-efficient and
     * linear-time solution.
     */

    static Node removeNthFromEnd(Node head, int pos) {
        // this handles the case when have to remove the first node
        Node dummy = new Node(0);
        dummy.next = head;
        Node slow = dummy;
        Node fast = dummy;
        // Move the fast pointer ahead by n+1 steps
        for (int i = 0; i <= pos; i++) {
            fast = fast.next;
        }
        // Move both pointers until the fast pointer reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
            if (fast == null) {
                System.out.print(" fast " + null);
            } else {
                System.out.print(" fast " + fast.val);
            }
            if (slow != null) {
                System.out.print(" slow " + slow.val);
            }
        }
        // Remove the nth node from the end
        slow.next = slow.next.next;
        return dummy.next;
    }

    // Q2. Reverse a LinkedList (L-206)

    // Approach 1 - using Loop
    static Node reverseList(Node head) {
        if (head == null || head.next == null)
            return head;
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    // Approach 2- using recursion
    public Node reverse(Node curr, Node prev) {
        if (curr == null) {
            return prev;
        }
        Node nextNode = curr.next;
        curr.next = prev;
        return reverse(nextNode, curr);
    }

    // Q3. Middle of the LinkedList (L-876)
    // Approach 1 - : Brute force approach, count the length of the list and find
    // mid then traverse till the mid and return mid

    static int middleNodeA1(Node head) {
        int length = 0;
        Node currNode = head;
        while (currNode != null) {
            length++;
            currNode = currNode.next;
        }
        int mid = length / 2;
        int count = 0;
        currNode = head;
        while (count < mid) {
            currNode = currNode.next;
            count++;
        }
        return currNode.val;
    }

    // Approach 2 -: using Floyd's Algorithm
    // suppose
    // Player A is a pro and covers 2m in 1 sec and take time n/2
    // while
    // Player B is a noob & covers 1m in 1 sec and take time n
    // means when player a finished the race player B will be in mid
    // of the track.

    static Node middleNodeA2(Node head) {
        if (head == null || head.next == null)
            return head;
        Node slow = head;
        Node fast = head.next;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast != null)
                fast = fast.next;
        }
        return slow;
    }

    // Q4. Reverse Linked ist in K group (L-25)
    // Approach - using recursion
    static Node reverseKGroup(Node head, int k) {
        if (head == null)
            return null;

        Node temp = head;
        int count = 0;

        // checking k nodes available or not
        while (count < k && temp != null) {
            temp = temp.next;
            count++;
        }

        // if it is
        if (count == k) {
            // reverse
            Node prev = null;
            Node curr = head;
            Node nextNode = null;
            int t = k;
            while (t > 0) {
                nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
                t--;
            }
            head.next = reverseKGroup(curr, k);
            return prev;
        } else {
            return head;
        }
    }

    // Q5. Remove Duplicates from sorted list (L-83)

    static Node removeDuplicates(Node head) {
        if (head == null)
            return null;
        Node curr = head;
        while (curr != null) {
            if (curr.next != null && curr.val == curr.next.val)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
        return head;
    }

    // Q5. Remove Duplicates from unsorted list
    // Approach 1-: O(n^2)
    static Node removeDuplicatesUnsorted(Node head) {
        if (head == null)
            return null;
        Node curr = head;
        while (curr != null) {
            Node temp = curr;
            while (temp != null) {
                if (temp.next != null && curr.val == temp.next.val)
                    temp.next = temp.next.next;
                else
                    temp = temp.next;
            }
            curr = curr.next;
        }
        return head;
    }
    // Approach 2-: Sort the list O(nlogn) and remove it O(n) == O(nlogn)
    // Approach 3-: using map<val,boolean> O(n)

    // Q6. Sort the list containing 0,1,2
    // Approach -: using data replacement
    static Node sortList012_A1(Node head) {
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        Node curr = head;
        while (curr != null) {
            if (curr.val == 0)
                zeroCount++;
            else if (curr.val == 1)
                oneCount++;
            else if (curr.val == 2)
                twoCount++;
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            if (zeroCount != 0) {
                curr.val = 0;
                zeroCount--;
            } else if (oneCount != 0) {
                curr.val = 1;
                oneCount--;
            } else if (twoCount != 0) {
                curr.val = 2;
                twoCount--;
            }
            curr = curr.next;
        }
        return head;
    }

    // Approach 2 -: changing links of node
    static Node sortList012_A2(Node head) {
        Node zeroHead = new Node(-1);
        Node zeroTail = zeroHead;
        Node oneHead = new Node(-1);
        Node oneTail = oneHead;
        Node twoHead = new Node(-1);
        Node twoTail = twoHead;

        Node curr = head;
        while (curr != null) {
            if (curr.val == 0) {
                zeroTail.next = curr;
                zeroTail = curr;
            } else if (curr.val == 1) {
                oneTail.next = curr;
                oneTail = curr;
            } else {
                twoTail.next = curr;
                twoTail = curr;
            }
            curr = curr.next;
        }

        // merge list
        zeroTail.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        oneTail.next = twoHead.next;
        twoTail.next = null;
        head = zeroHead.next;
        return head;
    }

    // Q7. Merge 2 sorted linked list (L-21)

    static Node mergeTwoList(Node head1, Node head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;

        if (head1.val <= head2.val) {
            return doMerging(head1, head2);
        } else {
            return doMerging(head2, head1);
        }
    }

    static Node doMerging(Node head1, Node head2) {
        if (head1.next == null)
            return head1.next = head2;
        Node curr1 = head1;
        Node curr2 = head2;
        Node next1 = head1.next;
        while (next1 != null && curr2 != null) {
            if (curr2.val >= head1.val && curr2.val <= next1.val) {
                curr1.next = curr2;
                Node next2 = curr2.next;
                curr2.next = next1;
                curr1 = curr1.next;
                curr2 = next2;
            } else {
                // if element doesnot lie between above case update curr1 and next1
                curr1 = next1;
                next1 = next1.next;
                if (next1 == null) {
                    curr1.next = curr2;
                    return head1;
                }
            }
        }
        return head1;
    }

    // Q8. check palindrome in LL
    // Approach 1 -: convert list to an array and than use two pointer approach and
    // solve iterate it until start<=end
    // TC- O(n) SC- O(n)
    static boolean isPalindrome_A1(Node head) {
        List<Integer> list = new ArrayList<>();
        Node curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        int s = 0;
        int e = list.size() - 1;
        while (s <= e) {
            if (list.get(s) != list.get(e))
                return false;
            s++;
            e--;
        }
        return true;
    }

    // Approach 2 -: TC - O(n) SC - O(1)
    static boolean isPalindrome_A2(Node head) {
        if (head.next == null)
            return true;
        Node middleNode = middle(head);
        middleNode.next = reverse_A2(middleNode.next);

        Node head1 = head, head2 = middleNode.next;

        while (head2 != null) {
            if (head1.val != head2.val)
                return false;
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;
    }

    static Node middle(Node head) {
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static Node reverse_A2(Node head) {
        Node prev = null;
        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    // Q9. Add two numbers
    // Type 1 front->end

    static Node addTwoNumbersFE(Node l1, Node l2) {
        int carry = 0;
        Node clone = new Node(-1);
        Node tail = clone;
        while (l1 != null || l2 != null || carry == 1) {
            int a = 0;
            int b = 0;
            if (l1 != null) {
                a = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                b = l2.val;
                l2 = l2.next;
            }
            int sum = a + b + carry;
            carry = sum / 10;
            Node newNode = new Node(sum % 10);
            tail.next = newNode;
            tail = newNode;
        }
        return clone.next;
    }

    // Type 2 end->front
    static Node addTwoNumbersEF(Node l1, Node l2) {
        // step 1 - do reverse
        l1 = reverseList(l1);
        l2 = reverseList(l2);

        // step 2 - do sum
        int carry = 0;
        Node clone = new Node(-1);
        Node temp = clone;
        while (l1 != null || l2 != null || carry == 1) {
            int a = 0;
            int b = 0;
            if (l1 != null) {
                a = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                b = l2.val;
                l2 = l2.next;
            }
            int sum = a + b + carry;
            carry = sum / 10;
            Node newNode = new Node(sum % 10);
            temp.next = newNode;
            temp = newNode;
        }
        return reverseList(clone.next);
    }

    public int getDecimalValue(Node head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(sb.toString(), 10);
    }

    // Q10. Sort List (L-148)

    private Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node left, Node right) {
        if (left == null)
            return right;
        if (right == null)
            return left;

        Node clone = new Node(-1);
        Node tail = clone;

        while (left != null && right != null) {
            if (left.val < right.val) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }

        if (left != null) {
            tail.next = left;
        }

        if (right != null) {
            tail.next = right;
        }
        return clone.next;
    }

    public Node sortList(Node head) {
        if (head == null || head.next == null)
            return head;

        Node mid = findMid(head);

        Node left = head;
        Node right = mid.next;
        mid.next = null;

        left = sortList(left);
        right = sortList(right);

        Node sortedList = merge(left, right);
        return sortedList;
    }

    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            insertAtHead(i);
        }
    }
}

/*
 * 2). Doubly Linked List -: It is a mutated version of Linked List.
 * The difference between a Singly & Doubly LinkedList is that Singly LL just
 * has reference to the next node while Doubly has reference to both previous
 * and next node.
 * 
 * Node -> [ prev | val | next ]
 */

class DoublyLinkedList {
    static class Node {
        int val;
        Node prev;
        Node next;

        Node(int val) {
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;

    // insertion at head
    static void insertAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            head.next = null;
            head.prev = null;
            return;
        }
        head.prev = newNode;
        newNode.prev = null;
        newNode.next = head;
        head = newNode;
    }

    // insertion at tail
    static void insertAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            head.next = null;
            head.prev = null;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Specific position
    static void insertAtPosition(int val, int pos) {
        Node newNode = new Node(val);
        Node currNode = head;

        if (head == null) {
            head = tail = newNode;
            head.next = null;
            head.prev = null;
            return;
        }

        if (pos == 1) {
            insertAtHead(val);
            return;
        }

        int count = 1;
        while (count < pos - 1) {
            currNode = currNode.next;
            count++;
        }

        if (currNode.next == null) {
            insertAtTail(val);
            return;
        }

        newNode.next = currNode.next;
        currNode.next = newNode;
        newNode.prev = currNode;
        newNode.next.prev = newNode;
    }

    // deletion of head
    static void deleteAtHead() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        if (head != tail) {
            head = head.next;
            head.prev = null;
            System.out.println("Deleted");
            return;
        }
        head = tail = null;
        System.out.println("Deleted");
    }

    // deletion of tail
    static void deleteAtLast() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        if (head.next == null) {
            System.out.println("Deleted");
            head = tail = null;
            return;
        }
        if (head != tail) {
            tail = tail.prev;
            tail.next = null;
            System.out.println("Deleted");
            return;
        }
        head = tail = null;
        System.out.println("Deleted");
    }

    // deletion of position
    static void deleteAtPosition(int pos) {
        if (head == null || pos < 1) {
            System.out.println("Empty or Invalid position");
            return;
        }

        if (pos == 1) {
            head = head.next;
            head.prev = null;
            return;
        }

        Node currNode = head;
        int count = 1;

        while (count < pos - 1) {
            currNode = currNode.next;
            count++;
        }
        if (currNode == tail) {
            tail = tail.prev;
            tail.next = null;
            return;
        }

        currNode.prev.next = currNode.next;
        currNode.next.prev = currNode.prev;
    }

    static void printList() {
        Node front = head;
        System.out.print("null->");
        while (front != null) {
            System.out.print(front.val + "->");
            front = front.next;
        }
        System.out.println("null");

        Node end = tail;
        System.out.print("null->");
        while (end != null) {
            System.out.print(end.val + "->");
            end = end.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insertAtHead(5);
        insertAtHead(4);
        insertAtTail(7);
        insertAtTail(10);
        insertAtPosition(20, 5);
        printList();
        deleteAtPosition(1);
        printList();
    }
}

/*
 * 3). Circular Linked List -: A circular linked list is a type of linked list
 * where the last node's next pointer does not point to null, as it does in a
 * regular singly linked list. Instead, it points back to the first node,
 * forming a circle or loop within the list. In other words, the next pointer of
 * the last node points to the first node, creating a circular structure.
 */

class CircularLinkedList {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    static Node head;
    static Node tail;

    // insertion at Head
    static void insertAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }
        Node currNode = head;
        while (currNode.next != head) {
            currNode = currNode.next;
        }
        newNode.next = head;
        currNode.next = newNode;
        head = newNode;
    }

    // insertion at Tail
    static void insertAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    // insertion at specific position
    static void insertAtPosition(int pos, int val) {
        if (head == null || pos == 1) {
            insertAtHead(val);
            return;
        }

        Node newNode = new Node(val);
        Node currNode = head;
        int count = 1;

        while (count < pos - 1) {
            currNode = currNode.next;
            count++;
            if (currNode == head) {
                System.out.println("Reached end cann't add at this position : " + pos + " because length of list is : "
                        + (count - 1));
                return;
            }
        }

        if (currNode.next == head) {
            insertAtTail(val);
            return;
        }

        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    // deletion of head
    static void deleteAtHead() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        int val = head.val;
        if (head == tail) {
            head = tail = null;
            System.out.println(val + " is deleted.");
            return;
        }
        head = head.next;
        tail.next = head;
        System.out.println(val + " is deleted.");
    }

    // deletion of tail
    static void deleteAtTail() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        int val = tail.val;
        if (head == tail) {
            head = null;
            tail = null;
            System.out.println(val + " is deleted.");
            return;
        }
        Node currNode = head;
        while (currNode.next != tail) {
            currNode = currNode.next;
        }
        currNode.next = head;
        tail = currNode;
        System.out.println(val + " is deleted.");
    }

    // deletion of specific postion
    static void deleteAtPosition(int pos) {
        if (pos == 1) {
            deleteAtHead();
            return;
        }
        Node currNode = head;
        Node prev = null;
        int count = 1;
        while (count <= pos - 1) {
            prev = currNode;
            currNode = currNode.next;
            count++;
            if (currNode == head) {
                System.out.println("Reached end cann't add at this position : " + pos + " because length of list is : "
                        + (count - 1));
                return;
            }
        }
        // lastnode
        if (currNode == tail) {
            deleteAtTail();
            return;
        }
        prev.next = currNode.next;
    }

    // print list
    static void printList() {
        if (head == null) {
            System.out.println("Circular linked list is empty.");
            return;
        }
        Node currNode = head;
        do {
            System.out.print(currNode.val + "->");
            currNode = currNode.next;
        } while (currNode != head);
        System.out.println("HEAD");
    }

    public static void main(String[] args) {

    }
}