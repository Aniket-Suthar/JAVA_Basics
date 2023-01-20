import java.io.FileReader;
import java.io.IOException;

class File_5 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\ANIKET SUTHAR\\JAVA\\com.Aniket\\LEC_17_10_22\\test.txt");
        int i = 0;
        int line = 0, word = 0, ch = 0;
        while ((i = fr.read()) != -1) {
            char c = (char) (i);
            if (c == '\n') {
                line++;
                word++;
                ch--;
            } else if (c == ' ') {
                word++;
            } else {
                ch++;
            }
        }
        fr.close();
        System.out.println("The no of words are:" + word);
        System.out.println("The no of charcters are :" + ch);
        System.out.println("The no of lines are :" + line);
    }
}