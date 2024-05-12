/*
    Stacks -: It is a linear data structure that follows a particular order in which the operation are performed. The order may be LIFO or FILO, that means the element which is inserted first will removed at last.

    Operations -: 1). Push
                  2). Pop
                  3). Peek
                  4). isEmpty
 */

import java.util.*;

//Using Array ->  fixed size array is implemented using this method. Also a hectic process.

class StackUsingArray {
    int size;
    int top = -1;
    int arr[];

    StackUsingArray(int size) {
        arr = new int[size];
        this.size = size;
    }

    boolean isEmpty() {
        return (top < 0);
    }

    void push(int val) {
        if (top >= (size - 1)) {
            System.out.println("Overflow");
            return;
        }
        arr[++top] = val;
        System.out.println(val + " is pushed into stack");
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return;
        }
        int popVal = arr[top--];
        System.out.println(popVal + " is poped from stack");

    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return;
        }
        System.out.println(arr[top] + " is on peek in stack");
    }

    void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }


    int size() {
        return this.top + 1;
    }

    public static void main(String[] args) {
        StackUsingArray s = new StackUsingArray(3);
        s.push(1);
        s.push(2);
        s.push(3);
        s.print();
        System.out.println(s.size());
    }
}

// Using ArrayList -> This method is variable size. The ArrayList class is a
// resizeable array. The difference between built in array and an arraylist in
// Java is that size of an array can not be modified, but in ArrayList size is
// automatically increasing or decreasing.

class StackUsingAL {
    ArrayList<Integer> list = new ArrayList<>();

    boolean isEmpty() {
        return list.size() == 0;
    }
    void push(int val) {
        list.add(val);
        System.out.println(val + " is pushed");
    }
    void pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return;
        }
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        System.out.println(top + " is poped");
    }
    void peek() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return;
        }
        System.out.println(list.get(list.size() - 1) + " is on peek");
    }
    void print() {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
    int size() {
        return this.list.size();
    }
    public static void main(String[] args) {
        StackUsingAL s = new StackUsingAL();
        s.push(1);
        s.push(2);
        s.push(3);
        s.print();
        System.out.println(s.size());
    }
}


class StackUsingLL {
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            next = null;
        }
    }

    Node head;
    int length = 0;

    boolean isEmpty() {
        return head == null;
    }

    void push(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            head = newNode;
            length++;
            System.out.println(val + " is pushed");
            return;
        }
        newNode.next = head;
        head = newNode;
        length++;
        System.out.println(val + " is pushed");
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return;
        }
        int top = head.val;
        head = head.next;
        length--;
        System.out.println(top + " is poped");
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return;
        }
        System.out.println(head.val + " is on peek");
    }

    void print() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.val + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    int size() {
        return this.length;
    }

    public static void main(String[] args) {
        StackUsingLL s = new StackUsingLL();
        s.push(1);
        s.push(2);
        s.push(3);
        s.print();
        System.out.println("Size " + s.size());
        s.pop();
        System.out.println("Size " + s.size());
    }
}

class StackUsingCF {
    // Q1. Reverse a string using stack
    static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    // Q2. delete middle element of stack
    static void deleteMiddle(Stack<Integer> s, int size, int count) {
        if (count == size / 2) {
            s.pop();
            return;
        }
        int top = s.pop();
        deleteMiddle(s, size, count + 1);
        s.push(top);
    }

    // Q3. Valid Paranthesis (L-20)
    static boolean isValidParanthesis(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(')
                st.push(')');
            else if (ch == '{')
                st.push('}');
            else if (ch == '[')
                st.push(']');
            else if (st.isEmpty() || st.pop() != ch)
                return false;
        }
        return st.isEmpty();
    }
    // Q4. insert an element at its bottom in a given stack
    static void pushAtBottom(Stack<Integer> s, int i) {
        if (s.empty()) {
            s.push(i);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, i);
        s.push(top);
    }

