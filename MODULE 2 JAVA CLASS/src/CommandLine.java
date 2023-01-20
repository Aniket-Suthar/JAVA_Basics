public class CommandLine {
        public static void main(String[] args) {
            display(1234 ,"HEllo", "im","ANiket" );
            display( 123, "Welcome" , "To" , "PDEU");
        }

        public static void display (int num , String...values)
        {
            System.out.println("The Number is " +num);
            for (String s: values)
            {
                System.out.println(s);
            }
        }
    }


