package DataStructure.排序;


/**
 * 插入排序
 * {81,33,22,67,45,87,54,99,-1,-6,37}
 * 第一趟排序：33, 81,22,67,45,87,54,99,-1,-6,37
 * 第二趟排序：22, 33, 81,67,45,87,54,99,-1,-6,37
 * ....
 * 简单点说就是如果要比较的数字比前面的小，就将前面的有序序列一个一个往后面挪
 * */
public class InsertSort {

    public static void insertSort(int[] array){

        //从数组中的第二个元素进行遍历
        for (int i = 1; i < array.length; i++){
            int tmp = array[i];
            int j;
            //从后面往前面遍历
            for (j = i - 1; j >= 0; j--){
                if (array[j] > tmp){
                    array[j + 1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = tmp;
        }

        for (int i:array) {
            System.out.print(i + "    ");
        }
    }

    public static void insertSort_1(int[] array){
        int i, j, temp;

        for (i = 1; i < array.length; i++){
            //如果当前元素比前一个元素小
            if (array[i] < array[i-1]){
                temp = array[i];

                for (j = i-1;j >= 0 &&array[j] > temp ; j--){
                    array[j+1] = array[j];      //元素后移
                }
                array[j+1] = temp;   //将元素插入到合适的位置
            }
        }

        for (int a:array) {
            System.out.print(a + "    ");
        }


    }


    public static void main(String[] args){

        int[] array = new int[]{81,33,22,67,45,87,54,99,-1,-6,37};
//        insertSort(array);
        insertSort_1(array);
    }
}
