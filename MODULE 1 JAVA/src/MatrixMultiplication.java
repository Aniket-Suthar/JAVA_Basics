import java.util.Arrays;
import java.util.Scanner;
public class MatrixMultiplication {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter number of rows in Array : ");
            int row = in.nextInt();
            System.out.print("Enter number of columns in Array : ");
            int col = in.nextInt();
            int [][] arr1= new int[row][col];
            System.out.println("Enter the Elements of Array 1");
            for (int i = 0; i < row ; i++) {
                for (int j = 0; j < col; j++) {
                    arr1[i][j]= in.nextInt();
                }
            }
            System.out.println("Array 1 :");
            for (int i = 0; i < row; i++) {
                System.out.println(Arrays.toString(arr1[i]));
            }
            System.out.println("Enter Elements of Array 2:");
            int[][] arr2 = new int[row][col];
            for (int i = 0; i < row ; i++) {
                for (int j = 0; j < col; j++) {
                    arr2[i][j]= in.nextInt();
                }
            }
            System.out.println("Array 2 :");
            for (int i = 0; i < row; i++) {
                System.out.println(Arrays.toString(arr2[i]));
            }
            Multiply(arr1,row,col,arr2,row,col);
        }
        static void Multiply(int[][] arr1,int arr1_row,int arr1_col,int[][] arr2,int arr2_row,int arr2_col){
            System.out.println("The Resultant Array is : ");
            if(arr1_col==arr2_row) {
                int[][] arr3 = new int[arr1_row][arr2_col];
                for (int i = 0; i < arr1_row; i++) {
                    for (int j = 0; j < arr2_col; j++) {
                        for (int k = 0; k < arr1_row; k++) {
                            arr3[i][j] += arr1[i][k] * arr2[k][j];
                        }
                    }

                    System.out.println(Arrays.toString(arr3[i]));
                }
            }
            else{
                System.out.println("matrix multiplication can not be done of the given matrix.");
            }
        }
    }


