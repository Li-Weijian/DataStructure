package DataStructure.单链表;

/**
 * @Author:Liweijian
 * @Description: 没有头结点的链表
 * @Date:Create in 11:27 2017/11/1 0001
 */
public class MyList implements ListInterFace<Integer>{

    public Node<Integer> head = null;   //头结点

    @Override
    public void addElement(Integer e) {

        Node<Integer> newNode = new Node<>(e);

        //如果头节点为空，则将新节点赋值给头结点
        if (head == null){
            head = newNode;
            return;
        }

        Node<Integer> temp = head;
        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }

    @Override
    public int insertElement(int index, Integer e) {
        int j = 1;
        Node<Integer> p;
        p = head;

        //头指针不为空且索引值小于当前遍历的节点下标
        while (p!= null && index > j){
            p = p.next;
            ++j;
        }

        //如果链表为空或者当前遍历的节点下标大于索引值，说明要插入的位置错误
        if (p == null || j > index){
            return 0;
        }

        Node<Integer> s = new Node<>(e);
        s.next = p.next;
        p.next = s;

        return 1;
    }

    @Override
    public int clearList() {
        Node<Integer> p = head;
        Node<Integer> q;

        while (p.next != null){
            q = p.next;
            p = q;
        }

        head = null;
        return 1;


    }

    @Override
    public Integer deleteElement(int index) {

        int j = 1;
        Node<Integer> p = head;
        Node<Integer> q;

        while (p.next != null && j < index){
            p = p.next;
            ++j;
        }

        if (p == null || j > index ){
            return 0;
        }

        q = p.next;
        p.next = q.next;        //p.next = p.next.next
        return q.data;
    }

    @Override
    public void printList() {
        Node<Integer> p = head;
        while (p != null){
            System.out.print(p.data+" ");
            p = p.next;
        }
    }

    @Override
    public int nodeLength() {

        Node<Integer> p = head;
        int i = 1;

        while (p.next!= null){
            p = p.next;
            i++;
        }
        return i;
    }
}
