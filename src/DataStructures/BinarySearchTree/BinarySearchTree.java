package DataStructures.BinarySearchTree;

public class BinarySearchTree {

    BinaryNode root;

    public BinarySearchTree(BinaryNode root) {
        this.root = root;
    }

    public void insertNode(BinaryNode current, BinaryNode node) {
        if(node.data > current.data) {
            if(current.right == null) {
                current.right = node;
                return;
            }
            insertNode(current.right, node);
        }
        else {
            if(current.left == null) {
                current.left = node;
                return;
            }
            insertNode(current.left, node);
        }
    }

    public void deleteNode(BinaryNode current, int value) {

        BinaryNode nodeToBeDeleted = searchNode(current, value);
        BinaryNode parentNode = findParent(current, nodeToBeDeleted.data);

        if(nodeToBeDeleted.left == null && nodeToBeDeleted.right == null) {
            // case 1 - leaf node
            if (parentNode.right.data == nodeToBeDeleted.data){
                parentNode.right = null;
            }
            else {
                parentNode.left = null;
            }
        }
        else if (nodeToBeDeleted.right != null && nodeToBeDeleted.left != null) {
            // case 3 - node with two children
            BinaryNode minOfRightSubTree = findMin(nodeToBeDeleted.right);
            if (parentNode.right.data == nodeToBeDeleted.data){
                parentNode.right.data = minOfRightSubTree.data;
            }
            else {
                parentNode.left.data = minOfRightSubTree.data;
            }
            deleteNode(nodeToBeDeleted.right, minOfRightSubTree.data);
        }
        else {
            // case 2 - node with exactly one child
            if (parentNode.right != null && parentNode.right.data == nodeToBeDeleted.data){
                parentNode.right = nodeToBeDeleted.right != null ? nodeToBeDeleted.right : nodeToBeDeleted.left;
            }
            else {
                parentNode.left = nodeToBeDeleted.right != null ? nodeToBeDeleted.right : nodeToBeDeleted.left;
            }
        }
    }

    // find parent node of a node in BST
    public BinaryNode findParent(BinaryNode current, int value) {

        if((current.left != null && current.left.data == value) ||
                (current.right != null && current.right.data == value)) {
            return current;
        }

        if(value > current.data) {
            return findParent(current.right, value);
        }
        else {
            return findParent(current.left, value);
        }
    }

    public BinaryNode searchNode(BinaryNode current, int value) {
        if(current.data == value) {
            return current;
        }

        if(value > current.data) {
            return searchNode(current.right, value);
        }
        else {
            return searchNode(current.left, value);
        }
    }

    public BinaryNode findMin(BinaryNode current) {
        if(current.left == null) {
            return current;
        }
        return findMin(current.left);
    }

    public BinaryNode findMax(BinaryNode current) {
        if(current.right == null) {
            return current;
        }
        return findMax(current.right);
    }

}
