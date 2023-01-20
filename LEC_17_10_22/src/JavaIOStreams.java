import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class JavaIOStreams {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("test2.txt");
        fw.write("Hello im aniket.");
        fw.close();
//        FileReader fr1 = new FileReader("test2");
//        System.out.println(fr1.read());
        FileReader fr = new FileReader("E:\\ANIKET SUTHAR\\JAVA\\com.Aniket\\LEC_17_10_22\\test.txt");
        int i = 0;
        int line = 1, word = 0,ch=0;
        while ((i = fr.read()) != -1) {
            char c = (char) (i);
            if (c == '\n') {
                line++;
                word++;
            }
            else if(c==' '){
                word++;
            }
            else {
                ch++;
            }
        }
        fr.close();
        System.out.println("The no of words are:"+word);
        System.out.println("The no of charcters are :"+ch);
        System.out.println("The no of lines are :"+line);
    }
}