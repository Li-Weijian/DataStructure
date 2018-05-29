package DataStructure.排序;


/**
 * 希尔排序
 * {9,1,5,8,3,7,4,6,2}
 *
 * */
public class ShellSort {

    public static void shellSort(int[] array){

        int incr = array.length;
        int temp, j, i;
        //设置如果步长大于一的话，就进行循环
        while (incr > 1){
            incr = incr / 3 + 1;
            for ( i = incr; i < array.length; i++){
                //如果后面的小于前面的数字
                if (array[i] < array[i - incr]){
                    temp = array[i];
                    //将两个数字进行换位
                    for ( j = i - incr; j >= 0 && temp < array[j]; j -= incr){
                        array[j+incr] = array[j];
                    }
                    array[j + incr] = temp;
                }
            }
        }


        for (int a:array) {
            System.out.print(a + "    ");
        }
    }

    public static void main(String[] args){

        int[] array = new int[]{9,1,5,8,3,7,4,6,2,11,79,33,24,64,32,-1,34,65,34,77,33,25,43,82,24,64};
        shellSort(array);

    }


}
