package bai1;

public class main {
    public static void main(String[] args) {
        Circle ci=new Circle(6);
        System.out.println("dien tich la "+ci.getArea());
        System.out.println("chu vi la  "+ci.getCircumference());
        Circle ci2=new Circle(-5);
        System.out.println("dien tich"+ci2.getArea());
    }
}
