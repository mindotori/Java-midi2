package generic.ex1;

public class BoxMain3 {
//제네릭 => 코드 재사용성 UP, 타입 안정성O

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>(); //생성 시점에 T 타입 결정
        integerBox.set(10);
        //integerBox.set("문자100"); // Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get(); // Integer 타입 반환(캐스팅 할 필요X)
        System.out.println("integer = " + integer);


        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        //원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        //타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox1 = new GenericBox<Integer>(); // 타입 직접 입력
        GenericBox<Integer> integerBox2 = new GenericBox<>(); // 타입 추론
    }
}
