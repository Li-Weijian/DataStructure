package apply.Stack;

/**
 * @Author:Liweijian
 * @Description: 实现输出前40位斐波,那契数
 * @Date:Create in 16:13 2017/12/4 0004
 */
public class Fibonacci {


    public static void main(String[] args){
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("-------------常规方法输出------------");
        fibonacci.conventional();
        System.out.println();
        System.out.println("-------------递归方法输出------------");
        fibonacci.recursive();


    }


    /**
     *  常规实现 -- for循环
     * */
    public void  conventional(){
        int i;
        int[] a = new int [40];

        a[0] = 0;
        a[1] = 1;

        System.out.print(a[0]+ ","+a[1] + ",");

        for (i = 2; i < a.length;i++){
            a[i] = a[i-1] + a[i-2];
            System.out.print(a[i] + ",");
        }
    }


    /**
     * 递归实现
     * */
    public void recursive(){

        int i;
        for (i = 0; i < 40; i++){
           System.out.print(fbi(i)+",");
        }

    }

    public int fbi(int i){
        if (i < 2){
            return i == 0 ? 0 : 1;
        }
        return fbi(i-1) + fbi(i-2);
    }




}
