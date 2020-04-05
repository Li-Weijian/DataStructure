package apply.lanqiao;

import java.util.Scanner;

/**
 * @Auther: liweijian
 * @Date: 2019/9/15 17:18
 * @Description:
 * 小明刚刚看完电影《第K级台阶》，离开电影院的时候，他数了数礼堂前的台阶数，恰好是K级!
 * 站在台阶前，他突然又想着一个问题：
 *
 * 如果我每一步只能迈上1个或2个台阶。先迈左脚，然后左右交替，最后一步是迈右脚，
 *
 * 也就是说一共要走偶数步。那么，上完K级台阶，有多少种不同的上法呢？
 *
 * 请你利用计算机的优势，帮助小明寻找答案。
 *
 * 输入
 * 一个整数K（10<=K<=20）
 *
 * 输出
 * 整数，走法的种数
 */
public class Exam10_TheKthStep {

    public static int count = 0;

    //k:台阶数, n:步数
    public static void go(int k, int n){

        if (k < 0){
            return;
        }

        if (k == 0 && (n&1) == 0){
            count++;
        }

        go(k - 1,n+1);
        go(k - 2 ,n+1);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        go(k,0);
        System.out.println(count);


    }
}
