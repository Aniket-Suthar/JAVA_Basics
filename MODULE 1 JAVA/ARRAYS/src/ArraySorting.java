import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int ans =0;
        int[] arr = {1,2,3,3,2,1,4};
        //Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i +=1) {
          ans=ans^arr[i];    //XOR USAGE
        }
        System.out.println(ans);
    }
}