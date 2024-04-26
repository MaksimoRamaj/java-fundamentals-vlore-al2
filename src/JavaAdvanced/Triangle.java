package JavaAdvanced;

class Triangle extends Figure {
    public Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    void area() {
        double area = (double) (getBase() * getHeight()) /2;

        System.out.println("The area of the triangle is "+ area+ " sqm");
    }
}
