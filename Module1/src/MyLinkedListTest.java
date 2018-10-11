
import Node.MyLinkedList;
public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList();
       list.addFirst("Ha Noi");
       list.addFirst("Hue");
       list.addLast("Da Nang");
       list.add(3,"Sai Gon");
        System.out.println("List=");
       list.printList();
        System.out.println("Size:");
        System.out.println(list.size());
        System.out.println("New List:");
        list.removeObject("Ha Noi");
        list.printList();

    }
}
