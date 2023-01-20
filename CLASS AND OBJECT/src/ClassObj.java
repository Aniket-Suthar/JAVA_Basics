public class ClassObj {
    public static void main(String[] args) {
//        Student s1;    //Declaring object
//        s1 = new Student(); // dynamically allocates memory and value at runtime
//        Student s3= new Student(2,"Ayush",34f); //allocating values in brackets
//        Student alpha =new Student(s3); // getting values from other object
//        Student beta  = new Student();  //calling constructor from constructor
//        System.out.println(beta.rollno);
//        System.out.println(beta.name);
//        System.out.println(beta.marks);
        Integer a =90;  // Wrapper class used to create a primitive to object
        int b =903;
        Integer c =54;
        int d =43;
        System.out.println(b==d);


    }
}
    // creating class
    class Student{
        int rollno;
        String name;
        float marks;
//        Student(){ //constructor - runs when we create and object
//            this.rollno=1;  // "this" keyword is used to access properties of a particular object created one by one
//            this.name ="ANiket";
//            this.marks = 45f;
//
//         }
         Student(int rollno,String name,float marks){
            this.rollno=rollno;
            this.name=name;
            this.marks=marks;
         }
        Student(Student other){    // making values to be accessed from other object using constructor
            this.rollno=other.rollno;
            this.name=other.name;
            this.marks=other.marks;
        }
        Student (){ // if no values are passed in object then this will be shown
            this(13,"default",89f);
        }

    }

