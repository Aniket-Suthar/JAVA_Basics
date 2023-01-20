import java.util.Arrays;

public class Arraynew {
    public static void main(String[] args) {
        int []arr ={1,2,3,1,2,3,4};
        /*for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }*/
        //System.out.println(Arrays.toString(Arrays.sort(arr)
        for(int i =0;i<arr.length;i+=2){
                if(arr[i]!=arr[i+1]) {
                    System.out.println(arr[i]);
                    break;
                }



                }

            }

        }


