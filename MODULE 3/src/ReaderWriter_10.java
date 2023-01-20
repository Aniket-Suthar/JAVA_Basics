import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class ReaderWriter_10 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("newfile.txt");
        File f1 = new File("newfile.txt");
        fw.write("HEllo my name is aniket\n");
        fw.write("Im pursuing my Btech. in CSE from PDEU,Gandhinagar\n");
        fw.write("Im currently in BTech. sem 3rd\n");
        fw.close();

        //reading the content of file
        System.out.println("THE CONTENT OF FILE " + "'" + f1.getName() + "' " + "is :");
        FileReader fr = new FileReader("newfile.txt");
        int l;
        while ((l = fr.read()) != -1) {
            System.out.print((char) l);
        }
        fr.close();
    }
}
