import java.util.ArrayList;
import java.util.List;

public class multipleObjectCreation {
    public static void main(String[] args) {

        ArrayList<Student1> lists = new ArrayList<Student1>();
        int[] r = {1, 2, 3};
        int[] m = {34, 33, 21};
        String[] n = {"A", "b", "c"};
        for (int i = 0; i < 3; i++) {
            Student1 s = new Student1(r[i], m[i], n[i]);
            lists.add(s);
        }

         lists.get(1).printing();
    }
}
    class Student1 {
        int rno;
        int marks;
        String name;

        Student1(int rno,int marks,String name){
            this.rno=rno;
            this.marks=marks;
            this.name =name;
        }

        void printing(){
            System.out.println(this.rno);
            System.out.println(this.marks);
            System.out.println(this.name);
        }
    }

