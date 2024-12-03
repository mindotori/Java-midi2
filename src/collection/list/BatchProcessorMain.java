package collection.list;

public class BatchProcessorMain {

    public static void main(String[] args) {
        //MyArrayList<Integer> list = new MyArrayList<>(); //array
        MyLinkedList<Integer> list = new MyLinkedList<>(); //linkedList => 더 빠름

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(100_000);
    }
}
