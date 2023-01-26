package Constructor;

import java.util.ArrayList;

import Models.Shape;

public class Shapes {
    ArrayList<Shape> content;

    public Shapes() {
        this.content = new ArrayList<>();
    }

    public void add(Shape shape) {
        content.add(shape);
    }

    public String calcAllPerimetrs() {
        StringBuilder sb = new StringBuilder();
        for (Shape shape : content) {
            sb.append(String.format("Фигура: %s Периметр: %f \n", shape.description(), shape.calcPerimetr()));
        }
        return sb.toString();
    }

    public String calcAllAreas() {
        StringBuilder sb = new StringBuilder();
        for (Shape shape : content) {
            sb.append(String.format("Фигура: %s Площадь: %f \n", shape.description(), shape.calcArea()));
        }
        return sb.toString();
    }
}