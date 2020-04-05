package DataStructure.排序;



/**
 * 归并排序
 * 有错误未解决
 *
 * */
public class MergeSort {

    public static void mergeSort(int[] array){
        mSort(array,array,0,array.length-1);
        for (int a: array) {
            System.out.print(a + "    ");
        }

    }

    private static void mSort(int[] sr, int[] tr1, int s, int t) {
        //将数组分成两搬，然后进行排序

        int m;
        int[] tr2 = new int[sr.length+1];

        //如果s == t，就将sr中的元素赋值给tr1中
        if (s == t){
            //此处作为递归的终止标记
            tr1[s] = sr[s];
        }else{
            //否则就继续拆分并往下递归
            m = (s + t)/2;      //将sr[s...t] 平分为sr[s...m]和sr[m+1..t]
            mSort(sr,tr2,s,m);  //递归将sr[s..m]归并为有序的tr2[s..m]
            mSort(sr,tr2,m+1,t);    //递归将sr[m+1..t]归并为有序的tr2[m+1..t]
            merge(tr2,tr1,s,m,t);       //将tr2[s..m]和tr2[m+1..t]归并到tr1[s..t]
        }

    }

    //将sr归并到tr
    private static void merge(int[] sr, int[] tr, int i, int m, int n) {

        int j,k,l;

        for (j = m+1,k = i; i <= m && j <= n;k++){
            //假设用0和5进行比较，如果0小于5，就将0放入tr中，因为我们的最终目的是将数字逐个放入tr中以形成有序数组
            if (sr[i] < sr[j]){
                tr[k] = sr[i++];
            }else {
                tr[k] = sr[j++];
            }

            if (i <= m){
                for (l = 0; l <= m-i; l++){
                    tr[k+l] = sr[i+l];
                }
            }

            if (j <= n){
                for (l = 0; l<= n-j; l++){
                    tr[k+l] = sr[j+l];
                }
            }
        }
    }

    public static void main(String[] args){

        int[] array = new int[]{50,10,90,30,70,40,80,60,20};
        mergeSort(array);

    }

}
