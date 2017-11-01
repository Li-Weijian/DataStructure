package DataStructure.线性表;

/**
 * @Author:Liweijian
 * @Description:
 * @Date:Create in 19:01 2017/10/25 0025
 */
public class TestMyList {

    public static void main(String[] args){
        MyList<String> list = new MyList<String>(8);
        System.out.println("线性表为空表：" + list.toString());

        for (int i = 0; i<5;i++){
            list.ListInsert(i,new String((char)('A' + i) + ""));
        }
        System.out.println("list insert finished:" + list.toString());

        System.out.println("list get 3:" + list.GetElem(3));


        System.out.println("list delete 3:" + list.ListDelete(3) +"---"+ list.toString());

    }
}
