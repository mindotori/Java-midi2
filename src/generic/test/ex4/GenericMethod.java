package generic.test.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj){
        System.out.println("Object print: " + obj);
        return obj;
    }

    public static <T> T genericMethod(T t){ //제네릭 메서드(메서드에서 한정적으로 사용됨) - 메서드 호출 시점에 타입 인자 전달해서 타입 지음
        System.out.println("generic print: " + t);
        return t;
    }
    public static <T extends  Number> T numberMethod(T t){ // Number자식들만 올 수 있다.
        System.out.println("bound print: " + t);
        return t;
    }
}
