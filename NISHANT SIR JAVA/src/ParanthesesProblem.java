import java.util.*;
public class ParanthesesProblem
{
    public static boolean Parantheses(String s) {
        Stack<Character> stk = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(': stk.push(c); break;
                case '{': stk.push(c); break;
                case '[': stk.push(c); break;
                case ')': if (stk.empty() || stk.peek()!='(') return false;
                else stk.pop(); break;
                case '}': if (stk.empty() || stk.peek()!='{') return false;
                else stk.pop(); break;
                case ']': if (stk.empty() || stk.peek()!='[') return false;
                else stk.pop(); break;
                default: ;
            }
        }
        return stk.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println("Enter The string :");
        Scanner sc= new Scanner(System.in);
        String s =sc.nextLine();
        boolean check = Parantheses(s);
        if(check){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}