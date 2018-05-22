package DataStructure.二叉树;


import java.util.TreeSet;

/**
 * 查找二叉树
 * */
public class SearchBinTree {

    private Node rootNode = null;

    /**
     * 插入数据
     * */
    public void insertNode(int insertData){

        //如果根节点为空，则创建根节点
        if (rootNode == null){
            rootNode = new Node(false,false);
            rootNode.data = insertData;
            return;
        }

        insertNode(insertData,rootNode);
    }

    /**
     * @param insertData 要插入的数据
     * @param node 开始比较的节点
     * */
    private void insertNode(int insertData, Node node){

        //插入的数据与节点相等,直接返回
        if (insertData == node.data){
            return;
        }else if (insertData > node.data){
            //如果插入的数据大于节点的数值，则放在右子树
           if (node.rightChildNode == null){
               node.rightChildNode = new Node(false,true);
               node.rightChildNode.data = insertData;     //插入数据
               node.rightChildNode.parentNode = node;
               return;
           }else {
               insertNode(insertData,node.rightChildNode);         //继续对比右子节点
           }
        }else {
            if (node.leftChildNode == null){
                node.leftChildNode = new Node(true,false);
                node.leftChildNode.data = insertData;
                node.leftChildNode.parentNode = node;
                return;
            }else {
                insertNode(insertData,node.leftChildNode);
            }
        }
    }

    /**
     * 查找节点
     * */
    public Node search(int data, Node node){
        if (rootNode == null){
            return null;
        }
        if (data == node.data){
            return node;
        }else if (node.data > data && node.leftChildNode != null){
            return search(data,node.leftChildNode);
        }else if (node.data < data && node.rightChildNode != null){
            return search(data,node.rightChildNode);
        }else {
            return null;
        }
    }


    /**
     * 获取Root节点
     * */
    public Node getRootNode() {
        return rootNode;
    }

    /**
     * 中序遍历
     * */
    private void midOrder(Node node){

        if (node.leftChildNode != null){
            midOrder(node.leftChildNode);
        }
        System.out.println(node.data);
        if (node.rightChildNode != null){
            midOrder(node.rightChildNode);
        }
    }

    public void midOrder(){
        if (rootNode == null){
            return;
        }
        midOrder(rootNode);
    }

}
