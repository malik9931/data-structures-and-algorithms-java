package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    Node root;


    //----------Constructors--------------------
    public BinaryTree(){}

    public BinaryTree(Node root) {
        this.root = root;
    }


    //-------- Method for Each of the Depth First Traversals------------
    //---------preOrder-----------

        ArrayList<Integer> preOrderList = new ArrayList<>();
    public List<Integer> preOrder(Node rootVal){
//        if (root == null){
//            preOrder(root);
//        }
        root = rootVal;
//        System.out.println("this is root.value= "+root.value);

        preOrderList.add(root.value);
//        System.out.println("This is root.left -> "+ root.left == null ? "null" : root.left.value);
//        System.out.println("This is root.right -> "+ root.right);

            Node prevNode = root.left;
        if(root.left != null){
            preOrder(root.left);
//            System.out.println("if(root.left != null)"+ root.left);
        }else {
            preOrder(prevNode);
        }
//        if (root.right != null){
//            preOrder(root.right);
//            System.out.println("if(root.right != null)"+ root.right.value);

//        }
        return preOrderList;
    }

    //---------inOrder-------
    public List<Integer> inOrder(Node newVal){
        root = newVal;
        ArrayList<Integer> result = new ArrayList<>();
        if (root.left != null)
            inOrder(root.left);
        System.out.println(root);
        result.add(root.value);
        if (root.right != null)
            inOrder(root.right);

        return result;
    }

    //---------Post-order-------

//    ALGORITHM postOrder(root)
//// INPUT <-- root node
//// OUTPUT <-- post-order output of tree node's values
//
//    if root.left is not NULL
//    postOrder(root.left)
//
//    if root.right is not NULL
//    postOrder(root.right)
//
//    OUTPUT <-- root.value

    public List<Integer> postOrder(Node newVal){
        root = newVal;

        ArrayList<Integer> resultList = new ArrayList<>();
        if (root.left != null)
            postOrder(root.left);

        if (root.right != null)
            postOrder(root.right);

        System.out.println(root);
        resultList.add(root.value);

        return resultList;
    }
    //-----------toString---------------------

    @Override
    public String toString() {

        if (root == null)
            return "BinaryTree{" +
                "root=" + null +
                '}';

//        String result = "";
//        Node current = root;
//        result = result + "{BinaryTree{root=" + current.value +" }  ";
//
//        while (current != null){
//            result = result + "{BinaryTree{root=" + current.value +" }  ";
//
//            current = current.left;
//        }
//        result = result+"NULL";
//        return result;
        return "BinaryTree{" +
                "root=" + root.value +
                '}'+", Left Node: "+ root.left.value + ", Right Node: " + root.right.value;
    }
}
