class A2{
   int a; // �ν��Ͻ�(��ü) ����
   
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
   
   //������
   //�Ϲ� �Լ��ʹ� �ɸ� �ٸ�
   //1. ����Ÿ�� ���� 2. Ŭ���� �̸��� �̸��� ���� �Լ� 3. return �� ����   
   public Circle1() {
      System.out.println("�ȳ��ϼ���");
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
   //������
   //�Ϲ� �Լ��ʹ� �ɸ� �ٸ�
   //1. ����Ÿ�� ���� 2. Ŭ���� �̸��� �̸��� ���� �Լ� 3. return �� ����   
   //�뵵 : �ν��Ͻ� ����(�������) �ʱ�ȭ ��Ű�°� ����
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