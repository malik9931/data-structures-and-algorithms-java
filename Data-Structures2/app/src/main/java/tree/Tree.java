package tree;

//
//import java.util.*;
//
//class Tree
//{
//
//    // Structure of a node of an n-ary tree
//    static class Node
//    {
//        int value;
//        Vector<Node> child;
//    };
//
//    // Utility function to create a new tree
//// node with k children
//    static Node newNode(int value)
//    {
//        Node nNode = new Node();
//        nNode.value = value;
//        nNode.child= new Vector<Node>();
//        return nNode;
//    }
//
//    static int ind;
//
//    // Function to build full k-ary tree
//    static Node BuildKaryTree(int A[], int n,
//                              int k, int h)
//    {
//        // For null tree
//        if (n <= 0)
//            return null;
//
//        Node nNode = newNode(A[ind]);
//        if (nNode == null)
//        {
//            System.out.println("Memory error" );
//            return null;
//        }
//
//        // For adding k children to a node
//        for (int i = 0; i < k; i++)
//        {
//
//            // Check if ind is in range of array
//            // Check if height of the tree is greater than 1
//            if (ind < n - 1 && h > 1)
//            {
//                ind++;
//
//                // Recursively add each child
//                nNode.child.add(BuildKaryTree(A, n, k, h - 1));
//            }
//            else
//            {
//                nNode.child.add(null);
//            }
//        }
//        return nNode;
//    }
//
//    // Function to find the height of the tree
//    static Node BuildKaryTree_1(int[] A, int n, int k, int in)
//    {
//        int height = (int)Math.ceil(Math.log((double)n * (k - 1) + 1) /
//                Math.log((double)k));
//        ind = in;
//        return BuildKaryTree(A, n, k, height);
//    }
//
//    // Function to print postorder traversal of the tree
//    static void postord(Node root, int k)
//    {
//        if (root == null)
//            return;
//        for (int i = 0; i < k; i++)
//            postord(root.child.get(i), k);
//        System.out.print(root.value + " ");
//    }
//
//    // Driver Code
//    public static void main(String args[])
//    {
//        int ind = 0;
//        int k = 3, n = 10;
//        int preorder[] = { 1, 2, 5, 6, 7, 3, 8, 9, 10, 4 };
//        Node root = BuildKaryTree_1(preorder, n, k, ind);
//        System.out.println("Postorder traversal of " +
//                "constructed full k-ary tree is: ");
//        postord(root, k);
//        System.out.println();
//    }
//}
