package com.fxmx.simple;


public class Circle{
    public double rad = 0; //원의 반지름
    public final double PI = 3.14;

    public Circle(double r) {
        setRad(r); //아래의 정의된 setRad 메소드 호출을 통한 초기화
    }

   public void setRad(double r){
        if(r<0 ){ //반지름은 0보다 작을 수 없으므로
            rad = 0;
            return; //메소드를 빠져나감
        }
        rad = r;
    }

    public double getArea(){
        return (rad * rad) *PI; //원의 넓이를 반환
    }
}