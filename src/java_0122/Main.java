package java_0122;

// 인터페이스 정의
interface MyInterface {
    // 추상 메소드
    void myMethod();
    // 디폴트 메소드
    default void defaultMethod() {
        System.out.println("기본 구현된 defaultMethod 호출");
    }
}

// 인터페이스를 구현하는 클래스
class MyClass implements MyInterface {
    // 추상 메소드의 구현
    public void myMethod() {
        System.out.println("MyClass의 myMethod 호출");
    }
}

// 사용 예시
public class Main {
    public static void main(String[] args) {
        // MyClass의 객체 생성
    	MyInterface myObject = new MyClass();
        // MyInterface를 통해 추상 메소드 호출
        myObject.myMethod();
        // MyInterface의 디폴트 메소드 호출
        myObject.defaultMethod();
    }
}