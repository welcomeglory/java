class Grade {
    int math, kor, eng;
    double avg;
    
    Grade() {
    }
    
    public void initGrade(int math, int kor, int english) {
        this.math = math;
        this.kor = kor;
        this.eng = english;
    }
    
    public double getAvg() {
        double avg = (math + kor + eng) / 3.0;
        return avg;
    }

    public String getGrade() {
        String str;
        if(avg >= 90) {
                str = "�� �Դϴ�.";
        } else if(avg >= 80) {
                str = "�� �Դϴ�.";
        } else if(avg >= 70) {
                str = "�� �Դϴ�.";
        } else if(avg >= 60) {
                str = "�� �Դϴ�.";
        } else {
                str = "�� �Դϴ�.";
        }
        return str;
    }

}


class TV{
   String color;
   int size;
   
   public TV(int size, String color) {
      this.size = size;
      this.color = color;
   }

   public int getSize() {
      return size;
   }

   public void setSize(int size) {
      this.size = size;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public void show() {
      System.out.println(size + " ��ġ" + color + " �� �Դϴ�.");
   }
}

class Triangle{
   double width;
   double height;
   
   public void initTriangle(double width, double height) {
      this.width = width;
      this.height = height;
   }

   public double getArea() {
      return (width * height) / 2.0;
   }

}

public class ex17 {

   public static void main(String[] args) {
      
        Grade grade = new Grade();
        
        System.out.println("��Ȯ��" + grade.eng + grade.math + grade.kor );
        grade.initGrade(90, 70, 60);
        
        System.out.println(grade.getAvg());
        System.out.println(grade.getGrade());        
        
        TV tv = new TV(10,"blue");
        TV tv2 = new TV(20,"blue");
        
        System.out.println(tv.getSize() + "��ġ �Դϴ�");
        System.out.println(tv.getColor() + "�� �Դϴ�");
        
        tv.show(); // 10 ��ġ bule �� �Դϴ�.       
      
        Triangle triangle2 = new Triangle();
        triangle2.initTriangle(10, 1000);
                
        System.out.println("�ﰢ���� ���̴�" + triangle2.getArea());

   }

}
