package generic.ex1;

public class GenericBox<T> {
//제네릭 클래스
    //제네릭 클래스를 사용할 때는 Integer, String 같은 타입을 미리 결정하지 않는다.***
    //T를 "타입 매개변수"라고 한다.
    //메더스에 필요한 값을 메서드 정의 시점에 미리 결정하는 것이 아니라, 메서드를 실제 사용하는 시점으로 미룰 수 있다.
    private T value;

    public void set(T value){
        this.value = value;
    }

    public T get() {
        return value;
    }
}
