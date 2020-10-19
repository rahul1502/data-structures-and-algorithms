# data-structures-and-algorithms


```
--------------------------------------------------------------------
*******    Data Structures    *******
--------------------------------------------------------------------
DataStructures.StaticArray: 
    Array: [4, 3, 5, -3, -5, 6, 7, 9, 12]
    getElement(2): 5
    searchElement(-5): 4
--------------------------------------
DataStructures.DynamicArray: 
    insertElement(1): [1]
    insertElement(2): [1, 2]
    insertElement(3): [1, 2, 3, 0]
    insertElement(4): [1, 2, 3, 4]
    deleteElement(2): [1, 2, 4, 0]
    insertElement(5): [1, 2, 4, 5]
    insertElement(6): [1, 2, 4, 5, 6, 0, 0, 0]
--------------------------------------
DataStructures.LinkedLists: 
    Linked List: 1 -> 2 -> 3 -> 4
    countNodes(a): 4
    insertElement(a, 6, 2): 1 -> 2 -> 6 -> 3 -> 4 -> 
    deleteElement(a, 3): 1 -> 2 -> 6 -> 4 -> 
--------------------------------------
DataStructures.Stack: 
    push(4) push(3) push(-1): [4, 3, -1]
    push(8): Stack already full
    pop(): -1 | [4, 3, 0]
    peek(): 3
--------------------------------------
DataStructures.Queue: 
    enqueue(3) enqueue(8) enqueue(-2): [3, 8, -2]
    enqueue(4): Queue already full
    dequque(): 3 | [8, -2, 0]
    peek(): 8
--------------------------------------
DataStructures.BinaryTree: 
    Sum of all nodes under b1 (including b1): 265
    Maximum depth of the binary tree: 6
--------------------------------------
DataStructures.BinarySearchTree: 
    Inserted nodes: 10, 20, 8, 12, 17, 25, 24, 13, 16, 18, 22, 23
    Search value 10: 10
    Minimum value in the BST: 8
    Maximum value in the BST: 25
    Parent node of node 17: 20
    Delete node: 8
    Delete node: 12
    Delete node: 20
--------------------------------------
DataStructures.Graph: 
    Representation
    Vertices: [ A, B, C, D, E ,F ]
    Edge List: 
        A -> B
        A -> D
        A -> C
        B -> D
        D -> E
        E -> F
        C -> F
    Adjacency Matrix: 
        0 1 1 1 0 0 
        1 0 0 1 0 0 
        1 0 0 0 0 1 
        1 1 0 0 1 0 
        0 0 0 1 0 1 
        0 0 1 0 1 0 
    Adjacency List: 
        A : B C D 
        B : A D 
        C : A F 
        D : A B E 
        E : D F 
        F : E C 
--------------------------------------------------------------------
**********    Algorithms    **********
--------------------------------------------------------------------
Algorithms.SortingAlgorithms: 
    Array: [3, 5, -4, 6, 7, 12, 78, 54, 22, 90, 23, 56, -5, -52, 34, 76, 83, 58, 8, 45]

    Selection Sort: O(n^2)
        Sorted Array: [-52, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        Sorted Array: [-52, -5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        Sorted Array: [-52, -5, -4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        Sorted Array: [-52, -5, -4, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        Sorted Array: [-52, -5, -4, 3, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        Sorted Array: [-52, -5, -4, 3, 5, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        Sorted Array: [-52, -5, -4, 3, 5, 6, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        Sorted Array: [-52, -5, -4, 3, 5, 6, 7, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        Sorted Array: [-52, -5, -4, 3, 5, 6, 7, 8, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        Sorted Array: [-52, -5, -4, 3, 5, 6, 7, 8, 12, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        Sorted Array: [-52, -5, -4, 3, 5, 6, 7, 8, 12, 22, 23, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        Sorted Array: [-52, -5, -4, 3, 5, 6, 7, 8, 12, 22, 23, 34, 0, 0, 0, 0, 0, 0, 0, 0]
        Sorted Array: [-52, -5, -4, 3, 5, 6, 7, 8, 12, 22, 23, 34, 45, 0, 0, 0, 0, 0, 0, 0]
        Sorted Array: [-52, -5, -4, 3, 5, 6, 7, 8, 12, 22, 23, 34, 45, 54, 0, 0, 0, 0, 0, 0]
        Sorted Array: [-52, -5, -4, 3, 5, 6, 7, 8, 12, 22, 23, 34, 45, 54, 56, 0, 0, 0, 0, 0]
        Sorted Array: [-52, -5, -4, 3, 5, 6, 7, 8, 12, 22, 23, 34, 45, 54, 56, 58, 0, 0, 0, 0]
        Sorted Array: [-52, -5, -4, 3, 5, 6, 7, 8, 12, 22, 23, 34, 45, 54, 56, 58, 76, 0, 0, 0]
        Sorted Array: [-52, -5, -4, 3, 5, 6, 7, 8, 12, 22, 23, 34, 45, 54, 56, 58, 76, 78, 0, 0]
        Sorted Array: [-52, -5, -4, 3, 5, 6, 7, 8, 12, 22, 23, 34, 45, 54, 56, 58, 76, 78, 83, 0]
        Sorted Array: [-52, -5, -4, 3, 5, 6, 7, 8, 12, 22, 23, 34, 45, 54, 56, 58, 76, 78, 83, 90]
    Bubble Sort: O(n^2)
        Sorted Array: [3, -4, 5, 6, 7, 12, 54, 22, 78, 23, 56, -5, -52, 34, 76, 83, 58, 8, 45, 90]
        Sorted Array: [-4, 3, 5, 6, 7, 12, 22, 54, 23, 56, -5, -52, 34, 76, 78, 58, 8, 45, 83, 90]
        Sorted Array: [-4, 3, 5, 6, 7, 12, 22, 23, 54, -5, -52, 34, 56, 76, 58, 8, 45, 78, 83, 90]
        Sorted Array: [-4, 3, 5, 6, 7, 12, 22, 23, -5, -52, 34, 54, 56, 58, 8, 45, 76, 78, 83, 90]
        Sorted Array: [-4, 3, 5, 6, 7, 12, 22, -5, -52, 23, 34, 54, 56, 8, 45, 58, 76, 78, 83, 90]
        Sorted Array: [-4, 3, 5, 6, 7, 12, -5, -52, 22, 23, 34, 54, 8, 45, 56, 58, 76, 78, 83, 90]
        Sorted Array: [-4, 3, 5, 6, 7, -5, -52, 12, 22, 23, 34, 8, 45, 54, 56, 58, 76, 78, 83, 90]
        Sorted Array: [-4, 3, 5, 6, -5, -52, 7, 12, 22, 23, 8, 34, 45, 54, 56, 58, 76, 78, 83, 90]
        Sorted Array: [-4, 3, 5, -5, -52, 6, 7, 12, 22, 8, 23, 34, 45, 54, 56, 58, 76, 78, 83, 90]
        Sorted Array: [-4, 3, -5, -52, 5, 6, 7, 12, 8, 22, 23, 34, 45, 54, 56, 58, 76, 78, 83, 90]
        Sorted Array: [-4, -5, -52, 3, 5, 6, 7, 8, 12, 22, 23, 34, 45, 54, 56, 58, 76, 78, 83, 90]
        Sorted Array: [-5, -52, -4, 3, 5, 6, 7, 8, 12, 22, 23, 34, 45, 54, 56, 58, 76, 78, 83, 90]
        Sorted Array: [-52, -5, -4, 3, 5, 6, 7, 8, 12, 22, 23, 34, 45, 54, 56, 58, 76, 78, 83, 90]
        Sorted Array: [-52, -5, -4, 3, 5, 6, 7, 8, 12, 22, 23, 34, 45, 54, 56, 58, 76, 78, 83, 90]
        Sorted Array: [-52, -5, -4, 3, 5, 6, 7, 8, 12, 22, 23, 34, 45, 54, 56, 58, 76, 78, 83, 90]
        Sorted Array: [-52, -5, -4, 3, 5, 6, 7, 8, 12, 22, 23, 34, 45, 54, 56, 58, 76, 78, 83, 90]
        Sorted Array: [-52, -5, -4, 3, 5, 6, 7, 8, 12, 22, 23, 34, 45, 54, 56, 58, 76, 78, 83, 90]
        Sorted Array: [-52, -5, -4, 3, 5, 6, 7, 8, 12, 22, 23, 34, 45, 54, 56, 58, 76, 78, 83, 90]
        Sorted Array: [-52, -5, -4, 3, 5, 6, 7, 8, 12, 22, 23, 34, 45, 54, 56, 58, 76, 78, 83, 90]
        Sorted Array: [-52, -5, -4, 3, 5, 6, 7, 8, 12, 22, 23, 34, 45, 54, 56, 58, 76, 78, 83, 90]
    Insertion Sort: O(n^2)
        Hole: 5 Array: [3, 5, -4, 6, 7, 12, 78, 54, 22, 90, 23, 56, -5, -52, 34, 76, 83, 58, 8, 45]
        Hole: -4 Array: [-4, 3, 5, 6, 7, 12, 78, 54, 22, 90, 23, 56, -5, -52, 34, 76, 83, 58, 8, 45]
        Hole: 6 Array: [-4, 3, 5, 6, 7, 12, 78, 54, 22, 90, 23, 56, -5, -52, 34, 76, 83, 58, 8, 45]
        Hole: 7 Array: [-4, 3, 5, 6, 7, 12, 78, 54, 22, 90, 23, 56, -5, -52, 34, 76, 83, 58, 8, 45]
        Hole: 12 Array: [-4, 3, 5, 6, 7, 12, 78, 54, 22, 90, 23, 56, -5, -52, 34, 76, 83, 58, 8, 45]
        Hole: 78 Array: [-4, 3, 5, 6, 7, 12, 78, 54, 22, 90, 23, 56, -5, -52, 34, 76, 83, 58, 8, 45]
        Hole: 54 Array: [-4, 3, 5, 6, 7, 12, 54, 78, 22, 90, 23, 56, -5, -52, 34, 76, 83, 58, 8, 45]
        Hole: 22 Array: [-4, 3, 5, 6, 7, 12, 22, 54, 78, 90, 23, 56, -5, -52, 34, 76, 83, 58, 8, 45]
        Hole: 90 Array: [-4, 3, 5, 6, 7, 12, 22, 54, 78, 90, 23, 56, -5, -52, 34, 76, 83, 58, 8, 45]
        Hole: 23 Array: [-4, 3, 5, 6, 7, 12, 22, 23, 54, 78, 90, 56, -5, -52, 34, 76, 83, 58, 8, 45]
        Hole: 56 Array: [-4, 3, 5, 6, 7, 12, 22, 23, 54, 56, 78, 90, -5, -52, 34, 76, 83, 58, 8, 45]
        Hole: -5 Array: [-5, -4, 3, 5, 6, 7, 12, 22, 23, 54, 56, 78, 90, -52, 34, 76, 83, 58, 8, 45]
        Hole: -52 Array: [-52, -5, -4, 3, 5, 6, 7, 12, 22, 23, 54, 56, 78, 90, 34, 76, 83, 58, 8, 45]
        Hole: 34 Array: [-52, -5, -4, 3, 5, 6, 7, 12, 22, 23, 34, 54, 56, 78, 90, 76, 83, 58, 8, 45]
        Hole: 76 Array: [-52, -5, -4, 3, 5, 6, 7, 12, 22, 23, 34, 54, 56, 76, 78, 90, 83, 58, 8, 45]
        Hole: 83 Array: [-52, -5, -4, 3, 5, 6, 7, 12, 22, 23, 34, 54, 56, 76, 78, 83, 90, 58, 8, 45]
        Hole: 58 Array: [-52, -5, -4, 3, 5, 6, 7, 12, 22, 23, 34, 54, 56, 58, 76, 78, 83, 90, 8, 45]
        Hole: 8 Array: [-52, -5, -4, 3, 5, 6, 7, 8, 12, 22, 23, 34, 54, 56, 58, 76, 78, 83, 90, 45]
        Hole: 45 Array: [-52, -5, -4, 3, 5, 6, 7, 8, 12, 22, 23, 34, 45, 54, 56, 58, 76, 78, 83, 90]
    Merge Sort: O(nlog(n))
        [-52, -5, -4, 3, 5, 6, 7, 8, 12, 22, 23, 34, 45, 54, 56, 58, 76, 78, 83, 90]
    Quick Sort: Average Case O(nlog(n)), Worst Case O(n^2)
        [-52, -5, -4, 3, 5, 6, 7, 8, 12, 22, 23, 34, 45, 54, 56, 58, 76, 78, 83, 90]
--------------------------------------
Algorithms.BinaryTreeTraversal: 
    Binary Tree created...
    Breadth First Strategy: 
        Level Order traversal [F, D, K, B, E, H, L, A, C, G, J, I]
    Depth First Strategy: 
        Pre-order traversal: [F, D, B, A, C, E, K, H, G, J, I, L, ]
        In-order traversal: [A, B, C, D, E, F, G, H, I, J, K, L, ]
        Post-order traversal: [A, C, B, E, D, G, I, J, H, L, K, F, ]
--------------------------------------
Algorithms.GraphTraversal: 
    Vertices : [ A, B, C, D, E ,F, G, H, I, J, K, L, M ]
    Graph: 
        A : J H L 
        B : K I 
        C : M D 
        D : C E H 
        E : D 
        F : G 
        G : H F 
        H : A G D L 
        I : B M J 
        J : A I K 
        K : B J 
        L : A H 
        M : C I 

    Breadth-first search: 
        Traversed: A  Queue: J H L 
        Traversed: A J  Queue: H L I K 
        Traversed: A J H  Queue: L I K G D 
        Traversed: A J H L  Queue: I K G D 
        Traversed: A J H L I  Queue: K G D B M 
        Traversed: A J H L I K  Queue: G D B M 
        Traversed: A J H L I K G  Queue: D B M F 
        Traversed: A J H L I K G D  Queue: B M F C E 
        Traversed: A J H L I K G D B  Queue: M F C E 
        Traversed: A J H L I K G D B M  Queue: F C E 
        Traversed: A J H L I K G D B M F  Queue: C E 
        Traversed: A J H L I K G D B M F C  Queue: E 
        Traversed: A J H L I K G D B M F C E  Queue: 

    Depth-first search: 
        Traversed: A  Stack: A J 
        Traversed: A J  Stack: A J I 
        Traversed: A J I  Stack: A J I B 
        Traversed: A J I B  Stack: A J I B K 
        Traversed: A J I B K  Stack: A J I B 
        Traversed: A J I B K  Stack: A J I 
        Traversed: A J I B K  Stack: A J I M 
        Traversed: A J I B K M  Stack: A J I M C 
        Traversed: A J I B K M C  Stack: A J I M C D 
        Traversed: A J I B K M C D  Stack: A J I M C D E 
        Traversed: A J I B K M C D E  Stack: A J I M C D 
        Traversed: A J I B K M C D E  Stack: A J I M C D H 
        Traversed: A J I B K M C D E H  Stack: A J I M C D H G 
        Traversed: A J I B K M C D E H G  Stack: A J I M C D H G F 
        Traversed: A J I B K M C D E H G F  Stack: A J I M C D H G 
        Traversed: A J I B K M C D E H G F  Stack: A J I M C D H 
        Traversed: A J I B K M C D E H G F  Stack: A J I M C D H L 
        Traversed: A J I B K M C D E H G F L  Stack: A J I M C D H 
        Traversed: A J I B K M C D E H G F L  Stack: A J I M C D 
        Traversed: A J I B K M C D E H G F L  Stack: A J I M C 
        Traversed: A J I B K M C D E H G F L  Stack: A J I M 
        Traversed: A J I B K M C D E H G F L  Stack: A J I 
        Traversed: A J I B K M C D E H G F L  Stack: A J 
        Traversed: A J I B K M C D E H G F L  Stack: A 
        Traversed: A J I B K M C D E H G F L  Stack: 
--------------------------------------
Algorithms.ShortestPathAlgorithms: 
    Dijkstra's Shortest Path Algorithm: 
        Graph [ A, B, C, D, E ,F ]: 
            A : B[5] C[1] 
            B : E[20] C[2] D[3] 
            C : B[3] E[12] 
            D : F[6] E[2] C[3] 
            E : F[1] 
            F : 

        Shortest distances from A: 
            F: 10
            B: 4
            A: 0
            E: 9
            C: 1
            D: 7

    Bellman-Ford Algorithm: 
        Graph [ A, B, C, D, E ,F, G ]: 
            A : B[6] D[5] C[5] 
            B : E[-1] 
            C : B[-2] E[1] 
            D : C[-2] F[-1] 
            E : G[3] 
            F : G[3] 
            G : 

        Shortest distances from A: 
            G: 3
            B: 1
            D: 5
            E: 0
            A: 0
            C: 3
            F: 4

--------------------------------------


```
