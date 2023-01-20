import java.util.Scanner;
public class QuitString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        boolean a=true;
        int a1=0,e1=0,i1=0,o1=0,u1=0,c1=0,c2=0,c3=0,c4=0,c5=0;
        while(a=true){
        System.out.print("Enter the string:");
        String s= sc.nextLine();
        if(s.equals("quit") || s.equals(" ")){   //checking the condition for "quit" string
            break;
        }
        else{
        s=s.toLowerCase();
                for (int i = 0; i < s.length(); i++) {
                    if(s.charAt(i)=='a'){
                        a1++;

                    }
                    else if(s.charAt(i)=='e'){
                        e1++;

                    }
                    else if(s.charAt(i)=='i'){
                        i1++;

                    }
                    else if(s.charAt(i)=='o'){
                        o1++;

                    }
                    else if(s.charAt(i)=='u'){
                        u1++;

                    }

                }
            c1+=a1;c2+=e1;c3+=i1;c4+=o1;c5+=u1;

            System.out.println("THe number of A are:" + a1);
            System.out.println("THe number of E are:" + e1);
            System.out.println("THe number of I are:" + i1);
            System.out.println("THe number of U are:" + u1);
            System.out.println("THe number of O are:" + o1);
            }
        }
        System.out.println("Total 'A' are:" +c1);
        System.out.println("Total 'E' are:" +c2);
        System.out.println("Total 'I' are:" +c3);
        System.out.println("Total 'O' are:" +c4);
        System.out.println("Total 'U' are:" +c5);



    }
}
