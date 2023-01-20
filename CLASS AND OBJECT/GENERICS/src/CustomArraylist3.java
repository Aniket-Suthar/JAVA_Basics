import java.beans.Customizer;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomArraylist3 {

    private int [] data;
    private static int DEFAULT_SIZE=10;
    private int size=0; //size will also work as index

    public CustomArraylist3(){
        this.data=new int[DEFAULT_SIZE];
    }

    public void add(int num ){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private boolean isFull(){
        return size==data.length;
    }

    private void resize(){
        int[] temp =new int[data.length*2];

        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    public int remove(){
         int removed=data[--size];
         return removed;
    }

    public int get(int a){
        return data[a];
    }

    public int size(){
        return size;
    }
    public void set(int a, int value){
        data[a]=value;
    }

    @Override
    public String toString() {
        return "CustomArraylist3 { " +
                "data = " + Arrays.toString(data) +", size=" + size + '}';
    }
    public static void main(String[] args) {
        CustomArraylist3 list =new CustomArraylist3();
        list.add(6);
        list.add(7);
        list.add(8);
        for (int i = 0; i < 12; i++) {
            list.add(i*2);
        }
        System.out.println(list);
    }


}
