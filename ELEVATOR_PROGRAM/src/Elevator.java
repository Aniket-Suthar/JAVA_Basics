class Elevator extends Thread{

    }



class Passenger extends Thread{

    final int capacity=5;
    public void run(){
        if(Thread.activeCount()<=5){
            System.out.println("Thread "+this.getName()+"is running..");
        }
    }
}

class ElevFloor extends Thread {
    int preFloor;
    int DestFloor;

    ElevFloor(int p, int d) {
        preFloor = p;
        DestFloor = d;
    }
    ElevFloor e1 = new ElevFloor(2,3);
        public void run() {
            synchronized (e1){
                if (this.DestFloor > this.preFloor) {
                    for (int i = this.preFloor; i <= this.DestFloor; i++) {
                        if (i == this.DestFloor) {
                            System.out.println("The lift has reached the floor: " + i);
                            break;
                        } else {
                            System.out.println("Lift is going up to floor : " + i);
                        }
                    }
                }
                synchronized (this) {
                    if (this.DestFloor < this.preFloor) {
                    for (int i = this.preFloor; i >= this.DestFloor; i--) {
                        if (i == this.DestFloor) {
                            System.out.println("The lift has reached the floor: " + i);
                        } else {
                            System.out.println("Lift is going down to floor : " + i);
                        }
                    }

                }

                }
            }
        }
}

class T{
    public static void main(String[] args) {
        ElevFloor n1 = new ElevFloor(2,5);
        ElevFloor n3 = new ElevFloor(3,7);
        ElevFloor n2 = new ElevFloor(4,6);
        ElevFloor n4 = new ElevFloor(8,6);
        n1.start();
        n2.start();
        n3.start();
        n4.start();

    }
}