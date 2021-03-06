package tree;

public class BinarySearchTree{

    private Node root;
    // constructor
    public BinarySearchTree() {
        this.root = null;
    }
    private Node addRecursive(Node current, int value){

        if (current == null){
            return new Node(value);
        }
        if (value< current.value){
            current.left = addRecursive(current.left,value);
        }else if (value> current.value){
            current.right = addRecursive(current.right, value);
        }else {
            //value is already exist
            return current;
        }
        return current;
    }

    public void add(int value){
        root = addRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    public boolean contains(int value) {
        return containsNodeRecursive(root, value);
    }



//    @Override
//    public String toString() {
//        return "BinarySearchTree{}";
//    }
}
