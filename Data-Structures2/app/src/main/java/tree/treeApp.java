package tree;

public class treeApp {
    public static void main(String[] args) throws IllegalAccessException {
        BinaryTree newTree = new BinaryTree();
//        System.out.println(newTree.toString());

        Node one = new Node(1);
        BinaryTree scndTree = new BinaryTree(one);
        Node two = new Node(2);
        Node three = new Node(3);
        System.out.println("2nd Tree: "+scndTree.toString());
        one.left = two;
        one.right = three;
//        System.out.println(one);
        System.out.println(newTree.findMaximumValue(one));
        System.out.println(newTree.preOrder(one));
        System.out.println(newTree.inOrder(one));
        System.out.println(newTree.postOrder(one));

        //Creating Binary Search Tree
//        Node firstRoot = new Node(23);
//        newBST.root = firstRoot;
        try {
        BinarySearchTree newBST = new BinarySearchTree();
        newBST.add(4);
        newBST.add(2);
            System.out.println(newBST.contains(5));
//        System.out.println(newBST.toString());

        }catch (NullPointerException ex){
            throw ex;
        }


    }
}