    // Q5. reverse stack using recursion
    static void reverseStack(Stack<Integer> s) {
        if (s.empty())
            return;
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    // Q6. sort a stack
    static void sortedInsert(Stack<Integer> s, int num) {
        if (s.empty() || (s.peek() < num)) {
            s.push(num);
            return;
        }
        int top = s.pop();
        sortedInsert(s, num);
        s.push(top);
    }

    static void sortStack(Stack<Integer> s) {
        if (s.empty())
            return;
        int top = s.pop();
        sortStack(s);
        sortedInsert(s, top);
    }

    // Q7. Redundant brackets
    static boolean findRedundantBracket(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                stack.push(ch);
                System.out.println(stack);
            } else {
                if (ch == ')') {
                    boolean isRedundant = true;
                    while (stack.peek() != '(') {
                        char top = stack.peek();
                        if (top == '+' || top == '-' || top == '*' || top == '/') {
                            isRedundant = false;
                        }
                        stack.pop();
                    }
                    if (isRedundant == true) {
                        return true;
                    }
                    stack.pop();
                }
            }
        }
        return false;
    }








    
    // Q8. Minimun cost to make String valid
    // Approach 1
    static int findMinimumCost_A1(String str) {
        // odd condition so not possible to make valid string
        if (str.length() % 2 == 1)
            return -1;
        Stack<Character> s = new Stack<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{') {
                s.push('{');
            } else if (ch == '}' && !s.isEmpty()) {
                s.pop();
            } else if (s.empty()) {
                count++;
            }
        }
        if (s.size() % 2 == 0)
            count += s.size() / 2;
        return count;
    }

    // Approach 2
    static int findMinimumCost_A2(String str) {
        // odd condition
        if (str.length() % 2 == 1)
            return -1;
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{') {
                s.push('{');
            } else {
                if (!s.isEmpty() && s.peek() == '{') {
                    s.pop();
                } else {
                    s.push(ch);
                }
            }
        }
        // string contains invalid expression
        int a = 0;
        int b = 0;
        while (!s.empty()) {
            if (s.pop() == '{')
                a++;
            else
                b++;
        }
        int ans = ((a + 1) / 2) + ((b + 1) / 2);
        return ans;
    }

    // Q9. Next smaller element
    // Approach 1 - Brute force approach O(n^2)

    // Approach 2 - O(n)
    static int[] nextSmallerElement(int[] nums) {
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        int[] ans = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            int curr = nums[i];
            while (s.peek() >= curr) {
                s.pop();
            }
            ans[i] = s.peek();
            s.push(curr);
        }
        return ans;
    }

    // Q10. Largest Rectangle in Histogram (L-84)
    // Approach 1 Brute Force Approach O(n^3)
    static int largestRectangleArea_A1(int[] heights) {
        int maxArea = 0;
        int length = heights.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                int minHeight = Integer.MAX_VALUE;
                for (int k = i; k <= j; k++) {
                    minHeight = Math.min(minHeight, heights[k]);
                }
                int area = minHeight * (j - i + 1);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

    // Approach 2- Using Stack
    static int[] prevSmallerElement(int[] heights, int n) {
        int[] prev = new int[n];
        Stack<Integer> s = new Stack<>();
        s.push(-1);

        for (int i = 0; i < n; i++) {
            int curr = heights[i];
            while (s.peek() != -1 && heights[s.peek()] >= curr) {
                s.pop();
            }
            prev[i] = s.peek();
            s.push(i);
        }
        return prev;
    }

    static int[] nextSmallerElement(int[] heights, int n) {
        int[] next = new int[n];
        Stack<Integer> s = new Stack<>();
        s.push(-1);

        for (int i = n - 1; i >= 0; i--) {
            int curr = heights[i];
            while (s.peek() != -1 && heights[s.peek()] >= curr) {
                s.pop();
            }
            next[i] = s.peek();
            s.push(i);
        }
        return next;
    }

    static int largestRectangleArea_A2(int[] heights) {
        int maxArea = 0;
        int n = heights.length;
        int[] next = new int[n];
        next = nextSmallerElement(heights, n);

        int[] prev = new int[n];
        prev = prevSmallerElement(heights, n);

        for (int i = 0; i < n; i++) {
            int l = heights[i];
            if (next[i] == -1)
                next[i] = n;
            int b = next[i] - prev[i] - 1;
            int newArea = l * b;
            maxArea = Math.max(maxArea, newArea);
        }
        return maxArea;
    }

    // Q11. Celebrity Problem
    // Approach 1 - O(n^2)
    static int celebrityProblem_A1(int[][] m) {
        int ans = -1;
        for (int i = 0; i < m.length; i++) {
            boolean isCelebrity = true;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 1) {
                    isCelebrity = false;
                    break;
                }
            }
            if (isCelebrity) {
                for (int j = 0; j < m[i].length; j++) {
                    if ((j != i) && m[j][i] == 0) {
                        isCelebrity = false;
                        break;
                    }
                }
            }
            if (isCelebrity) {
                ans = i;
            }
        }
        return ans;
    }

    // Approach 2 - O(n)
    static boolean known(int[][] m, int a, int b) {
        if (m[a][b] == 1)
            return true;
        else
            return false;
    }

    static int celebrityProblem_A2(int[][] m, int n) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            s.push(i);
        }

        while (s.size() > 1) {
            int a = s.pop();
            int b = s.pop();

            if (known(m, a, b)) {
                s.push(b);
            } else {
                s.push(a);
            }
        }

        // only 1 left means may be a celebrity

        int candidate = s.pop();

        int zeroCount = 0;
        for (int i = 0; i < n; i++) {
            if (m[candidate][i] == 0)
                zeroCount++;
        }

        int oneCount = 0;
        for (int i = 0; i < n; i++) {
            if (m[i][candidate] == 1)
                oneCount++;
        }

        if (oneCount == n - 1 && zeroCount == n)
            return candidate;
        else
            return -1;
    }

    // Q12. maximalRectangle (L-85)

    static int maximalRectangle(int[][] matrix) {
        int area = largestRectangleArea_A2(matrix[0]);
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    matrix[i][j] = matrix[i][j] + matrix[i - 1][j];
                } else {
                    matrix[i][j] = 0;
                }
            }
            area = Math.max(area, largestRectangleArea_A2(matrix[i]));
        }
        return area;
    }

    public static void main(String[] args) {
        int[][] m = new int[][] { { 0, 1, 0 }, { 0, 0, 0 }, { 0, 1, 0 } };
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(celebrityProblem_A2(m, m.length));
    }
}