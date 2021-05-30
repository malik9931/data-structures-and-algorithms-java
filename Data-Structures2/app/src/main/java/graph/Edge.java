package graph;

public class Edge<T>{
    private int weight;
    private Node<T> theNodeThatEdgeIsPointingTo;

    public Edge(int weight, Node node) {
        this.weight = weight;
        this.theNodeThatEdgeIsPointingTo = node;
    }

    public Edge(Node node){
        this.theNodeThatEdgeIsPointingTo = node;
    }

    public int getWeight() {
        return weight;
    }

    public Node<T> getTheNodeThatEdgeIsPointingTo() {
        return theNodeThatEdgeIsPointingTo;
    }
}
