class person {
    String name;
    int age;

    person(String s, int a) {
        this.name = s;
        this.age = a;
    }

    public void display() {
        System.out.println("The name of person is:" + this.name);
        System.out.println("The age of person is:" + this.age);
    }
}

class Stud extends person {
    String branch;
    int rollno;

    Stud(String name, int a, String branch, int roll) {
        super(name, a);
        this.branch = branch;
        this.rollno = roll;

    }

    public void display() {
        System.out.println("The name of student is:" + this.name);
        System.out.println("The age of student is:" + this.age);
        System.out.println("Student's roll no is:" + this.rollno);
        System.out.println("Student's Branch is:" + this.branch);

    }
}

class testing {
    public static void main(String[] args) {
        person p1 = new Stud("ANiket", 20, "Computer Engineering", 229);
        p1.display();
    }
}