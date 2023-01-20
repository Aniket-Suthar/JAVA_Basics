import java.io.*;
import java.util.Scanner;

class Uppercase {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\ANIKET SUTHAR\\JAVA\\com.Aniket\\MODULE 3\\src\\lower.txt");
        FileInputStream fis = new FileInputStream(f1);

        File f2 = new File("C:\\ANIKET SUTHAR\\JAVA\\com.Aniket\\MODULE 3\\src\\upper.txt");
        FileOutputStream fos = new FileOutputStream(f2);

        int a;
        while ((a = fis.read()) != -1) {
            char c = (char) a;
            if (c >= 'a' && c <= 'z' || c >= 'A' || c <= 'Z') {
                fos.write(Character.toUpperCase(c));
            } else {
                fos.write(c);
            }
        }
        fos.close();
        fis.close();

        //reading the file content
        System.out.println("The initial file Content is :");
        File fw1 = new File("C:\\ANIKET SUTHAR\\JAVA\\com.Aniket\\MODULE 3\\src\\lower.txt");
        Scanner sc = new Scanner(fw1);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
        System.out.println();

        System.out.println("The new file Content is :");
        File fw = new File("C:\\ANIKET SUTHAR\\JAVA\\com.Aniket\\MODULE 3\\src\\upper.txt");
        Scanner sc1 = new Scanner(fw);
        while (sc1.hasNextLine()) {
            String line = sc1.nextLine();
            System.out.println(line);
        }
        sc1.close();
    }
}

