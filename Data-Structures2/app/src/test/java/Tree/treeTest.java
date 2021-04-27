package Tree;

import org.junit.Test;
import tree.BinarySearchTree;
import tree.BinaryTree;
import tree.Node;
import static org.junit.Assert.*;


public class treeTest {
    public static void main(String[] args) {

//    //I wasn't able to use @Test and it gave me this error message:
//    //FAILURE: Build failed with an exception.
//    //* What went wrong:
//    //Execution failed for task ':app:test'.
//    //> No tests found for given includes: [Tree.BinaryTreeTest](filter.includeTestsMatching)
//
//Can successfully instantiate an empty tree
        BinaryTree emptyTree = new BinaryTree();
        System.out.println("Expected value for empty tree is: " + "BinaryTree{root=null}"+ ", And the Actual is: "+emptyTree.toString());
//Can successfully instantiate a tree with a single root node
        Node singleRoot = new Node(77);
        BinaryTree testRootTree = new BinaryTree(singleRoot);
        System.out.println("Expected value for Single root tree is: " + "BinaryTree{root=77}, Left Node: Null, Right Node: Null"+ ", And the Actual is: "+testRootTree.toString());

//Can successfully add a left child and right child to a single root node
        Node leftNode = new Node(22);
        Node rightNode = new Node(22);
        singleRoot.left= leftNode;
        singleRoot.right= rightNode;
        System.out.println("Expected value for test adding a left child and right child to a single root node tree is: " + "BinaryTree{root=77}, Left Node: 22, Right Node: 22"+ ", And the Actual is: "+testRootTree.toString());



//Can successfully return a collection from a preOrder, inOrder, postOrder traversal
        BinaryTree newTree = new BinaryTree();
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        one.left = two;
        one.right = three;
//        System.out.println(one);
        System.out.println("Expected value for preOrder traversing method is: " + "[1, 2, 3]"+ ", And the Actual is: "+newTree.preOrder(one));
        System.out.println("Expected value for inOrder traversing method is: " + "[2, 1, 3]"+ ", And the Actual is: "+newTree.inOrder(one));
        System.out.println("Expected value for postOrder traversing method is: " + "[2, 3, 1]"+ ", And the Actual is: "+newTree.postOrder(one));

        //Creating Binary Search Tree
        BinarySearchTree newBST = new BinarySearchTree();
        newBST.add(4);
        newBST.add(2);
        System.out.println("Expected value for contains method for the BST for exist value is: " + true+ ", And the Actual is: "+newBST.contains(2));
        System.out.println("Expected value for contains method for the BST for exist value is: " + false+ ", And the Actual is: "+newBST.contains(5));


        // Find the max value in the Binary Tree
        System.out.println("Expected max value in the newTree BT is: " + 3+ ", And the Actual is: "+newTree.findMaximumValue(one));

    }
}
