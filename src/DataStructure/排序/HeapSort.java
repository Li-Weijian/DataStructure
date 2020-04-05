package DataStructure.排序;


/**
 * 堆排序
 * 通过不断讲父节点和最小子节点进行互换然后重新调整为堆的排序
 * */
public class HeapSort {

    public static void heapSort(int[] array){

        int i;

        //将数组中的元素构成最大堆
        for (i = array.length/2 -1; i >= 0; i--){
            //为什么要从length/2进行倒序遍历？
            //因为length/2 --> 1 他们都是有孩子的节点
            heapAdjust(array,i,array.length-1);
        }

        for (i = array.length-1; i >= 0 ; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapAdjust(array,0,i-1);
        }

        for (int a : array) {
            System.out.print(a + "    ");
        }
    }

    /**
     * 将节点整理成最大堆
     * */
    public static void heapAdjust(int[] array, int s, int m){

        int temp = array[s];
        int j;

        //j = s * 2的意思是为了找到s的左节点
        for (j = s*2; j < m; j *= 2){
            if (j < m && array[j] < array[j+1]){
                //如果左子节点小于右子节点，则将j指向右子节点
                ++j;
            }
            if (temp >= array[j]){
                //如果父节点大于或等于他的左右子节点，则不做任何修改
                break;
            }

            //将较大的左右子节点赋值给父节点
            array[s] = array[j];
            //将子节点的下标记录到s
            s = j;
        }
        array[s] = temp;
    }

    public static void main(String[] args){

        int[] array = new int[]{50,10,90,30,70,40,80,60,20};
        heapSort(array);
    }
}
