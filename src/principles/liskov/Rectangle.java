package principles.liskov;

public class Rectangle extends Shape {

    private int h;
    private int b;

    @Override
    public void area(int h, int b) {
        System.out.println(h*b);
    }

}
