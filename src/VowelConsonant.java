import java.util.Scanner;

public class VowelConsonant {
    public static void main(String args[]) {
        int v = 0;
        int c = 0;
        int i = 0;
        //String[] vowel = {"a", "e", "i", "o", "u"};
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        name.toLowerCase();
        for(i=0;i<name.length();i++){
            char ch = name.charAt(i);
           if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
               v++;
        }
           else if(ch>='a'&&ch<='z'){
               c++;
           }
        }
        System.out.printf("THe numbers of vowels are %d and consonants are %d",v,c);

        }
    }

