/*
 * Tree -: A Tree is a hierarchical data structure, which has one root and
 * multiple child nodes(branches). A Tree is a non linear data structure.
 * 
 * Root -: The topmost node of a tree.
 * 
 * Parent -: Any node which has an edge directed downwards to the child node.
 * 
 * Child -: Any node which has an edge directed upwards to the child node.
 * 
 * Sibling -: A set of nodes that are extended from the same parent.
 * 
 * Leaf -: Any Node that does not have any child.
 * 
 * Branch -: Any Node which has atleast one child node.
 * 
 * Degree -: The degree of a node can be defined as it's number of subtrees.
 * 
 * Edge -: A link from one node to another.
 * 
 * Ancestor -: Parent of every child node is ancestor of that child
 * 
 * Descendant -: Child of every parent node is descedant of that parent.
 * 
 * Height -: Length of longest path between root node & leaf node.
 */

/*
 * Binary Tree -: A Binary Tree can be defined as a finite set of elements,
 * which can either be empty or have atleast two children.
 * 
 * (ii). The order of a binary tree is 2.
 * 
 * (iii). Height of a binary tree is equal to the height of the root node.
 */

import java.util.*;

class BinaryTree {
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

    static TreeNode buildTree(TreeNode root) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter data : ");
        int val = sc.nextInt();

        root = new TreeNode(val);

        if (val == -1) {
            return null;
        }

