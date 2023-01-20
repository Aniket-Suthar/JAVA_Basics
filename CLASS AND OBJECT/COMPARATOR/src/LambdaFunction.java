import java.util.ArrayList;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            a.add(i);
        }
        a.forEach((item) -> System.out.println(item * 2));

//    int sum(int a,int b){
//        return a+b;
//    }
    }}
