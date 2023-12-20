// Shape sınıfı  => Builder tasarım desenindeki Product sınıfı
class Shape {
    private int numSides;
    private Point startPoint;
    private int sideLength;
    private int borderWidth;
    private String borderColor;
    private String fillColor;

    public Shape(int numSides, Point startPoint, int sideLength, int borderWidth, String borderColor, String fillColor) {
        this.numSides = numSides;
        this.startPoint = startPoint;
        this.sideLength = sideLength;
        this.borderWidth = borderWidth;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    @Override
    public String toString() {
        return "Shape [numSides=" + numSides + ", startPoint=" + startPoint + ", sideLength=" + sideLength +
               ", borderWidth=" + borderWidth + ", borderColor=" + borderColor + ", fillColor=" + fillColor + "]";
    }
}

// Point sınıfı (başlangıç konumu için) 
class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

// Builder arayüzü
interface ShapeBuilder {
    ShapeBuilder setNumSides(int numSides);
    ShapeBuilder setStartPoint(Point startPoint);
    ShapeBuilder setSideLength(int sideLength);
    ShapeBuilder setBorderWidth(int borderWidth);
    ShapeBuilder setBorderColor(String borderColor);
    ShapeBuilder setFillColor(String fillColor);
    Shape build();
}

// Concrete Builder sınıfı
class ConcreteShapeBuilder implements ShapeBuilder {
    private int numSides;
    private Point startPoint;
    private int sideLength;
    private int borderWidth;
    private String borderColor;
    private String fillColor;

    @Override
    public ShapeBuilder setNumSides(int numSides) {
        this.numSides = numSides;
        return this;
    }

    @Override
    public ShapeBuilder setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
        return this;
    }

    @Override
    public ShapeBuilder setSideLength(int sideLength) {
        this.sideLength = sideLength;
        return this;
    }

    @Override
    public ShapeBuilder setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    @Override
    public ShapeBuilder setBorderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    @Override
    public ShapeBuilder setFillColor(String fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    @Override
    public Shape build() {
        return new Shape(numSides, startPoint, sideLength, borderWidth, borderColor, fillColor);
    }
}

// Director sınıfı
class ShapeDirector {
    public Shape constructShape(ShapeBuilder builder) {
        return builder
            .setNumSides(4)
            .setStartPoint(new Point(0, 0))
            .setSideLength(50)
            .setBorderWidth(2)
            .setBorderColor("Black")
            .setFillColor("Red")
            .build();
    }
}