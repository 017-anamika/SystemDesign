/*  3. Liskov Principle
Objects of a superclass should be replaceable with objects of a subclass without breaking the application’s correctness.
In other words: if class B is a subclass of class A, then we should be able to use an object of B wherever A is expected without surprises.
*/
interface Vehicle {
    void move();
}

class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving with engine power");
    }
}

class Bicycle implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bicycle is moving with pedal power");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bicycle();

        myCar.move();
        myBike.move();
    }
}




