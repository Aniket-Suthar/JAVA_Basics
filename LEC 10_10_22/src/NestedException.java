import java.util.Scanner;
     class nested {
        public static void main(String[] args) {
            int a , b ,arr[];
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first no : ");
            a = sc.nextInt();
            System.out.println("Enter the second no : ");
            b = sc.nextInt();
            try{
                System.out.println("a/b = " +a/b);
                try{
                    arr = new int[a/b];

                    for(int i =0;i<4;i++) {
                        arr[i] = i /(i - 1);
                        System.out.println("inside of inner Try Block");
                    }
                }
                catch (ArrayIndexOutOfBoundsException ae){
                    System.out.println("Array Error");
                }
                System.out.println("Out of outer Try Block");
            }
            catch (ArithmeticException e){
                System.out.println("Arithmetic Error");
            }
            System.out.println("Hello World");
        }
    }


