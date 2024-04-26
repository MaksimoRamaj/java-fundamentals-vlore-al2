package JavaAdvanced;

abstract class Vehicle {

    void Drive() {
        System.out.println("The vehicle is being driven");
    }

    void pressTheBrakes(){
        System.out.println("The car is braking");
    }

    abstract void startEngine();
    abstract void stopEngine();
}
