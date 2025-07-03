// Binary Search Tree -> A BST can be defined as a data structure that essentially fulfills the following properties -:

// 1). The left subtree must contains all the node containing the value lesser than the root node.

// 2). The right subtree must contains all the node containing the value greater than the root node.

// 3). BST does not contains duplicates.

// 4). Inorder traversal of BST gives a sorted sequence.

// 5). Complexity O(log N) or O(H) (H=height)

import java.util.*;

public class BinarySearchTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static TreeNode buildTree(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }
        if (root.val > val)
            root.left = buildTree(root.left, val);
        else
            root.right = buildTree(root.right, val);
        return root;
    }

    // Q1. Pre Order Traversal NLR
    static void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // Q2. Post Order Traversal LRN
    static void postOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    // Q3. In Order Traversal LNR
    static void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }

    // Q4. Level Order Traversal
    static void levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (curr == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curr.val + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    // Q5. Insertion in BST TC - O(logN)
    static TreeNode insertionInBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insertionInBST(root.left, val);
        } else if(val>root.val) {
            root.right = insertionInBST(root.right, val);
        }

        return root;
    }

    // Q5. Searching in a BST S.C - O(H) recursion
    static boolean searchInBST_A1(TreeNode root, int key) {
        if (root == null)
            return false;
        if (root.val > key)
            return searchInBST_A1(root.left, key);
        else if (root.val == key)
            return true;
        else
            return searchInBST_A1(root.right, key);
    }

    // iterative way
    static boolean searchInBST_A2(TreeNode root, int key) {
        TreeNode tmp = root;
        while (tmp != null) {
            if (tmp.val == key)
                return true;
            if (tmp.val > key)
                tmp = tmp.left;
            else
                tmp = tmp.right;
        }
        return false;
    }

    // Q6. Minimum value in a BST
    static int minVal(TreeNode root) {
        if (root == null)
            return 0;
        while (root.left != null) {
            root = root.left;
        }
        return root.val;
    }

    // Q7. Maximum value in a BST
    static int maxVal(TreeNode root) {
        if (root == null)
            return 0;
        while (root.right != null) {
            root = root.right;
        }
        return root.val;
    }

    // Q8. Deletion in a BST
    static TreeNode deletionInBST(TreeNode root, int key) {
        if (root == null)
            return root;
        if (root.val == key) {
            // No child
            if (root.left == null && root.right == null)
                return null;

            // One child
            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;

            // Two child
            if (root.left != null && root.right != null) {
                int min = minVal(root.right);
                root.val = min;
                root.right = deletionInBST(root.right, min);
                return root;
            }
            // Approach 2 for two child
            TreeNode is = inorderSuccessor(root.right);
            root.val = is.val;
            root.right = deletionInBST(root.right, is.val);
        }

        else if (root.val > key)
            root.left = deletionInBST(root.left, key);
        else
            root.right = deletionInBST(root.right, key);
        return root;
    }

    // Q9. inorder successor
    static TreeNode inorderSuccessor(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Q10. Inorder predecessor
    static TreeNode inorderPredecessor(TreeNode root) {
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }

    // Q11. Inorder Successor Predecessor

    static void inOrderSuccessorAndPredecessor_A1(TreeNode root, int k) {
        List<Integer> is = inOrderTraversal2(root);
        for (int i = 0; i < is.size(); i++) {
            if (is.get(i) == k) {
                System.out.printf("InOrder Successor = %d and InOrder Predecessor = %d", is.get(i + 1), is.get(i - 1));
            }
        }
    }

    static void inOrderSuccessorAndPredecessor_A2(TreeNode root, int key) {
        TreeNode tmp = root;
        int pred = -1;
        int succ = -1;
        while (tmp.val != key) {
            if (tmp.val > key) {
                succ = tmp.val;
                tmp = tmp.left;
            } else {
                pred = tmp.val;
                tmp = tmp.right;
            }
        }

        // pred
        TreeNode leftTree = tmp.left;
        while (leftTree != null) {
            pred = leftTree.val;
            leftTree = leftTree.right;
        }

        // succ
        TreeNode rightTree = tmp.right;
        while (rightTree != null) {
            succ = rightTree.val;
            rightTree = rightTree.left;
        }

        System.out.printf("InOrder Successor = %d and InOrder Predecessor = %d", succ, pred);
    }

    // Q11. Validate BST
    // Approach 1 - Get Inorder traversal as it provides sorted order values and
    // check it. TC - O(n) & SC - O(n)
    static List<Integer> list = new ArrayList<>();

    static List<Integer> inOrderTraversal2(TreeNode root) {
        if (root == null) {
            return list;
        }
        inOrderTraversal2(root.left);
        list.add(root.val);
        inOrderTraversal2(root.right);
        return list;
    }

    static boolean validateBST_A1(TreeNode root) {
        List<Integer> list = inOrderTraversal2(root);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) > list.get(i))
                return false;
        }
        return true;
    }

    // Approach 2 - TC - O(n) SC - O(h)
    static boolean validateBST_A2(TreeNode root) {
        if (root == null)
            return true;
        validateBST_A2(root.left);
        if ((root.left != null && root.left.val > root.val) || (root.right != null && root.right.val < root.val))
            return false;
        validateBST_A2(root.right);
        return true;
    }

    // Approach 3 - TC - O(n) SC - O(h)
    static boolean isBST(TreeNode root, Integer min, Integer max) {
        if (root == null)
            return true;

        if ((min != null && root.val <= min) || (max != null && root.val >= max))
            return false;

        boolean left = isBST(root.left, min, root.val);
        boolean right = isBST(root.right, root.val, max);

        return left && right;
    }

    static boolean validateBST_A3(TreeNode root) {
        return isBST(root, null, null);
    }

    // Q12. find K-th smallest element in BST
    // Approach - 1 -> Using Inorder traversal TC - O(n) SC - O(n)
    static int kthSmallestElement_A1(TreeNode root, int k) {
        List<Integer> list = inOrderTraversal2(root);
        return list.get(k - 1);
    }

    // Approach - 2 -> TC - O(n) SC - O(h)
    static int solveForQ12(TreeNode root, int k, int i) {
        if (root == null)
            return -1;

        int left = solveForQ12(root.left, k, i);
        if (left != -1)
            return left;
        i++;
        if (i == k)
            return root.val;
        return solveForQ12(root.right, k, i);
    }

    static int kthSmallestElement_A2(TreeNode root, int k) {
        return solveForQ12(root, k, 0);
    }

    public static void main(String[] args) {
        TreeNode root = null;
        System.out.print("Enter values : ");
        int[] nodes = { 10, 6, 2, 12, 11, 8, 15 };
        // 10 8 21 7 27 5 4 3 -1
        for (int n : nodes) {
            root = buildTree(root, n);
        }
        System.out.println();
        levelOrderTraversal(root);
    }
}