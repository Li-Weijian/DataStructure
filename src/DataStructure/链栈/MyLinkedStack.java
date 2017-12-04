package DataStructure.链栈;

/**
 * @Author:Liweijian
 * @Description:
 * @Date:Create in 15:37 2017/12/4 0004
 */
public class MyLinkedStack<T> {

   private StackNode<T> top = null;
   private int size = 0;

    /*
    *  节点类
    * */
    class StackNode<T>{
        T data;
        StackNode next = null;

        StackNode(T data){
            this.data = data;
        }
    }

    /*
    *   进栈操作
    * */
    public void push(T e){
        StackNode<T> stackNode = new StackNode<>(e);
        stackNode.next = top;
        top = stackNode;
        size++;
    }

    /*
    * 出栈操作
    * */
    public T pop(){

        if (top == null){
            System.out.println("空栈！");
        }

        //保存出栈元素数据
        T data = top.data;

        top = top.next;
        size--;

        return data;
    }

    /*
    *  获取栈的长度
    * */
    public int getSize(){
        return size;
    }

    /*
    *   打印栈
    * */
    public String printStack(){

        String stack = "[";
        StackNode<T> oldTop = top;

        if (top == null){
            return null;
        }else {
            while (top != null){
                stack = stack + top.data + ",";
                top = top.next;
            }
        }
        top = oldTop;
        return stack + "]";
    }
}
