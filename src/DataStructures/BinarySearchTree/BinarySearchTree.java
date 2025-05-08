package DataStructures.BinarySearchTree;

public class BinarySearchTree {

    BinaryNode root;

    public BinarySearchTree(BinaryNode root) {
        this.root = root;
    }

    public void insertNode(BinaryNode currentNode, BinaryNode node) {

        if (node.data > currentNode.data) {
            if (currentNode.right == null) {
                currentNode.right = node;
                return;
            }
            insertNode(currentNode.right, node);
        }
        else {
            if (currentNode.left == null) {
                currentNode.left = node;
                return;
            }
            insertNode(currentNode.left, node);
        }
    }

    public BinaryNode searchNode(BinaryNode currentNode, int value) {

        if (currentNode == null) {
            return null;
        }

        if (value == currentNode.data) {
            return currentNode;
        }
        else if (value < currentNode.data) {
            return searchNode(currentNode.left, value);
        }
        else {
            return searchNode(currentNode.right, value);
        }
    }
    public void deleteNode(BinaryNode currentNode, int value) {

        BinaryNode nodeToBeDeleted = searchNode(currentNode, value);

        if (nodeToBeDeleted.left == null && nodeToBeDeleted.right == null) {
            nodeToBeDeleted = null;
        }
        else if (nodeToBeDeleted.left != null && nodeToBeDeleted.right == null) {
            nodeToBeDeleted = nodeToBeDeleted.left;
            nodeToBeDeleted.left = null;
        }
        else if (nodeToBeDeleted.left == null && nodeToBeDeleted.right != null) {
            nodeToBeDeleted = nodeToBeDeleted.right;
            nodeToBeDeleted.right = null;
        }
        else {
            BinaryNode maxValueNodeLeftSubTree = getMaxValueNode(nodeToBeDeleted.left);
            BinaryNode minValueNodeRightSubTree = getMinValueNode(nodeToBeDeleted.right);

            nodeToBeDeleted.data = maxValueNodeLeftSubTree.data;
            maxValueNodeLeftSubTree = null;
        }
    }

    public BinaryNode getMaxValueNode(BinaryNode currentNode) {
        if (currentNode.right == null) {
            return currentNode;
        }
        else {
            return getMaxValueNode(currentNode.right);
        }
    }

    public BinaryNode getMinValueNode(BinaryNode currentNode) {
        if (currentNode.left == null) {
            return currentNode;
        }
        else {
            return getMaxValueNode(currentNode.left);
        }
    }

    public BinaryNode getLowestCommonAncestor(BinaryNode currentNode, BinaryNode a, BinaryNode b) {

        boolean aLeft = false; boolean bLeft = false;
        boolean aRight = false; boolean bRight = false;

        // check if a or b belong to left subtree
        if (currentNode.left != null) {
            aLeft = (searchNode(currentNode.left, a.data) != null) ;
            bLeft = (searchNode(currentNode.left, b.data) != null) ;
        }

        // check if a or b belong to right subtree
        if (currentNode.right != null) {
            aRight = (searchNode(currentNode.right, a.data) != null) ;
            bRight = (searchNode(currentNode.right, b.data) != null) ;
        }

        // if a and b are in different sub-trees  (left and right) then currentNode is LCA
        if ((aLeft == true && bRight == true) || (aRight == true && bLeft == true)) {
            return currentNode;
        }
        // if currentNode is a, and b it's a's child then return a
        else if ((currentNode.data == a.data) && (bRight || bLeft)) {
            return a;
        }
        // if currentNode is b, and a it's b's child then return b
        else if ((currentNode.data == b.data) && (aRight || aLeft)) {
            return b;
        }
        // if both a and b are in currentNode's left subtree
        else if (aLeft == true && bLeft == true) {
            return getLowestCommonAncestor(currentNode.left, a, b);
        }
        // if both a and b are in currentNode's right subtree
        else if (aRight == true && bRight == true) {
            return getLowestCommonAncestor(currentNode.right, a, b);
        }
        else {
            return null;
        }
    }

    public void invertBinaryTree(BinaryNode currentNode) {

        BinaryNode temp;
        if (currentNode.left != null || currentNode.right != null) {
            temp = currentNode.left;
            currentNode.left = currentNode.right;
            currentNode.right = temp;
        }

        if (currentNode.left != null) {
            invertBinaryTree(currentNode.left);
        }

        if (currentNode.right != null) {
            invertBinaryTree(currentNode.right);
        }
    }

    public int height(BinaryNode currentNode) {

        if (currentNode == null) {
            return -1;
        }

        int leftHeight = (currentNode.left != null) ? height(currentNode.left) : 0;
        int rightHeight = (currentNode.right != null) ? height(currentNode.right) : 0;

        return Math.max(leftHeight, rightHeight) + 1;
    }

}
