class A2{
   int a; // 인스턴스(객체) 변수
   
   public int getA() {
      return a;
   }
   
   public void setA(int b) {
      a = b;
   }
}


class B2{
   int b;
   
   public int getB() {
      return b;
   }
   
}

//Circle circle = new Circle();
//Circle circle2 = new Circle();

class Circle1{
   final double PI = 3.14;
   double radius =0;
   
   //생성자
   //일반 함수와는 쪼매 다름
   //1. 리턴타입 없음 2. 클래스 이름과 이름이 같은 함수 3. return 이 없음   
   public Circle1() {
      System.out.println("안녕하세요");
   }
   
   public double getRadius() {
      return radius;
   }


   public void setRadius(double radius) {
      this.radius = radius;
   }


   public double getArea() {
      return radius * radius * PI;
   }   
}

class Rectangle1{
   double width = 20;
   double height = 20;
   
   public double getArea() {
      return width * height;
   }
   
   public void setWidthHeight(double num1,double num2) {
      width = num1;
      height = num2;      
   }
   
   public void setWidth(double num1) {
      width = num1;   
   }
}

class AA{
   //생성자
   //일반 함수와는 쪼매 다름
   //1. 리턴타입 없음 2. 클래스 이름과 이름이 같은 함수 3. return 이 없음   
   //용도 : 인스턴스 변수(멤버변수) 초기화 시키는게 목적
   int num;
   int count;
   
   
   public AA() {
     System.out.println();
  }
   
   public AA(int num, int count) {
      this.num = num; 
      this.count = count;
   }
   
   public int getNum() {
      return num;
   }

   public void setNum(int num) {
      this.num = num;
   }
   
   
}

public class ex16 {

   public static void main(String[] args) {
      
      
      AA aa = new AA();      
      System.out.println(aa);
      
      AA aa2 = new AA(5, 10);      
      System.out.println(aa2.getNum());
      
      aa2.setNum(100);
      System.out.println(aa2.getNum());
   }

}