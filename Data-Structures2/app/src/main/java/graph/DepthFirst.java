package graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class DepthFirst {

    public static <T> List<T> preDepth(Graph<T> graph, Node<T> startingNode) {
        Set<Node<T>> seen = new HashSet<>();
        List<T> answer = new LinkedList<>();
        return preDepth(graph, startingNode, seen, answer);
    }

    private static <T> List<T> preDepth(Graph<T> graph, Node<T> node, Set<Node<T>> seen, List<T> values) {
        if (node != null) {
            if (seen.add(node)) {
                //preorder part:
                values.add(node.getValue());
                HashSet<Node<T>> neighbors = graph.getNeighbors(node);
                for (Node<T> neighbor : neighbors) {
                    preDepth(graph, neighbor, seen, values);
                }
            }
        }
        return values;
    }
}
