package graph;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GraphTest {
    @Test
    public void testAddNode() {
        Graph<Integer> testGraph = new Graph<>();
        Integer testInt = 12;
        Node<Integer> testNode = testGraph.addNodeToGraph(testInt);

        Assert.assertTrue("should be true ",
                testGraph.nodeInGraph.contains(testNode));
    }

    @Test
    public void testGetNodes() {
        Graph<Integer> testGraph = new Graph<>();
        Node<Integer> testNode = testGraph.addNodeToGraph(12);

        HashSet<Node<Integer>> testSet = testGraph.getNodes();

        Assert.assertEquals("It should be true that testNode is in the set",
                true,
                testSet.contains(testNode));
    }

    // check for when the graph is empty, one can check status of Set of Nodes
    @Test
    public void testGetNodesInSet2() {
        Graph<Integer> testGraph = new Graph<>();
        HashSet<Node<Integer>> testSet = testGraph.getNodes();

        Assert.assertTrue("It should be that the graph is empty",
                testSet.isEmpty());
    }


    @Test
    public void testGetNeighbors() {
        Graph<Integer> testGraph = new Graph<>();
        // create test nodes to add to the graph
        Node<Integer> testNode1 = testGraph.addNodeToGraph(12);
        Node<Integer> testNode2 = testGraph.addNodeToGraph(4);

        // addEdge
        testGraph.addEdge(testNode1, testNode2, 200);

        // testList has the neighbors of testNode1
        HashSet<Node<Integer>> testList = testGraph.getNeighbors(testNode1);


        Assert.assertEquals("Should be true that testList contains testNode2",
                true,
                testList.contains(testNode2));
    }


    @Test
    public void testGetSize() {
        Graph<Integer> testGraph = new Graph<>();
        testGraph.addNodeToGraph(12);
        testGraph.addNodeToGraph(4);
        testGraph.addNodeToGraph(-5);
        Assert.assertEquals("size of graph should be 3",
                3,
                testGraph.graphSize());
    }


}
