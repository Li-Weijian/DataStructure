package DataStructure.单链表;

/**
 * @Author:Liweijian
 * @Description:
 * @Date:Create in 13:46 2017/11/1 0001
 */
public class TestLinkList {

    public static void main(String[] args){
        MyList myList = new MyList();


        for (int i = 0; i < 5; i ++){
            myList.addElement(i+3);
        }

        System.out.println("LinkList length is :" + myList.nodeLength());
        System.out.println("LinkList head data is :" + myList.head.data);
        System.out.print("LinkList is :"); myList.printList();
        myList.insertElement(3,88);
        System.out.println();
        System.out.print("LinkList add a element to 3 is  :"); myList.printList();
        System.out.println();
        myList.deleteElement(3);
        System.out.print("LinkList delete a element from 3 is :"); myList.printList();
        System.out.println();
        myList.clearList();
        myList.printList();


    }
}
