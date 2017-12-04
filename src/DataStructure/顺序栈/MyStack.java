package DataStructure.顺序栈;


/**
 * @Author:Liweijian
 * @Description:
 * @Date:Create in 20:47 2017/11/7 0007
 */
public class MyStack implements StackInterface<Integer> {

    private Object[] element;
    public int top;        //栈顶指针
    private int size;       //栈的初始长度

    public MyStack(){
        this(20);   //默认初始化长度
    }

    public MyStack(int size){
        element = new Object[size];     //自定义初始化长度
        this.size = size;
        top = -1;
    }


    @Override
    public boolean destroyStack() {
        if (element!= null){
            element = null;
            return true;
        }
        return false;
    }

    @Override
    public boolean clearStack() {
        top = -1;
        return true;

    }

    @Override
    public boolean stackEmpty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    @Override
    public Integer getTop() {
        return (Integer) element[top];
    }

    @Override
    public boolean push(Integer e) {

        if (top == size - 1 ){
            System.out.println("栈满！只能存储" + (size )+"个");
            return false;
        }

        top++;
        element[top] = e;
        return true;
    }

    @Override
    public Integer pop() {
        if (top == -1){
            return -1;
        }
        top--;
        return (Integer) element[top+1];
    }

    @Override
    public int stackLength() {
        return top+1;
    }

    @Override
    public void printStack() {

        String stack = "";
        if (top == -1)
            System.out.println("stack is empty!");

        for (int i = top; i >= 0; i--){
            stack = stack + element[i] + " ";
        }

        System.out.println(stack + "\n");
    }

}
