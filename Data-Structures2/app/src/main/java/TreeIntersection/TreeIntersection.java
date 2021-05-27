//package TreeIntersection;
//
//import tree.BinaryTree;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class TreeIntersection {
//
//    public ArrayList<Integer> tree_intersection(tree.BinaryTree tree1 , tree.BinaryTree tree2){
//        ArrayList<Integer> result= new ArrayList<>();
//
//        tree.BinaryTree binaryTree = new BinaryTree();
//        ArrayList<Integer> firstTreeList = binaryTree.preOrder(tree1);
//        ArrayList<Integer> secondTreeList = binaryTree.preOrder(tree2);
//
//        for (int i = 0; i < firstTreeList.size() ; i++) {
//            if (firstTreeList.get(i) == secondTreeList.get(i)){
//                result.add (firstTreeList.get(i));
//            }
//        }
//        return result;
//    }
//}
