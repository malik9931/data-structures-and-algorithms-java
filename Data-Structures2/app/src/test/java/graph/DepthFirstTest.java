package graph;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class DepthFirstTest {
    @Test
    public void depthFirst1() {
        Graph<String> testGraph = new Graph<>();

        //       Malek ---- Salem
        //           \     /
        //            Jon ------- ahmad
        //           /   \         /
        //       anas -- Sarah    /
        //          \____________/
        //
        Node<String> jon = testGraph.addNodeToGraph("Jon");
        Node<String> malek = testGraph.addNodeToGraph("Malek");
        Node<String> ahmad = testGraph.addNodeToGraph("Ahmad");
        Node<String> salem = testGraph.addNodeToGraph("Salem");
        Node<String> sarah = testGraph.addNodeToGraph("Sarah");
        Node<String> anas = testGraph.addNodeToGraph("Anas");


        testGraph.addEdge(jon, malek, 1);
        testGraph.addEdge(jon, ahmad, 1);
        testGraph.addEdge(jon, salem, 1);
        testGraph.addEdge(jon, sarah, 1);
        testGraph.addEdge(jon, anas, 1);
        testGraph.addEdge(malek, salem, 1);
        testGraph.addEdge(anas, sarah, 1);
        testGraph.addEdge(anas, ahmad, 1);

        List<String> people = DepthFirst.preDepth(testGraph, malek);

        // Expected answer
        List<String> expected = new LinkedList<>();
        expected.add("Malek");

        // Should return malek, jon, ahmad, anas, sarah, salem
        Assert.assertEquals("Malek should be in the beginning",
                expected,
                people.subList(0,1)
        );
    }
}
