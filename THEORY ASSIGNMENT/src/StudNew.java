import java.util.Scanner;

class Student {
    int roll_no;
    String name;


    Course c1, c2, c3;
    //    Course[] ourcourses = new Course[3];
    double total_marks;
    static double highest_marks;

    Student(int roll_no, String name, Course c1, Course c2, Course c3) {

        this.roll_no = roll_no;
        this.name = name;

        this.c1 = new Course(c1.coursecode, c1.coursename, c1.marks);
        this.c2 = new Course(c2.coursecode, c2.coursename, c2.marks);
        this.c3 = new Course(c3.coursecode, c3.coursename, c3.marks);

        Course[] c = new Course[3];
        c[0] = c1;
        c[1] = c2;
        c[2] = c3;
    }
}

class Course {
    int coursecode;
    String coursename;
    double marks;

    Course(int coursecode, String coursename, double marks) {
        this.coursecode = coursecode;
        this.coursename = coursename;
        this.marks = marks;
    }
}


class Stud_Details {
    public void highestmarks(double[] arr) {
        double hm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > hm) {
                hm = arr[i];
            }
        }
        Student.highest_marks = hm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students whose detail is to be entered: ");
        int num = Integer.parseInt(sc.nextLine());

        Student[] my_st_details = new Student[num]; // creating an array for the student type
        double[] t_m = new double[num]; // for storing the total marks for each student in the array

        for (int i = 0; i < num; i++) {
            System.out.println("Enter the details of STUDENT " + (i + 1) + ": ");
            System.out.println("Enter the roll number:");
            int myroll = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the name of student: ");
            String myname = sc.nextLine();
            System.out.println("Enter the coursecode, coursename and marks of 1st course: ");
            int coursecode1 = Integer.parseInt(sc.nextLine());
            String coursename1 = sc.nextLine();
            double marks1 = Double.parseDouble(sc.nextLine());

            System.out.println("Enter the coursecode, coursename and marks of 2nd course: ");
            int coursecode2 = Integer.parseInt(sc.nextLine());
            String coursename2 = sc.nextLine();
            double marks2 = Double.parseDouble(sc.nextLine());

            System.out.println("Enter the coursecode, coursename and marks of 3rd course: ");
            int coursecode3 = Integer.parseInt(sc.nextLine());
            String coursename3 = sc.nextLine();
            double marks3 = Double.parseDouble(sc.nextLine());

            my_st_details[i] = new Student(myroll, myname, new Course(coursecode1, coursename1, marks1), new Course(coursecode2, coursename2, marks2), new Course(coursecode3, coursename3, marks3));

            // storing the total marks one by one after each iteration for the respective student
            for (int j = 0; j < num; j++) {
                t_m[j] = marks1 + marks2 + marks3;
            }
        }

        Stud_Details hm = new Stud_Details();
        hm.highestmarks(t_m);

        System.out.println("\n\nThe highest marks are: " + Student.highest_marks + "\n\n");
    }
}


