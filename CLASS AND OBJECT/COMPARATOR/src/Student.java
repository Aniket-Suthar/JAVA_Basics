public class Student implements Comparable<Student> {
    int rolln;
    float marks;

     public Student(int a,float b){
         this.rolln= a;
         this.marks=b;
     }

    @Override
    public String toString() {
        return marks +" ";
    }

    @Override
    public int compareTo(Student o) {
        int diff=(int)(this.marks-o.marks);
        return diff;
         // if diff ==0 : then both are same
        //if diff <0 : o is bigger else o is smaller
    }
}
