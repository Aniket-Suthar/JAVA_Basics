//public class Oops2 {
//    //initialisation fo static variable and static block

//    static int a =5;
//    static int b;
//
//    //this block run only once when the first obj is created i.e when the class is first loaded
//    static{
//        System.out.println("Hello I am a static block ... ");
//        b= a*8;
//    }
//    public static void main(String[] args) {
//        Oops2 a1 = new Oops2();
//        System.out.println("A is:" + Oops2.a + " "+ "B is :" + Oops2.b);
//
//        Oops2.b+= 4;
//        System.out.println("A is:" + Oops2.a + " "+ "B is :" + Oops2.b);
//
//        Oops2 a2 = new Oops2();
//        System.out.println("A is:" + Oops2.a + " "+ "B is :" + Oops2.b);
//    }
//}



//Inner classes.Concept
//public class Oops2 {
//    static class student {     // if this student class is not static then it cant be called in psvm as psvm requires as static class
//        static String name;   // but if this class is static then it can be used i psvm as it is not dependent on the Oops2 class which is not static main class
//
//        public student(String name) {      // if string variable in static class student is static then o/p is akash & akash
//            student.name = name;           //but if string var is not static then o/p will be aniket & akash as static class student and static class psvm
//                                           // can change their objects
//        }
//    }
//
//    public static void main(String[] args) {
//        student n1 = new student("ANiket");
//        student n2 = new student("Akash");
//        System.out.println(n1.name);
//        System.out.println(n2.name);
//
//    }
//}



//SINGLETON class

public class Oops2{
        private Oops2(){    //private stuff can be used in the the same file only
    }                       //creating private a constructor

    private static Oops2 instance;   //declaring private instance for Oops class

        public static Oops2 getInstance(){      //checking the availability of the instance for the private class created or not
            if (instance == null) {
                instance= new Oops2();
            }
            return instance;    // returning the same instance value crated for the first object/instance
        }
}