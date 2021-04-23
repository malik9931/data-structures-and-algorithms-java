package tree;

public class treeApp {
    public static void main(String[] args) {
        BinaryTree newTree = new BinaryTree();
//        System.out.println(newTree.toString());

        Node one = new Node(1);
        BinaryTree scndTree = new BinaryTree(one);
        Node two = new Node(2);
        Node three = new Node(3);
        one.left = two;
        one.right = three;
//        System.out.println(one);
        System.out.println(newTree.preOrder(one));
        System.out.println("2nd Tree: "+scndTree);

    }
}