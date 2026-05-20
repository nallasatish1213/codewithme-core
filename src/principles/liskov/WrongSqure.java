package principles.liskov;

public class WrongSqure extends Rectangle {

    @Override
    public void area(int h, int b) {
        super.area(h, b);
    }
}
