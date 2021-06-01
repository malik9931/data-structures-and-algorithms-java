# Graphs
The [Graph](Graph.java) class works with [Edge](Edge.java) class & [Node](Node.java) class.

### The Graph class has the following methods:
* addNode()
* getNodes()
* getNeighbors()
* addEdge()
* getSize()

-------------------------------------------------------------------
# Code Challenge: Class 36
### Challenge Summary
Implement a breadth-first traversal on a graph.

### Challenge Description
Extend your graph object with a breadth-first traversal method that accepts a starting node. Without utilizing any of the built-in methods available to your language, return a collection of nodes in the order they were visited. Display the collection.

bFT (Node<T> startingNode)

### Approach & Efficiency

BFT explores level-by-level
Pop the first node from the queue.
Check if the node has been visited already.
Add the node's children to the end of the queue.
Repeat while the queue still contains one or more nodes.



### Solution
![whiteboard]()
