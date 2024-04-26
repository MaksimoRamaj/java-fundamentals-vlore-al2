package JavaAdvanced;

class Car extends Vehicle {

    @Override
    void Drive() {
        System.out.println("The car is being driven");
    }

    @Override
    void startEngine() {
        System.out.println("Car engine is starting");
    }

    @Override
    void stopEngine() {
        System.out.println("Car engine is stopping");
    }
}
