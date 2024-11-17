package collection.link;

public class NodeMain1 {

    public static void main(String[] args) {
        //노드 생성하고 연결하기: A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B"); //"B"를 연결
        first.next.next = new Node("C");

        System.out.println("모든 노드 탐색하기");
        Node x = first;
        while (x != null){ //next가 null이 아닐때까지
           System.out.println(x.item);
           x = x.next;
       }
    }
}
