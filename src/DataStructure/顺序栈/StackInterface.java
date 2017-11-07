package DataStructure.顺序栈;

/**
 * @Author:Liweijian
 * @Description:
 * @Date:Create in 20:50 2017/11/7 0007
 */
public interface StackInterface<T>{

    /**
     *  若栈存在，则销毁它
     * */
    public boolean destroyStack();

    /**
     *  清空栈
     * */
    public boolean clearStack();

    /**
     *  判断栈是否为空，如果为空，则返回true，否则返回false
     * */
    public boolean stackEmpty();

    /**
     *  获取栈顶元素
     * */
    public T getTop();

    /**
     *  在栈顶插入元素
     * */
    public boolean push(T e);

    /**
     * 推出栈顶元素
     * */
    public T pop();

    /**
     * 返回栈的长度
     * */
    public int stackLength();

    /**
     *  打印栈
     * */
    public void printStack();



}
