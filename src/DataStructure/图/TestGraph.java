package DataStructure.图;

import static DataStructure.图.Graph.MAX_WEIGHT;

/**
 * 图的测试方法
 * */
public class TestGraph {

    public static void main(String[] args){

        Graph graph = new Graph(5);

        //最好的方式就是让用户手动输入
        int [] a0 = new int[]{0,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,6};
        int [] a1 = new int[]{9,0,3,MAX_WEIGHT,MAX_WEIGHT};
        int [] a2 = new int[]{2,MAX_WEIGHT,0,5,MAX_WEIGHT};
        int [] a3 = new int[]{MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,0,1};
        int [] a4 = new int[]{MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,0};

        graph.matrix[0] = a0;
        graph.matrix[1] = a1;
        graph.matrix[2] = a2;
        graph.matrix[3] = a3;
        graph.matrix[4] = a4;
        int outDegree = graph.getOutDegree(4);
        System.out.println("出度："+outDegree);
        int enDegree = graph.getEnDegree(4);
        System.out.println("入度："+ enDegree);
        int weight = graph.getWeight(1, 2);
        System.out.println("权值："+ weight);


    }

}
