package DataStructure.图;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Map;

/**
 * 图 -- 使用邻接矩阵进行创建
 * */
public class Graph {

    private int vertexSize;     //顶点数量
    private int[] vertexs;      //顶点数组集合
    public int[][] matrix;     //矩阵
    public static final int MAX_WEIGHT = 1000;  //最大权值，代表两个顶点没有出度入度

    public Graph(int vertexSize) {
        this.vertexSize = vertexSize;
        vertexs = new int[vertexSize];
        matrix = new int[vertexSize][vertexSize];
        for (int i = 0; i < vertexSize; i++){
            vertexs[i] = i;
        }
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



}
