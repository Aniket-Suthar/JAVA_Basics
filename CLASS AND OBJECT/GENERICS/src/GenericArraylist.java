
import java.util.Arrays;

public class GenericArraylist<T> {    //here <T> denotes the template or type for which our Arraylist will be used
//public class GenericArraylist<T extends Number>   if this is used then only Number or its subclasses i.e floats ,integers etc. can only be used not strings data type will be used


    //public void wildcards(List <Number> list)   here we can pass only list of number not its subclass

    //public void wildcards (list <? extends Number> list ) here we can pass the subclass of NUmber as well.
    //these  are known as wildcards
    private Object [] data;
        private static int DEFAULT_SIZE=10;
        private int size=0; //size will also work as index

        public GenericArraylist(){
            this.data=new Object[DEFAULT_SIZE];
        }

        public void add(T num ){
            if(isFull()){
                resize();
            }
            data[size++]=num;
        }

        private boolean isFull(){
            return size==data.length;
        }

        private void resize(){
            Object [] temp =new Object[data.length*2];

            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }

        public T remove(){
            T removed=(T)(data[--size]);
            return removed;
        }

        public T get(int a){
            return (T)(data[a]);
        }

        public int size(){
            return size;
        }
        public void set(int a, T value){
            data[a]=value;
        }

        @Override
        public String toString() {
            return "GenericArraylist { " +
                    "data = " + Arrays.toString(data) +", size=" + size + '}';
        }

    public static void main(String[] args) {
        GenericArraylist <String> s=new GenericArraylist<>();
        s.add("A");
        s.add("b");
        s.add("C");
        System.out.println(s);
    }
}
