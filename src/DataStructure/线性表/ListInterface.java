package DataStructure.线性表;

/**
 * @Author:Liweijian
 * @Description:
 * @Date:Create in 18:14 2017/10/25 0025
 */
public interface ListInterface<T> {

    /**
     * 添加元素
     * */
    boolean add(T e);

    /**
     * 判断线性表是否为空
     * */
    boolean ListEmpty();

    /**
     *  清空线性表
     * */
    void ClearList();

    /**
     * 获取第i个元素
     * */
    T GetElem(int i);

    /**
     * 返回与value值相等的元素的序号
     * */
    int LocateElen(T value);

    /**
     * 将e插入到下标为i的位置
     * */
    int ListInsert(int i,T e);

    /**
     * 删除下标为i的元素
     * */
    T ListDelete(int i);

    /**
     * 返回线性表的长度
     * */
    int ListLength();

    /**
     * 将线性表输出
     * */
    public String toString();


}
