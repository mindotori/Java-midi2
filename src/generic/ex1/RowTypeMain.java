package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox(); //제네릭 타입 안넣어도 되긴 함
        //GenericBox<Object> integerBox = new GenericBox<>(); //권장
        integerBox.set(10); //근데 Object로 인식
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);

        // 이런 로 타입은 사용하지 않아야 한다.
    }
}
