package DataStructure.循环链表;

/**
 * @Author:Liweijian
 * @Description:
 * @Date:Create in 20:28 2017/11/3 0003
 */
public class MyList implements InterFace<Integer> {

    public Node<Integer> header = null;


    public MyList(){
        header = new Node<>(null);      //创建头结点并将值设置为空
        header.next = header;       //将头指针指向头指针，构成循环
    }


    @Override
    public void addElement(Integer e) {
        Node<Integer> p = new Node<>(e);
        //如果链表为空，则插入到第一个元素
        if (header.next == header){
            header.next = p;
            p.next = header;
        }else {
            //否则，找到链表末尾并插入
            Node<Integer> q = header;
            while (q.next != header){
                q = q.next;
            }
            q.next = p;
            p.next = header;        //将尾指针指向头指针
        }
    }

    @Override
    public void insertElement(Integer e, int i) {
        Node<Integer> temp = header;
        Node<Integer> p;
        int j = 0;

        while(temp.next!=header && j < i)//寻找最后一个元素
        {
            j++;
            temp=temp.next;
        }
        Node<Integer> q = new Node<>(e);
        p = temp.next;
        temp.next = q;
        q.next = p;

    }

    @Override
    public Integer deleteElement(int i) {

        int j = 0;
        Node<Integer> q = header;
        Node<Integer> temp;
        if (i > size()){
            return null;
        }

        while (q.next != header && j < i){
            ++j;
            q = q.next;
        }

        temp = q.next;
        q.next = q.next.next;

        return temp.data;
    }

    @Override
    public Integer getElement(int i) {

        int j = 0;
        Node<Integer> temp = header;

        while (temp.next != header && j < i){
            temp = temp.next;
            ++j;
        }

        return (Integer) temp.next.data;
    }

    @Override
    public int size() {

        Node<Integer> p = header;
        int i = 0;

        while (p.next!= header){
            p = p.next;
            i++;
        }
        return i;
    }

    @Override
    public void printList() {
        Node<Integer> p = header.next;
        while (p != header){
            System.out.print(p.data+" ");
            p = p.next;
        }
    }

    @Override
    public boolean isContain(Integer e) {
        return false;
    }
}
