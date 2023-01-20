import java.io.*;
import java.util.Scanner;

class Duplicates_7 {
    public static void main(String[] args) throws IOException {

        File f1 = new File("C:\\ANIKET SUTHAR\\JAVA\\com.Aniket\\MODULE 3\\src\\duplicate.txt");
        File f2 = new File("C:\\ANIKET SUTHAR\\JAVA\\com.Aniket\\MODULE 3\\src\\noduplicate.txt");
        PrintWriter pw = new PrintWriter("C:\\ANIKET SUTHAR\\JAVA\\com.Aniket\\MODULE 3\\src\\noduplicate.txt");
        BufferedReader br = new BufferedReader(new FileReader("C:\\ANIKET SUTHAR\\JAVA\\com.Aniket\\MODULE 3\\src\\duplicate.txt"));
        String line = br.readLine();
        while (line != null) {
            boolean flag = true;
            BufferedReader br1 = new BufferedReader(new FileReader("C:\\ANIKET SUTHAR\\JAVA\\com.Aniket\\MODULE 3\\src\\noduplicate.txt"));
            String line2 = br1.readLine();
            while (line2 != null) {
                if (line.equals(line2)) {
                    flag = false;
                    break;
                }
                line2 = br1.readLine();
            }
            if (flag == true) {
                pw.println(line);
                pw.flush();
            }
            line = br.readLine();
        }
        br.close();
        pw.close();

        System.out.println("THE CONTENT OF FILE : " + f1.getName());
        File fw = new File("C:\\ANIKET SUTHAR\\JAVA\\com.Aniket\\MODULE 3\\src\\duplicate.txt");
        Scanner sc3 = new Scanner(fw);
        while (sc3.hasNextLine()) {
            String line2 = sc3.nextLine();
            System.out.println(line2);
        }
        sc3.close();
        System.out.println();

        System.out.println("THE CONTENT OF FILE : " + f2.getName());
        File fw1 = new File("C:\\ANIKET SUTHAR\\JAVA\\com.Aniket\\MODULE 3\\src\\noduplicate.txt");
        Scanner sc2 = new Scanner(fw1);
        while (sc2.hasNextLine()) {
            String line2 = sc2.nextLine();
            System.out.println(line2);
        }
        sc2.close();
    }
}
