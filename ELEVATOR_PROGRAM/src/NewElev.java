class NewElev extends Thread {
    int prefloor;
    int destfloor;
    NewElev(int p,int d){
        prefloor=p;
        destfloor=d;
    }
    public void run(){
        if(prefloor>destfloor){
            for (int i = 0; i <= destfloor; i++) {
                if(i==destfloor){
                    System.out.println("THe lift has reached the floor :" +i );
                    break;
                }
                else {
                    System.out.println("Lift is going up to floor :" +i);
                }
            }
        }
        else{
            for (int i = prefloor; i >=destfloor; i--) {
                if(i==destfloor){
                    System.out.println("THe lift has reached the floor :" +i );
                    break;
                }
                else {
                    System.out.println("Lift is going down to floor :" +i);
                }
            }

        }
    }

}
class t1{
    public static void main(String[] args) {
        ElevFloor e1 = new ElevFloor(1,3);
        e1.start();

    }
}
