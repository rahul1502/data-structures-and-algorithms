package DataStructures.BinarySearchTree;

public class BinarySearchTreeRunner {

    public void run() {

        System.out.println("DataStructures.BinarySearchTree: ");

        // initialize the binary search tree
        BinarySearchTree binarySearchTree = new BinarySearchTree(new BinaryNode(15));

        // insert nodes
        binarySearchTree.insertNode(binarySearchTree.root, new BinaryNode(10));
        binarySearchTree.insertNode(binarySearchTree.root, new BinaryNode(20));
        binarySearchTree.insertNode(binarySearchTree.root, new BinaryNode(8));
        binarySearchTree.insertNode(binarySearchTree.root, new BinaryNode(12));
        binarySearchTree.insertNode(binarySearchTree.root, new BinaryNode(17));
        binarySearchTree.insertNode(binarySearchTree.root, new BinaryNode(25));
        binarySearchTree.insertNode(binarySearchTree.root, new BinaryNode(24));
        binarySearchTree.insertNode(binarySearchTree.root, new BinaryNode(13));
        binarySearchTree.insertNode(binarySearchTree.root, new BinaryNode(16));
        binarySearchTree.insertNode(binarySearchTree.root, new BinaryNode(18));
        binarySearchTree.insertNode(binarySearchTree.root, new BinaryNode(22));
        binarySearchTree.insertNode(binarySearchTree.root, new BinaryNode(23));
        System.out.println("    Inserted nodes: 10, 20, 8, 12, 17, 25, 24, 13, 16, 18, 22, 23");

        // search node
        BinaryNode node10 = binarySearchTree.searchNode(binarySearchTree.root, 10);
        System.out.println("    Search value 10: " + node10.data);

        // find min element in BST
        System.out.println("    Minimum value in the BST: " + binarySearchTree.findMin(binarySearchTree.root).data);

        // find max element in BST
        System.out.println("    Maximum value in the BST: " + binarySearchTree.findMax(binarySearchTree.root).data);

        // find parent node of a node in BST
        System.out.println("    Parent node of node 17: " + binarySearchTree.findParent(binarySearchTree.root, 17).data);

        // delete node
        System.out.println("    Delete node: 8");
        binarySearchTree.deleteNode(binarySearchTree.root, 8);
        System.out.println("    Delete node: 12");
        binarySearchTree.deleteNode(binarySearchTree.root, 12);
        System.out.println("    Delete node: 20");
        binarySearchTree.deleteNode(binarySearchTree.root, 20);

    }

}
