package Interfaces;

public class PetrolEngine implements engine{

    @Override
    public void start() {
        System.out.println("THe petrol engine starts..");
    }
    @Override
    public void stop() { System.out.println("THe petrol engine stops.");
    }
    @Override
    public void acc() {
        System.out.println("THe petrol engine accelerates...");
    }

    }

