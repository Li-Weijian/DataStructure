package DataStructure.顺序栈;

/**
 * @Author:Liweijian
 * @Description:
 * @Date:Create in 21:14 2017/11/7 0007
 */
public class TestStack {

    public static void main(String[] args){
        MyStack myStack = new MyStack();
        for (int i = 0; i < 5; i++){
            myStack.push(i);
        }

        myStack.printStack();
        myStack.pop();
        myStack.printStack();
        myStack.push(8);
        myStack.printStack();
        System.out.println(myStack.getTop());
        myStack.clearStack();
        myStack.printStack();
    }

}
