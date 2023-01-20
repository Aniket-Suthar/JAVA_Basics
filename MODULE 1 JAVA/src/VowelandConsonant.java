
    import java.util.Scanner;


    public class VowelandConsonant {
        public static void main(String[] args) {
            System.out.println("PROGRAM TO CALCULATE VOWEL AND CONSONANTS");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your String :");
            String s = sc.nextLine();
            int vowel = 0 ;
            int consonant=0;
            s = s.toLowerCase();
            for (int i = 0; i < s.length() ; i++) {
                if (s.charAt(i)!=' ' && s.charAt(i)>=97 && s.charAt(i)<=122) {
                    char ch = s.charAt(i);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowel++;
                    } else consonant++;
                }
            }
            System.out.println("The number of Vowels are " + vowel );
            System.out.println("The number of consonants are " + consonant);
        }
    }


