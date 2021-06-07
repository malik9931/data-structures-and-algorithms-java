package graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Graph<T> {

    HashSet<Node<T>> nodeInGraph;

    // == Constructor ==
    public Graph () {
        this.nodeInGraph = new HashSet<Node<T>>() {
        };
    }


    public Graph(HashSet<Node<T>> nodeInGraph) {

        this.nodeInGraph = nodeInGraph;
    }

//    public Graph() {
//
//    }

    //Methods
    // Add new Node
    public Node<T> addNodeToGraph(T value){
        Node<T> newNode = new Node<>(value);
        this.nodeInGraph.add(newNode);
        return newNode;
    }

    // Add new Edge
    public void addEdge(Node<T> node1, Node<T> node2, int weight){
        if (this.nodeInGraph.contains(node1) && this.nodeInGraph.contains(node2)){
            node1.addEdgeToListOfEdges(node2,weight);
            node2.addEdgeToListOfEdges(node1,weight);
        }
    }


    //Returns all of the nodes in the graph as a collection (set, list, or similar)
    public HashSet<Node<T>> getNodes(){
        if (nodeInGraph.size() == 0)
            return null;
        return nodeInGraph;
    }

//    GetNeighbors()
//    Returns a collection of edges connected to the given node
//    Takes in a given node
//    Include the weight of the connection in the returned collection
    public HashSet<Node<T>> getNeighbors(Node<T> node){
        HashSet<Node<T>> collOfNeighborNodes = new HashSet<>();
        for (Edge<T> neighbor : node.getListOfEdges()){
            if (!collOfNeighborNodes.contains(neighbor.getTheNodeThatEdgeIsPointingTo())){
                collOfNeighborNodes.add(neighbor.getTheNodeThatEdgeIsPointingTo());
            }
        }
        return collOfNeighborNodes;
    }

//    Size()
//    Returns the total number of nodes in the graph
    public int graphSize(){
        return this.nodeInGraph.size();
    }

    //Implement a breadth-first traversal on a graph.
    public List<T> bFT (Node<T> startingNode){
        LinkedList<Node<T>> queNodesToProcess = new LinkedList<>();
        HashSet<Node<T>> visited = new HashSet<>();
        List<T> traversalCollection = new LinkedList<>();

        queNodesToProcess.add(startingNode);

        while (!queNodesToProcess.isEmpty()){
            Node<T> currentNode = queNodesToProcess.removeFirst();
            if (!visited.contains(currentNode)){
                visited.add(currentNode);
                traversalCollection.add(currentNode.getValue());
            }

            HashSet<Node<T>> neighborNodes = getNeighbors(currentNode);

            for (Node<T> neighbor:neighborNodes) {
                if (!visited.contains(neighbor)){
                    queNodesToProcess.add(neighbor);
                }
            }

        }
        return traversalCollection;
    }

}
