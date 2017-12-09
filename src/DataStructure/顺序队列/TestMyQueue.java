package DataStructure.顺序队列;

/**
 * @Author:Liweijian
 * @Description: 顺序队列测试代码
 * @Date:Create in 15:10 2017/12/9 0009
 */
public class TestMyQueue {

    public static void main(String[] args){

        MyQueue<Integer> queue = new MyQueue<>();

//        queue.initQueue();
        for (int i = 0; i < 31; i++){
            queue.enQueue(i);
        }
        System.out.println("入队："+queue.printQueue());

        System.out.println("第一次出队："+queue.deQueue());
        System.out.println("第二次出队："+queue.deQueue());

        System.out.println("出队两次："+queue.printQueue());

        System.out.println("获取队列长度："+queue.getSize());

        queue.clearQueue();
        System.out.println("清空队列："+queue.printQueue());
    }

}
