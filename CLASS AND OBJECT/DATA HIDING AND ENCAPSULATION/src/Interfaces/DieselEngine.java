package Interfaces;

public class DieselEngine implements engine{
    @Override
    public void start() {
        System.out.println("Diesel engine starts...");
    }

    @Override
    public void stop() {
        System.out.println("Diesel engine stops...");

    }

    @Override
    public void acc() {
        System.out.println("Diesel engine accelerates..");
    }
}
