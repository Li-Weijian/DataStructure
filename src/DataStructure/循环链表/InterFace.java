package DataStructure.循环链表;

/**
 * @Author:Liweijian
 * @Description: 循环链表的方法接口
 * @Date:Create in 20:21 2017/11/3 0003
 */
public interface InterFace<T> {

    /**
     * 添加元素
     * */
    public void addElement(T e);

    /**
     * 插入元素
     * */
    public void insertElement(T e, int i);

    /**
     * 删除元素
     * */
    public T deleteElement(int i);

    /**
     * 获取元素
     * */
    public T getElement(int i);

    /**
     * 链表长度
     * */
    public int size();

    /**
     *  打印链表
     * */
    public void printList();

    /**
     *  判断是否存在元素
     * */

    public boolean isContain(T e);









}
