import java.util.Arrays;

public class Strings {
    public static void main(String [] args) {
       //COMPARISON
        /*String a =new String("pdeu");
        String b =new String("pdeu");
        boolean s =a.equals(b); // checks reference value of both objects are same or not
        System.out.println(s);
        */

        //GETTING VALUE AT A PARTICULAR INDEX
       /* String a ="Aniket";
        System.out.println(a.charAt(0));
        */


        //PRETTY PRINTING
        /*float a =45.23742f;
        System.out.printf("Formatted number is %.2f", a);
        System.out.println();
        System.out.printf("PIE %.2f",Math.PI);
        System.out.println();
        System.out.printf(" Hello my name is %s and im in %s","Aniket","PDEU");
        System.out.println();
        System.out.printf("the sum of %d and %d is %d",2,3,5);

         */

        //OPERATORS
        //System.out.println('a'+'b');


        //STRING PERFORMANCE
        /*String series ="";
        for(int i=0;i<26;i++){
            char ch =(char)('a'+i);
            System.out.print(ch+" ");

         */


        //STRING BUILDER
         StringBuilder bd =new StringBuilder();
        /* for (int i=0;i<26;i++){
             char ch =(char)('a'+i);
             bd.append(ch);  //adding new value at the end
         }
        System.out.println(bd.toString());

         */


        // STRING METHOD
        String name = "Aniket";
        System.out.println(Arrays.toString(name.toCharArray()));
        }
    }



