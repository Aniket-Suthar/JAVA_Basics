import java.io.*;
import java.util.Scanner;

 class BufferReadWrite_10 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File f1 = new File("test2.txt");
        FileWriter fw = new FileWriter("test2.txt");
        System.out.println("Enter your Name:");
        String s1 = sc.nextLine();
        System.out.println("Enter your Branch :");
        String s2 = sc.nextLine();
        System.out.println("Enter your Roll No.");
        int a = sc.nextInt();

        //for writing the content in file
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("The name of student is:" + s1);
        bw.write("\nStudent's Branch is:" + s2);
        bw.write("\nStudent's roll no.is:" + a);
        bw.close();   //whichever is latest opened will be closed first
        fw.close();

        //for reading the content from for file
        System.out.println("THE CONTENT OF FILE :" + f1.getName());
        FileReader fr = new FileReader("test2.txt");
        BufferedReader br = new BufferedReader(fr);
        String l;
        while ((l = br.readLine()) != null) {
            System.out.println(l);
        }
        br.close();
        fr.close();

    }


}
