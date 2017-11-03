package DataStructure.循环链表;

/**
 * @Author:Liweijian
 * @Description:
 * @Date:Create in 21:39 2017/11/3 0003
 */
public class TestLinkList {

    public static void main(String[] args){
        MyList myList = new MyList();


        for (int i = 0; i < 5; i ++){
            myList.addElement(i+3);
            System.out.println(i+3);
        }

        System.out.println("LinkList length is :" + myList.size());
        myList.insertElement(44,3);
        System.out.println();
        System.out.print("LinkList add a element to 3 is  :"); myList.printList();
        System.out.println();
        System.out.println("LinkList length is :" + myList.size());
        myList.deleteElement(3);
        System.out.print("LinkList delete a element from 3 is :"); myList.printList();
        System.out.println();
        System.out.println("LinkList length is :" + myList.size());
        System.out.println("3th Element is " + myList.getElement(3));


    }
}