        System.out.print("for left of " + val + " ");
        root.left = buildTree(root.left);
        System.out.print("for right of " + val + " ");
        root.right = buildTree(root.right);
        return root;
    }

    // Approach 2 building preorder given sequence tree
    static int idx = -1;

    static TreeNode buildTree_A2(int[] nodes) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        TreeNode root = new TreeNode(nodes[idx]);
        root.left = buildTree_A2(nodes);
        root.right = buildTree_A2(nodes);
        return root;
    }

    // Q1. Level Order Traversal
    static void levelOrder(TreeNode root) {
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

    // Q2. Pre Order Traversal NLR
    static void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Q3. Post Order Traversal LRN

    static void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    // Q4. In order Traversal LNR
    static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // Q5. build from level order
    static TreeNode buildFromLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("root data : ");
        int val = sc.nextInt();

        root = new TreeNode(val);

        q.add(root);

        while (!q.isEmpty()) {
            TreeNode tmp = q.peek();
            q.poll();
            System.out.print("enter left node for " + tmp.val + " ");
            int leftData = sc.nextInt();

            if (leftData != -1) {
                tmp.left = new TreeNode(leftData);
                q.add(tmp.left);
            }

            System.out.print("enter right node for " + tmp.val + " ");
            int rightData = sc.nextInt();

            if (rightData != -1) {
                tmp.right = new TreeNode(rightData);
                q.add(tmp.right);
            }
        }
        sc.close();
        return root;
    }

    // Q6. Count leaf nodes
    static int countLeafNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }
        int leftCount = countLeafNodes(root.left);
        int rightCount = countLeafNodes(root.right);
        return leftCount + rightCount;
    }

    // Q7. Height/Depth of binary tree TC - O(n) & SC - O(height)
    static int heightOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = heightOfBinaryTree(root.left);
        int rightHeight = heightOfBinaryTree(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Q8. Diameter of Binary Tree - longest path(total nodes) b/w any two nodes,
    // also known as width
    // approach 1 O(n^2)

    static int diameter1(TreeNode root) {
        if (root == null)
            return 0;
        int dia_1 = diameter1(root.left);
        int dia_2 = diameter1(root.right);
        int dia_3 = heightOfBinaryTree(root.left) + heightOfBinaryTree(root.right) + 1;
        return Math.max(dia_1, Math.max(dia_2, dia_3));
    }

    // approach 2 O(n)
    static class DiaInfo {
        int height;
        int diameter;

        DiaInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    DiaInfo diameter2(TreeNode root) {
        if (root == null)
            return new DiaInfo(0, 0);
        DiaInfo d1 = diameter2(root.left);
        DiaInfo d2 = diameter2(root.right);
        int maxHeight = Math.max(d1.height, d2.height) + 1;

        int dia_1 = d1.diameter;
        int dia_2 = d2.diameter;
        int dia_3 = d1.height + d2.height + 1;
        int myDia = Math.max(dia_1, Math.max(dia_2, dia_3));
        return new DiaInfo(maxHeight, myDia);
    }

    // Q9. check for balanced tree
    // approach 1 O(n^2)
    // A tree is called height balanced if difference between heights of left and
    // right subtrees is not more than one for all nodes
    boolean isBalanced(Node root) {
        if (root == null) return true;
        
        int leftHeight = heightOfBinaryTree(root.left);
        int rightHeight = heightOfBinaryTree(root.right);
        
        boolean heightBalanced = Math.abs(leftHeight - rightHeight) <= 1;
        
        boolean leftBalanced = isBalanced(root.left);
        boolean rightBalanced = isBalanced(root.right);
        
        return heightBalanced && leftBalanced && rightBalanced;
    }

    // Q10. Determine if two trees are identical O(n)
    static boolean isIdentical(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null && root2 != null) {
            return false;
        }
        if (root1 != null && root2 == null) {
            return false;
        }

        boolean left = isIdentical(root1.left, root2.left);
        boolean right = isIdentical(root1.right, root2.right);

        boolean value = (root1.val == root2.val);

        if (value && left && right) {
            return true;
        } else {
            return false;
        }
    }

    // Q11. Sum tree
    static boolean isSumTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }

        // Recursively check if left and right subtrees are sum trees
        boolean leftSumTree = isSumTree(root.left);
        boolean rightSumTree = isSumTree(root.right);

        // If any of the subtrees is not a sum tree, return false
        if (!leftSumTree || !rightSumTree) {
            return false;
        }

        // Check if the current node satisfies the sum tree property
        int leftSum = root.left == null ? 0 : root.left.val;
        int rightSum = root.right == null ? 0 : root.right.val;

        return root.val == leftSum + rightSum;
    }

    // Q12. Zig Zag or Spiral Traversal TC - O(n) SC - O(n)
    static ArrayList<Integer> zigZagTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean LeftToRight = true;
        while (!q.isEmpty()) {
            int size = q.size();
            int[] tmp = new int[size];

            for (int i = 0; i < size; i++) {
                TreeNode front = q.poll();
                int idx = LeftToRight ? i : size - 1 - i;
                tmp[idx] = front.val;

                if (front.left != null) {
                    q.add(front.left);
                }

                if (front.right != null) {
                    q.add(front.right);
                }
            }

            LeftToRight = !LeftToRight;

            for (int v : tmp) {
                ans.add(v);
            }
        }
        return ans;
    }

    // Q13. Boundary Traversal
    /*
     * Approach -> i). Add left side node except leaf node
     * ii). Add all leaf nodes
     * iii). Add right side nodes except leaf node
     */

    static ArrayList<Integer> boundaryTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        ans.add(root.val);
        // left part
        traverseLeft(root.left, ans);

        traverseLeaf(root.left, ans);
        traverseLeaf(root.right, ans);

        traverseRight(root.right, ans);
        return ans;
    }

    static void traverseLeft(TreeNode root, ArrayList<Integer> ans) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            return;
        }

        ans.add(root.val);
        if (root.left != null) {
            traverseLeft(root.left, ans);
        } else {
            traverseLeft(root.right, ans);
        }
    }

    static void traverseRight(TreeNode root, ArrayList<Integer> ans) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            return;
        }

        if (root.right != null) {
            traverseRight(root.right, ans);
        } else {
            traverseRight(root.left, ans);
        }
        ans.add(root.val);
    }

    static void traverseLeaf(TreeNode root, ArrayList<Integer> ans) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            ans.add(root.val);
        }

        traverseLeaf(root.left, ans);
        traverseLeaf(root.right, ans);
    }

    // Q14. Top view of a BT
    static ArrayList<Integer> topView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        leftMost(root.left, ans);
        ans.add(root.val);
        rightMost(root.right, ans);
        return ans;
    }

    static void leftMost(TreeNode root, ArrayList<Integer> ans) {
        if (root == null)
            return;
        leftMost(root.left, ans);
        ans.add(root.val);
    }

    static void rightMost(TreeNode root, ArrayList<Integer> ans) {
        if (root == null)
            return;
        ans.add(root.val);
        rightMost(root.right, ans);
    }

    // Q15. Morris Traversal for InOrder TC - O(n) SC - O(1)

    // Morris Traversal leverages the concept of threading a binary tree. The key
    // idea is to make use of the tree's null pointers to temporarily create links
    // (or threads) to the predecessor nodes. This allows traversal without needing
    // extra space for a stack or recursion.

    // Morris Traversal is an efficient way to perform in-order traversal of a
    // binary tree using O(1) space, excluding the space for the input tree itself.
    // The key steps are identifying the in-order predecessor, creating temporary
    // threads, and removing them once they are no longer needed. This method
    // maintains the O(n) time complexity of in-order traversal while eliminating
    // the need for additional memory.
    static void morrisTraversalForInOrder(TreeNode root) {
        if (root == null)
            return;

        while (root != null) {
            if (root.left == null) {
                System.out.print(root.val + " ");
                root = root.right;
            } else {
                TreeNode predecessor = root.left;
                while (predecessor.right != null && predecessor.right != root) {
                    predecessor = predecessor.right;
                }

                if (predecessor.right == null) {
                    predecessor.right = root;
                    root = root.left;
                } else {
                    predecessor.right = null;
                    System.out.print(root.val + " ");
                    root = root.right;
                }
            }
        }
    }

    // Q16. Morris Traversal for PreOrder TC - O(n) SC - O(1)

    static void morrisTraversalForPreOrder(TreeNode root) {
        if (root == null)
            return;

        while (root != null) {
            if (root.left == null) {
                System.out.print(root.val + " ");
                root = root.right;
            } else {
                TreeNode predecessor = root.left;
                while (predecessor.right != null && predecessor.right != root) {
                    predecessor = predecessor.right;
                }

                if (predecessor.right == null) {
                    System.out.print(root.val + " ");
                    predecessor.right = root;
                    root = root.left;
                } else {
                    predecessor.right = null;
                    root = root.right;
                }
            }
        }
    }

    // Q16. Morris Traversal for PostOrder TC - O(n) SC - O(1)

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, 7, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1, -1 };
        // int[] nodes = {1,2,-1,-1,3,-1,-1};
        TreeNode root = buildTree_A2(nodes);
        levelOrder(root);
        inorder(root);
        System.out.println();
        morrisTraversalForInOrder(root);
    }
}