# Singly Linked List
Linked List Implementation

## Challenge
Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.

Within your LinkedList class, include a head property. Upon instantiation, an empty Linked List should be created.

Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.

Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.

Define a method called toString (or __str__ in Python) which takes in no arguments and returns a string representing all the values in the Linked List, formatted as:
"{ a } -> { b } -> { c } -> NULL"

## Approach & Efficiency
built with object-oriented programming by creating 2-classes one for the linked list, and the other for the Node
the Big O for the methods is O(1) in the best cases and for the worst cases is O(n)

## API
insert(<Node type>): this method will  take any value as an argument and adds a new node with that value to the head of the list

includes(<String>): this method will take any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.

toString(): this method takes in no arguments and returns a string representing all the values in the Linked List

append(): adds a new node with the given value to the end of the list

insertBefore(): add a new node with the given newValue immediately before the first value node

insertAfter(): add a new node with the given newValue immediately after the first value node



## Solution
An edited picture
![whiteboard](../assets/Linked-List.JPG)
