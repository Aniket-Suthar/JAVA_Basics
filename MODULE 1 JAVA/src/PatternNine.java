public class PatternNine {
    public static void main(String[] args) {
        String str="Stream";
        int n = str.length();
        for (int row = 0; row <n; row++) {

            for (int space = 0; space < n-row; space++) {   // loop for getting space
                System.out.print(" ");
            }
            for (int col =0; col <= row; col++) {
                char ch =str.charAt(col);

                System.out.print( " " + ch);
            }
            System.out.println();
        }


    }

}
