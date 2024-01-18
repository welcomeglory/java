package java_0118;
//했을시 자동으로 컴파일러가 넣는 코드를 완성하시오.
class A{
	//디폴트 생성자
	public A() {}
        
}
class B extends A{
	//디폴트 생성자,super()까지 생성해줌
	public B() {
		super();
	}
}
public class test24{
    public static void main(String[] args) {
    	B b = new B(); 
    	
	}
}