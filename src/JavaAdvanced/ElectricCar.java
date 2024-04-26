package JavaAdvanced;

class ElectricCar extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Electric car engine is starting");
    }

    @Override
    void stopEngine() {
        System.out.println("Electric car engine is stopping");
    }

    @Override
    void Drive() {
        System.out.println("Electric car is being driven");
    }

    @Override
    void pressTheBrakes() {
        System.out.println("Electric car is stopping");
    }
}
