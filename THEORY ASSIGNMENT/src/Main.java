import java.util.Scanner;
class course{
    int courseCode;
    String courseName;
    double marks;
    course(int courseCode,String courseName,double marks){
        this.courseCode =  courseCode;
        this.courseName = courseName;
        this.marks = marks;
    }
}
class Studentupd{
    int rollNo;
    String name;

    double totalMarks;
    course[] c = new course[3];
    static int highestMarks;
    Studentupd( int roll_no, String name) {
        this.rollNo=roll_no;
        this.name=name;

    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Studentupd[] s = new Studentupd[3];
        for (int i = 0; i < 10; i++) {
            System.out.println("enter rollNo");
            int roll_no = Integer.parseInt(in.nextLine());
            System.out.println("enter your name");
            String name = in.nextLine();
            s[i] = new Studentupd(roll_no, name);
            for (int j = 0; j < 3; j++) {
                System.out.println("enter coursecode");
                int courseCode = Integer.parseInt(in.nextLine());
                System.out.println("enter marks in that course");
                double marks = Integer.parseInt(in.nextLine());
                System.out.println("enter course name");
                String courseName = in.nextLine();

                s[i].c[j] = new course(courseCode, courseName, marks);
            }
            s[i].totalMarks = s[i].c[0].marks + s[i].c[1].marks + s[i].c[2].marks;
        }

    }
}
