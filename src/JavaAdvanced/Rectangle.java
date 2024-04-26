package JavaAdvanced;

class Rectangle extends Figure {
    public Rectangle(int base, int height) {
        super(base, height);
    }

    @Override
    void area() {
        double area = getBase()* getHeight();

        System.out.println("The rectangle area is "+ area+" sqm");
    }
}
