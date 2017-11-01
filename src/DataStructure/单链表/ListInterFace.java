package DataStructure.单链表;

/**
 * @Author:Liweijian
 * @Description:
 * @Date:Create in 13:14 2017/11/1 0001
 */
public interface ListInterFace<T>{

    /**
     * 添加元素
     * */
     void addElement(T e);

     /**
      *  插入元素
      * */
     int insertElement(int index, T e);

     /**
      * 删除元素,返回删除的元素
      * */
     T deleteElement(int index);

     /**
      * 清除链表
      * */
     int clearList();

     /**
      * 返回节点长度
      * */
     int nodeLength();

     /**
      * 打印链表
      * */
     void printList();

}
