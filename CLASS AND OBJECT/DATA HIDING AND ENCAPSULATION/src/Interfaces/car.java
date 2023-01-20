package Interfaces;

public class car implements engine,brake{
    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("i start like a normal car..");

    }

    @Override
    public void stop() {
        System.out.println("i stop like a normal car..");

    }

    @Override
    public void acc() {
        System.out.println("i accelerate like a normal car..");

    }
}
