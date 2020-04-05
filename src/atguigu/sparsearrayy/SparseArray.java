package atguigu.sparsearrayy;

/**
 * @auther: liweijian
 * @Date: 2020/4/5 13:16
 * @Description: 稀疏数组
 */
public class SparseArray {

    public static final int ROW = 11;
    public static final int COL = 11;

    public static void main(String[] args) {

        //创建一个二维数组 11 * 11
        int[][] chessArray = new int[ROW][COL];
        chessArray[1][2] = 1;
        chessArray[3][4] = 2;

        System.out.println("原始的二维数组：");
        for (int[] ints : chessArray) {
            for (int i : ints) {
                System.out.printf("%d\t", i);
            }
            System.out.println();
        }

        //转换为稀疏数组
        //1. 先遍历原始数组，找到所有非0的元素的个数
        int sum = 0;
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (chessArray[i][j] != 0){
                    sum++;

                }
            }
        }

        //2. 创建稀疏数组，稀疏数组
        //稀疏数组的第一行 存储的是 原始数组的行、列、非0个数
        //第二行开始才存储非0数据的 行、列、数值
        int[][] sparseArr = new int[sum+1][3];
        sparseArr[0][0] = ROW;
        sparseArr[0][1] = COL;
        sparseArr[0][2] = sum;

        int count = 0;
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (chessArray[i][j] != 0){
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArray[i][j];
                }
            }
        }

        //输出稀疏数组
        System.out.println();
        System.out.println("稀疏数组为：");
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
        }

        //还原原始数组
        //根据稀疏数组的第一行 构建原始数组的行和列
        int[][] chessArray2 = new int[sparseArr[0][0]][sparseArr[0][1]];

        //从第二行开始
        for (int i = 1; i < sparseArr.length; i++) {
            chessArray2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }

        System.out.println();
        System.out.println("稀疏数组 -> 原始数组：");
        for (int[] ints : chessArray2) {
            for (int i : ints) {
                System.out.printf("%d\t", i);
            }
            System.out.println();
        }
    }

}
