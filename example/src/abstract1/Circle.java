package abstract1;

abstract class Ab1 {

    abstract void draw();

}

public class Circle extends Ab1 {

    void draw() {
        System.out.println("Drawing Circle");
    }

    public static void main(String[] args) {
        Circle shape1 = new Circle();
        shape1.draw();
    }
}