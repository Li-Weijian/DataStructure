package DataStructure.图;

import java.util.LinkedList;

/**
 * 图 -- 使用邻接矩阵进行创建
 * */
public class Graph {

    private int vertexSize;     //顶点数量
    private int[] vertexs;      //顶点数组集合
    public int[][] matrix;     //矩阵
    public static final int MAX_WEIGHT = 1000;  //最大权值，代表两个顶点没有出度入度
    private boolean[] isVisit;  //访问标记

    public Graph(int vertexSize) {
        this.vertexSize = vertexSize;
        vertexs = new int[vertexSize];
        matrix = new int[vertexSize][vertexSize];
        for (int i = 0; i < vertexSize; i++){
            vertexs[i] = i;
        }

        isVisit = new boolean[vertexSize];
    }

    /**
     * 获取图的出度
     * */
    public int getOutDegree(int index){
        int degree = 0;
        for (int i = 0; i < matrix[index].length; i++){
            //既不等于0并且不等于最大权值。
            if (matrix[index][i] != 0 && matrix[index][i] != MAX_WEIGHT){
                degree++;
            }
        }
        return degree;
    }

    /**
     * 获取图的入度
     * */
    public int getEnDegree(int index){
        int degree = 0;
        for (int i = 0; i < matrix[index].length; i++){
            //既不等于0并且不等于最大权值。
            if (matrix[i][index] != 0 && matrix[i][index] != MAX_WEIGHT){
                degree++;
            }
        }
        return degree;
    }

    /**
     * 获取两个顶点之间的权值
     * @return 权值为0，返回0。 两点为连线，返回-1
     * */
    public int getWeight(int v1, int v2){
        int weight = matrix[v1][v2];
        if (weight == 0){
            return 0;
        }else if (weight == MAX_WEIGHT){
            return -1;
        }else {
            return weight;
        }
    }


    /**
     *  图的深度优先遍历算法
     * */
    public void depthFirstSearch(){
        for (int i = 0; i < vertexSize; i++){
            if (!isVisit[i]){
                System.out.println("访问了:"+i+ "顶点");
                depthFirstSearch(i);
            }
        }
    }

    /**
     *  图的深度优先遍历算法
     * */
    private void depthFirstSearch(int i) {
        //首先将访问标记置为真
        isVisit[i] = true;
        //获取顶点的第一个邻接顶点
        int neighbor = getFirstNeighbor(i);

        //如果邻接顶点存在
        while (neighbor != -1){
            //如果邻接顶点未被访问
            if (!isVisit[neighbor]){
                System.out.println("访问了:"+neighbor+ "顶点");
                depthFirstSearch(neighbor);
            }
            //如果邻接顶点已被访问，则获取下一个邻接顶点
            neighbor = getNextNeighbor(i,neighbor);
        }

    }

    /**
     * 图的广度优先搜索算法
     * */
    public void breadthFirstSearch(){
        for (int i = 0; i < vertexSize; i++){
            if (!isVisit[i]) {
                breadthFirstSearch(i);
            }
        }
    }


    /**
     * 图的广度优先搜索算法
     * */
    private void breadthFirstSearch(int i) {
        int u,w;
        //LinkedList实现了Queue接口，所以可以具有队列的特性
        LinkedList<Integer> queue = new LinkedList<>();
        System.out.println("访问了:"+ i + "顶点");
        //将顶点访问标记置为真
        isVisit[i] = true;
        //将顶点入队
        queue.add(i);

        //如果队列不为空
        while (!queue.isEmpty()) {
            //将顶点出队
            u = queue.removeFirst().intValue();
            //找该顶点的第一个节点
            w = getFirstNeighbor(i);
            while (w != -1){
                if (!isVisit[w]){
                    isVisit[w] = true;
                    System.out.println("访问了:"+ w + "顶点");
                    queue.add(w);
                }
                w = getNextNeighbor(u,w);
            }

        }

    }

    /**
     * 获取下一个邻接顶点
     * */
    private int getNextNeighbor(int v, int index) {
        for (int i = index + 1; i < vertexSize; i++){
            if (matrix[v][i] > 0 && matrix[v][i] < MAX_WEIGHT){
                return i;
            }
        }
        return -1;
    }


    /**
     * 获取第一个邻接顶点
     * */
    private int getFirstNeighbor(int index) {
        for (int i = 0; i < vertexSize; i++) {
            if (matrix[index][i] > 0 && matrix[index][i] < MAX_WEIGHT) {
                return i;
            }
        }
        return -1;
    }


}
