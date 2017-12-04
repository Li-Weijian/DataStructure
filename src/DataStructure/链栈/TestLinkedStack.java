package DataStructure.链栈;

import java.util.Random;

/**
 * @Author:Liweijian
 * @Description: 链栈的测试类
 * @Date:Create in 15:51 2017/12/4 0004
 */
public class TestLinkedStack {

    public static void main(String[] args){
        MyLinkedStack<Integer> stack = new MyLinkedStack<>();

        for (int i = 0; i < 5; i++){
            stack.push(i);
        }
        System.out.println(stack.printStack());

        Integer i = stack.pop();
        System.out.println(stack.printStack()+ "----"+i );

        System.out.println("size:"+stack.getSize());
}


}
