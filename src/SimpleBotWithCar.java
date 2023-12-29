package com.project_n1;

import java.util.Scanner;

public class SimpleBotWithCar {

    public static class Car {
        private String brand;
        private String model;
        private int year;

        public Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        public String describe() {
            return "Car: " + brand + " " + model + " (" + year + ")";
        }
    }

    public static class SimpleBot {
        public void compareNumbers() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter 1st num:");
            int num1 = scanner.nextInt();

            System.out.println("Enter 2nd num:");
            int num2 = scanner.nextInt();

            if (num1 > num2) {
                System.out.println(num1 + " is higher than " + num2);
            } else if (num1 < num2) {
                System.out.println(num1 + " is less than " + num2);
            } else {
                System.out.println("Equal");
            }
        }
    }
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022);
        String carDescription = myCar.describe();
        System.out.println(carDescription);

        SimpleBot bot = new SimpleBot();
        bot.compareNumbers();
    }
}
