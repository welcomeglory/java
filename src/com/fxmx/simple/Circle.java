package com.fxmx.simple;


public class Circle{
    public double rad = 0; //���� ������
    public final double PI = 3.14;

    public Circle(double r) {
        setRad(r); //�Ʒ��� ���ǵ� setRad �޼ҵ� ȣ���� ���� �ʱ�ȭ
    }

   public void setRad(double r){
        if(r<0 ){ //�������� 0���� ���� �� �����Ƿ�
            rad = 0;
            return; //�޼ҵ带 ��������
        }
        rad = r;
    }

    public double getArea(){
        return (rad * rad) *PI; //���� ���̸� ��ȯ
    }
}