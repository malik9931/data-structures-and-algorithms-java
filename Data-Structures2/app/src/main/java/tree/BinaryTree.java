//package tree;
//
//import java.util.*;
//
//public class BinaryTree {
////    Node root = null;
//    Node root;
//
//
//    //----------Constructors--------------------
//    public BinaryTree(){}
//
//    public BinaryTree(Node root) {
//        this.root = root;
//    }
//
//
//    //-------- Method for Each of the Depth First Traversals------------
//    //---------preOrder-----------
//
//        ArrayList<Integer> preOrderList = new ArrayList<>();
//    public List<Integer> preOrder(Node node){
//        if(node != null){
////            System.out.println(" "+ node.value);
//            preOrderList.add(node.value);
//            preOrder(node.left);
//            preOrder(node.right);
//        }
//        return preOrderList;
//    }
//
//    //---------inOrder-------
//        ArrayList<Integer> inOrderList = new ArrayList<>();
//    public List<Integer> inOrder(Node node){
//        if (node != null){
//            inOrder(node.left);
//            inOrderList.add(node.value);
////            System.out.println(" "+ node.value);
//            inOrder(node.right);
//        }
//        return inOrderList;
//    }
//
//    //---------Post-order-------
//
//        ArrayList<Integer> postOrderList = new ArrayList<>();
//    public List<Integer> postOrder(Node node){
//
//        if(node != null){
//            postOrder(node.left);
//            postOrder(node.right);
//            postOrderList.add(node.value);
////            System.out.println(" "+node.value);
//        }
//        return postOrderList;
//    }
//
//    //------------Find Max Value--------------
////    Node current = root;
//    public Integer findMaximumValue(Node node){
//
////        if(root == null){
////            return Integer.MIN_VALUE;
////
////        }
////        return Math.max(root.value, Math.max(findMaximumValue(root.left),findMaximumValue(root.right)));
//        if (node == null)
//            return Integer.MIN_VALUE;
//
//        int res = node.value;
//        int lres = findMaximumValue(node.left);
//        int rres = findMaximumValue(node.right);
//
//        if (lres > res)
//            res = lres;
//        if (rres > res)
//            res = rres;
//        return res;
//    }
//
//    //---------------- Breadth First Traversing  --------------
//
//    public List<Integer> breadthFirst(Node root){
//        this.root = root;
//        if (root == null){
//            throw new NoSuchElementException();
//        }
//        Queue<Node> breadth = new LinkedList<>();
//        ArrayList<Integer> breadthFirstList = new ArrayList();
//
//        breadth.add(root);
//
//        while (!breadth.isEmpty()){
//            Node front = (Node) breadth.remove();
//            breadthFirstList.add(front.value);
//
//            if (front.left != null){
//                breadth.add(front.left);
//            }
//            if (front.right != null){
//                breadth.add(front.right);
//            }
//
//        }
//        return  breadthFirstList;
//    }
//
//    //-------------- summation of odd ------------
//
//    public Integer sumOdd(List<Integer> myList){
//        if (root == null){
//            throw new NoSuchElementException();
//        }
////        List<Integer> myList = myTree.breadthFirst(this.root);
//
//        Integer sum = 0;
//        for (Integer number : myList ){
//            if (!(number%2 == 0)){
//                sum = sum + number;
//            }
//        }
//        return sum;
//    }
//    //-----------toString---------------------
//
//    @Override
//    public String toString() {
//
//        if (root == null)
//            return "BinaryTree{" +
//                "root=" + null +
//                '}';
//
//        return "BinaryTree{" +
//                "root=" + root.value +
//                '}'+", Left Node: "+ (root.left !=null ? root.left.value : "Null") + ", Right Node: " + (root.right !=null ? root.right.value : "Null");
//    }
//
//
//}
