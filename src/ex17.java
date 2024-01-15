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
                str = "수 입니다.";
        } else if(avg >= 80) {
                str = "우 입니다.";
        } else if(avg >= 70) {
                str = "미 입니다.";
        } else if(avg >= 60) {
                str = "양 입니다.";
        } else {
                str = "가 입니다.";
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
      System.out.println(size + " 인치" + color + " 색 입니다.");
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
        
        System.out.println("값확인" + grade.eng + grade.math + grade.kor );
        grade.initGrade(90, 70, 60);
        
        System.out.println(grade.getAvg());
        System.out.println(grade.getGrade());        
        
        TV tv = new TV(10,"blue");
        TV tv2 = new TV(20,"blue");
        
        System.out.println(tv.getSize() + "인치 입니다");
        System.out.println(tv.getColor() + "색 입니다");
        
        tv.show(); // 10 인치 bule 색 입니다.       
      
        Triangle triangle2 = new Triangle();
        triangle2.initTriangle(10, 1000);
                
        System.out.println("삼각형의 넓이는" + triangle2.getArea());

   }

}
