class Vehicle {
    void show() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
    void show() {
        super.show();
        System.out.println("This is a car");
    }
}

class ElectricCar extends Car {
    void show() {
        super.show();
        System.out.println("This is an electric car");
    }
}

public class lab3 {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.show();
    }
}
