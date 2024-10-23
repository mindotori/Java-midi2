package generic.ex1;

public class BoxMain2 {
    //Object 사용
//다형성을 활용하여 코드의 중복 제거 / 재사용성 up
    //but 타입 안정성 문제가 발생 (타입 안정성이 떨어짐)
    //반환 시점에도 Object를 반환하기 때문에 원하는 타입을 정확하게 받을 수 없다.
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); // Object -> Integer 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); // Object -> String 캐스팅
        System.out.println("str = " + str);

        //잘못된 타입의 인수 전달시
        integerBox.set("문자100");
        Integer result = (Integer)integerBox.get(); //String -> Integer 캐스팅 예외 터짐
        System.out.println("result = " + result);
    }
}
