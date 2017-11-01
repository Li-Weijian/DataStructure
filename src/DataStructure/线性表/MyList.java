package DataStructure.线性表;

/**
 * @Author:Liweijian
 * @Description: 线性表
 * @Date:Create in 18:07 2017/10/25 0025
 */
public class MyList<T> implements ListInterface<T>{

   /* public static final int Ok = 1;
    public static final int ERROR = 0;
    public static final int TRUE = 1;
    public static final int FALSE = 0;
*/

    private int len;
    private Object[] element;

    /**
     * 生成默认长度线性表
     * */
    public MyList(){
        this(64);
    }

    /**
     * 指定长度的构造方法
     * */
    public MyList(int size){
        this.element = new Object[size];
        this.len = 0;
    }

    /**
     * 添加元素
     * */
    @Override
    public boolean add(T e) {
        element[len] = e;
        len++;

        return true;
    }

    /**
     * 判断线性表是否为空
     * */
    @Override
    public boolean ListEmpty() {
        if (this.len == 0){
            return true;
        }else {
            return false;
        }
    }

    /**
     *  清空线性表
     * */
    @Override
    public void ClearList() {
        this.len = 0;
    }

    /**
     * 获取第i个元素
     * */
    @Override
    public T GetElem(int i) {
       if (element.length == 0 || i < 1 || i > element.length)
           return null;
       return (T) element[i];
    }

    /**
     * 返回与value值相等的元素的序号
     * */
    @Override
    public int LocateElen(T value) {
        for (int i = 0; i< this.len; i++){
            if (element[i].equals(value))
                return i;
        }
        return 0;
    }

    /**
     * 将e插入到下标为i的位置
     * */
    @Override
    public int ListInsert(int i, T e) {

        if (i > this.len+1 || i < 0)    //如果插入的位置大于线性表的长度或者不合理
            return 0;
        if (i == element.length)  //如果线性表为满
            return 0;
        if (i <= this.len){  //如果插入的位置不在表尾,则将要添加的元素之后的位置往后移一位
            for (int j = this.len - 1; j >= i; j--) {
                this.element[j + 1] = this.element[j];
            }
        }
        element[i] = e;
        this.len++;

        return 1;
    }

    /**
     * 删除下标为i的元素
     * */
    @Override
    public T ListDelete(int i) {

        T delete;
        int k;

        if (i > len || i < 1) return null;      //位置不正确
        if (len == 0)   return null;            //线性表为空

        delete = (T) element[i-1];
        if (i < len){       //如果删除的不是最后的元素
            for (k = i; k < len; k++){
                element[k-1] = element[k];
            }
        }

        this.len--;
        return delete;
    }

    /**
     * 返回线性表的长度
     * */
    @Override
    public int ListLength() {
        return this.len;
    }

    /**
     * 将线性表输出
     * */
    public String toString() {
        String str = "(";
        if (this.len > 0)
            str += this.element[0].toString();
        for (int i = 1; i < this.len; i++)
            str += ", " + this.element[i].toString();
        return str + ") "; // 空表返回()
    }
}
