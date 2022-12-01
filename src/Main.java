abstract class Shape {
    abstract String getName();
}

class Circle extends Shape {
    public String getName() {
        return "circle";
    }
}

class Quad extends Shape {
    public String getName() {
        return "quad";
    }
}

class Triangle extends Shape {
    public String getName() {
        return "triangle";
    }
}

class Rectangle extends Shape {
    public String getName() {
        return "rectangle";
    }
}

class Hexagon extends Shape {
    public String getName() {
        return "hexagon";
    }
}

class ShapePrinter {
    public void printShapeName (Shape shape) {
        System.out.println(shape.getName());
    }
}

class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape hexagon = new Hexagon();
        ShapePrinter shapePrinter = new ShapePrinter();

        shapePrinter.printShapeName(circle);
        shapePrinter.printShapeName(quad);
        shapePrinter.printShapeName(triangle);
        shapePrinter.printShapeName(rectangle);
        shapePrinter.printShapeName(hexagon);
    }
}
