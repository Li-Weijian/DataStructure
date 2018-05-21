package DataStructure.二叉树;


import java.util.Comparator;

/**
 * 二叉树的结点
 *
 * */
public class Node  {

    //结点数据
    int data;
    //父节点、左子节点、右子节点
    Node parentNode, leftChildNode, rightChildNode;

    //是否是左子结点
    boolean isLeftChildNode = false;
    //是否是右子节点
    boolean isRightChildNode = false;

    public Node(boolean isLeftChildNode, boolean isRightChildNode) {
        this.isLeftChildNode = isLeftChildNode;
        this.isRightChildNode = isRightChildNode;
    }

}
