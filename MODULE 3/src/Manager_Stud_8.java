import java.io.*;


class Student1 implements Serializable {
    int rollno;
    String Name;

    Student1(int rollno, String Name) {
        this.rollno = rollno;
        this.Name = Name;
    }

    public String toString() {
        return "Roll no:" + rollno + "\nName: " + Name + "\n";
    }
}

class Manager_Stud_8 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student1 s1 = new Student1(229, "Aniket");
        Student1 s2 = new Student1(228, "Vaidik");

        //writing Object to file
        FileOutputStream fos = new FileOutputStream(new File("test4.txt"));
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.writeObject(s2);


        oos.writeObject(s1);
        oos.close();
        fos.close();

        System.out.println("The content of Student class is: ");
        //Reading object from file
        FileInputStream fis = new FileInputStream(new File("test4.txt"));
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student1 t1 = (Student1) ois.readObject();
        Student1 t2 = (Student1) ois.readObject();

        System.out.println(t1.toString());
        System.out.println(t2.toString());

        fis.close();
        ois.close();

        //Updating Value of Object
        s1.Name = "Aniket Suthar";
        FileOutputStream fos1 = new FileOutputStream(new File("test4.txt"));
        ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
        oos1.writeObject(s1);
        oos1.close();
        fos1.close();

        System.out.println("After updating the content of Student class is:");
        FileInputStream fis1 = new FileInputStream(new File("test4.txt"));
        ObjectInputStream ois1 = new ObjectInputStream(fis1);

        Student1 t = (Student1) ois1.readObject();
        System.out.println(t.toString());


    }
}

