import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student a = new Student(12,33f);
        Student b = new Student(23,44.33f);
        Student c = new Student(3,94.33f);
        Student d = new Student(43,64.33f);
        Student e = new Student(2,24.33f);

        Student [] list ={a,b,c,d,e};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -(int)(o1.marks-o2.marks);
            }
        });
        System.out.println(Arrays.toString(list));
//        if(aps.compareTo(abs) <0){
//            System.out.println("ABs has more marks..");
//        }
    }
}