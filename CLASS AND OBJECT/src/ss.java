
import java.util.Arrays;

    class Stack {
        int tos = -1;
        int size;
        int[] arr;
        Stack(){
            System.out.println("default");
        }

        Stack(int size) {
            this.size = size;
            this.arr = new int[size];
        }

        void push(int p) {
            this.tos++;
            if (this.tos == this.size) {
                System.out.println("Overflow");
                return;
            }
            this.arr[tos] = p;
            System.out.println(Arrays.toString(this.arr));
        }

        void pop() {
            if (this.tos == -1) {
                System.out.println("Underflow");
                return;
            }
            int pop = this.arr[this.tos];
            this.tos--;
            System.out.println("element popped is " + pop);
        }
        int peep(Stack a,int tos,int i){
            if(tos-i<0){
                System.out.println("underflow index");
                return Integer.MIN_VALUE;
            }
            return a.arr[tos-i];
        }

        boolean isEmpty(Stack test) {
            return this.tos == -1;
        }

        public static class ss {
            public static void main(String[] args) {
                Stack test = new Stack(5);
//        test.push(3);
                System.out.println(test.isEmpty(test));
                System.out.println(test.size);
                test.push(5);
                test.push(1);
                test.push(23);
                test.push(50);
                test.push(90);

                System.out.println(test.peep(test,test.tos,2));


            }
        }
    }

