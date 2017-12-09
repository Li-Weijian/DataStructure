package DataStructure.顺序队列;

/**
 * @Author:Liweijian
 * @Description: 顺序队列的实现
 * @Date:Create in 14:37 2017/12/9 0009
 */
public class MyQueue<T> {

    public static int MAXSIZE = 32;
    int rear;       //头指针
    int front;      //尾指针
    Object[] data = null;

    public MyQueue() {
        this(MAXSIZE);
    }

    public MyQueue(int maxsize) {
        MAXSIZE = maxsize;
        data = new Object[maxsize];
    }

    /**
     * 初始化一个空队列
     * */
    public void  initQueue(){
        rear = 0;
        front = 0;
    }


    /**
     * 插入一个新元素（入队）
     * */
    public void enQueue(T e){

        //如果为满队列时
        if ((rear+1)%MAXSIZE == front){
            throw new RuntimeException("队列已满");
        }

        data[rear] = e;     /*将元素e赋值给队尾*/
        rear = (rear+1)%MAXSIZE;    /*rear指针向后移一位*/
    }

    /**
     *  删除一个元素（出队）并返回
     *
     * */
    public T deQueue(){

        //如果队列为空时
        if (rear == front){
            throw new RuntimeException("队列为空");
        }

        T e = (T) data[front];  /*将对头元素赋值给e*/

        front = (front+1)%MAXSIZE;  /*将队头元素向后移，如果到达队尾则回到数组头部*/
        return e;
    }


    /**
     * 获取队列的长度
     *
     * */
    public int getSize(){
        return (rear - front + MAXSIZE) % MAXSIZE;
    }

    /**
     * 清空队列
     * */
    public void  clearQueue(){
        rear = 0;
        front = 0;
        MAXSIZE = 32;
    }


    /**
     * 打印队列
     * */
    public String printQueue(){

        String queueStr = "[";

        //使用新指针代替队列指针，防止出现指针错误的情况
        int newRear = rear;
        int newFront = front;

        while (newFront != newRear){
            queueStr = queueStr + data[newFront] + ",";
            newFront++;
        }

        return queueStr+"]";
    }


}
