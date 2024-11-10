package generic.test.ex5;

import generic.animal.Animal;

public class WildcardEx {

    static <T> void printGenericV1(Box<T> box){ //제너릭 메서드
        System.out.println("T = " + box.get());
    }

    //Box<Dog>, Box<Cat>, Box<Object> - 와일드카드에 다 들어올 수 있다.
    // 타입 인자가 이미 정해진 제네릭 타입을 받을 수 있다.
    static void printWildcardV1(Box<?> box){ // 일반적인 메서드 (제너릭 메서드 아님)
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box){
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box){
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
