package collection.list;

public class BatchProcessor {

    private final MyList<Integer> list; //추상적인 MyList에 의존

    //MyList = MyArrayList
    //MyList = new MyLinkedList
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size){
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < size; i++){ //O(n)
            list.add(0,i); //앞에 추가 //O(1)
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
