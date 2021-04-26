# Code Challenge: Class 15
### Challenge Summary
Implementation: Trees

### Challenge Description
Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
Create a BinaryTree class
Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values, ordered appropriately.


### Approach & Efficiency
A binary tree is a recursive data structure where each node can have 2 children at most.
We were using an auxiliary Node class that will store int values and keep a reference to each child

Inserting Elements
First, we have to find the place where we want to add a new node in order to keep the tree sorted. We'll follow these rules starting from the root node:

* if the new node's value is lower than the current node's, we go to the left child
* if the new node's value is greater than the current node's, we go to the right child
* when the current node is null, we've reached a leaf node and we can insert the new node in that position

Finding an Element
By creating a recursive method that traverses the tree `containsNodeRecursive`
By searching for the value by comparing it to the value in the current node, then continue in the left or right child depending on that

## API
## Methods
Binary Search Tree Class
`add();`
accepts a value, and adds a new node with that value in the correct location in the binary search tree.
Big O time complexity: O(height)

`contains();`
accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.
The Big O space complexity: O(1)

Binary Tree Class
Each method changes the order in which we search/print the root:
`preOrder();`=> root >> left >> right
`inOrder();`=> left >> root >> right
`postOrder();`=> left >> right >> root
