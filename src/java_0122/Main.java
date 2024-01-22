package java_0122;

// �������̽� ����
interface MyInterface {
    // �߻� �޼ҵ�
    void myMethod();
    // ����Ʈ �޼ҵ�
    default void defaultMethod() {
        System.out.println("�⺻ ������ defaultMethod ȣ��");
    }
}

// �������̽��� �����ϴ� Ŭ����
class MyClass implements MyInterface {
    // �߻� �޼ҵ��� ����
    public void myMethod() {
        System.out.println("MyClass�� myMethod ȣ��");
    }
}

// ��� ����
public class Main {
    public static void main(String[] args) {
        // MyClass�� ��ü ����
    	MyInterface myObject = new MyClass();
        // MyInterface�� ���� �߻� �޼ҵ� ȣ��
        myObject.myMethod();
        // MyInterface�� ����Ʈ �޼ҵ� ȣ��
        myObject.defaultMethod();
    }
}