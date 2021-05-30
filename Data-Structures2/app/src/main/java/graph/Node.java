package graph;

import java.util.LinkedList;
import java.util.List;

public class Node<T> {
private T value;
private List<Edge<T>> listOfEdges;

    public Node(T value) {
        this.value = value;
        this.listOfEdges = new LinkedList<>();
    }

    public Node(){
        this.listOfEdges = new LinkedList<>();
    }

    public boolean addEdgeToListOfEdges(Node<T> node , int weight){
        Edge<T> newEdge = new Edge<>(weight,node);
        return this.listOfEdges.add(newEdge);
    }

    public T getValue() {
        return value;
    }

    public List<Edge<T>> getListOfEdges() {
        return listOfEdges;
    }
}
