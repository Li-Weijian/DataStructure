package DataStructure.二叉树;

public class TestSearcBinTree {

    public static void main(String[] args){

        SearchBinTree searchBinTree = new SearchBinTree();
        int[] data = new int[]{73,48,19,99,27,49,2,67,93};
        for (int i:data) {
            searchBinTree.insertNode(i);
        }

        searchBinTree.midOrder();


    }

}
