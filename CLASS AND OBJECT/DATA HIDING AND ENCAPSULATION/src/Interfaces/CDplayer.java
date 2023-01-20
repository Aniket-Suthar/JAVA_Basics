package Interfaces;

public class CDplayer implements media{

    @Override
    public void start() {
        System.out.println("media stars..");
    }

    @Override
    public void stop() {
        System.out.println("media stops..");
    }
}
