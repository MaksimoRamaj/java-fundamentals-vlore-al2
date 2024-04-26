package JavaAdvanced;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many persons do you want to enter...");
        int choice= sc.nextInt();
        do {
            System.out.println("Give person name:");
            String nameP= sc.next();
            System.out.println("Give person age:");
            int ageP= sc.nextInt();

            Person person = new Person(nameP, ageP);

            person.introduce();

            choice = choice-1;
        }while(choice>0);



        String option;

        System.out.println("Enter initial amount...");
        int balance = sc.nextInt();

        System.out.println("Enter your account number...");
        String accNum = sc.nextLine();
        BankAccount bank = new BankAccount(accNum, balance);

        do {
            System.out.println("Choose an option:\nAdd balance(1)\nWithdraw balance(2)\nShow balance(3)\nExit(4)");
            option = sc.next();


            switch (option) {
                case "1":
                    System.out.println("Enter amount to deposit...");
                    double depositAmount = sc.nextDouble();
                    bank.depositMoney(depositAmount);
                    break;
                case "2":
                    System.out.println("Enter amount to withdraw...");
                    double withdrawalAmount = sc.nextDouble();
                    try {
                        bank.withdrawMoney(withdrawalAmount);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "3":
                    System.out.println("Your balance is " + bank.checkBalance() + " on your bank acount " + bank.getAccountNum());
                    break;
                case "4":
                    System.out.println("Exiting...");

                    break;
                default:
                    System.out.println("Invalid option! Please choose a valid option.");
            }
        } while (!option.equals("4"));


        Car car = new Car();

        car.startEngine();
        car.Drive();
        car.pressTheBrakes();
        car.stopEngine();

        ElectricCar electricCar= new ElectricCar();
        electricCar.startEngine();
        electricCar.Drive();
        electricCar.pressTheBrakes();
        electricCar.stopEngine();

        Vehicle vehicle= new Vehicle() {
            @Override
            void startEngine() {
                System.out.println("Vehicle is starting the engine");
            }

            @Override
            void stopEngine() {
                System.out.println("Vehicle is stopping");
            }
        };

        vehicle.startEngine();
        vehicle.Drive();
        vehicle.pressTheBrakes();
        vehicle.stopEngine();

    }

}
