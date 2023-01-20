package Interfaces;

public class newcar {
private engine eng;
private media player = new CDplayer();

public newcar(){
    eng = new DieselEngine();
}
public newcar(engine e){
    this.eng= e;
}
public void start()
    {
        eng.start();
    }
    public void stop()
    {
        eng.stop();
    }

    public void startmusic(){
         player.start();
    }
    public void stopmusic(){

         player.stop();
    }

    public void upgradeEngine(){
        this.eng =new PetrolEngine();
    }

}
