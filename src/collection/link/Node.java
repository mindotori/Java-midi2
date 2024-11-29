package collection.link;

public class Node {

    Object item;
    Node next;

    public Node(Object item){
        this.item = item;
    }

   /*
   //IDE 생성 toString()
   @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }*/

    //[A->B->C]
    @Override
    public String toString() {
        //loop에서 문자를 붙일때는 StringBuilder가 좋다
        StringBuilder sb = new StringBuilder();
        Node x = this; //자기 자신 (첫번째 노드)
        sb.append("[");
        while (x != null){
            sb.append(x.item);
            if(x.next != null) {
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");
        return  sb.toString();
    }
}
