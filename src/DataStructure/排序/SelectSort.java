package DataStructure.排序;

/**
 * 选择排序: 每遍历一次，将最小值排到最前面
 *
 * 初始值：{4,1,3,2,6,4,8,5,9,5,4}
 * 第一次遍历：1,{4,3,2,6,4,8,5,9,5,4}
 * 第二次遍历：1,2,{4,3,6,4,8,5,9,5,4}
 * 第三次遍历：1,2,3,{4,6,4,8,5,9,5,4}
 *
 * */
public class SelectSort {

    public int[] selectSort(int[] array){

        int min, temp;

        for (int i= 0; i < array.length; i++){
            min = array[i];
            for (int j = i; j < array.length; j++){
                if (array[j] < min){
                    min = array[j];
                    temp = array[i];
                    array[i] = min;
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args){

        int[] array = new int[]{4,1,3,2,6,4,8,5,9,5,4};
        SelectSort selectSort = new SelectSort();
        int[] sort = selectSort.selectSort(array);

        for (int i:sort) {
            System.out.print(i + "    ");
        }
    }
}
