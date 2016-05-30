package cn.inherit;

public class InheritTest {
	

}
class Shape {

    protected String name;

    public Shape(){
        name = "shape";
    }

    public Shape(String name) {
        this.name = name;
    }
}

class Circle extends Shape {

    private double radius;

    public Circle() {
        radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String name) {
        this.radius = radius;
        this.name = name;
    }
}
