package generic.ex1;

public class BoxMain1 {
//코드 중복이 심함 / 코드 재사용성 ⬇
    //하지만 타입 안정성은 높다 (개발자가 실수할 확률 적음)
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.set(10); //오토 박싱
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);
    }
}
