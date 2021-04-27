package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    Node root = null;


    //----------Constructors--------------------
    public BinaryTree(){}

    public BinaryTree(Node root) {
        this.root = root;
    }


    //-------- Method for Each of the Depth First Traversals------------
    //---------preOrder-----------

        ArrayList<Integer> preOrderList = new ArrayList<>();
    public List<Integer> preOrder(Node node){
        if(node != null){
//            System.out.println(" "+ node.value);
            preOrderList.add(node.value);
            preOrder(node.left);
            preOrder(node.right);
        }
        return preOrderList;
    }

    //---------inOrder-------
        ArrayList<Integer> inOrderList = new ArrayList<>();
    public List<Integer> inOrder(Node node){
        if (node != null){
            inOrder(node.left);
            inOrderList.add(node.value);
//            System.out.println(" "+ node.value);
            inOrder(node.right);
        }
        return inOrderList;
    }

    //---------Post-order-------

        ArrayList<Integer> postOrderList = new ArrayList<>();
    public List<Integer> postOrder(Node node){

        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            postOrderList.add(node.value);
//            System.out.println(" "+node.value);
        }
        return postOrderList;
    }

    //------------Find Max Value--------------
//    Node current = root;
    public Integer findMaximumValue(Node node){

//        if(root == null){
//            return Integer.MIN_VALUE;
//
//        }
//        return Math.max(root.value, Math.max(findMaximumValue(root.left),findMaximumValue(root.right)));
        if (node == null)
            return Integer.MIN_VALUE;

        int res = node.value;
        int lres = findMaximumValue(node.left);
        int rres = findMaximumValue(node.right);

        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
    }
    //-----------toString---------------------

    @Override
    public String toString() {

        if (root == null)
            return "BinaryTree{" +
                "root=" + null +
                '}';

        return "BinaryTree{" +
                "root=" + root.value +
                '}'+", Left Node: "+ (root.left !=null ? root.left.value : "Null") + ", Right Node: " + (root.right !=null ? root.right.value : "Null");
    }
}
