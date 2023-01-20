public class Stack{
    private static final int size=10;
    int top=-1;
    private int [] arr;

//    public Stack(){
//        this(size);
//    }
    public Stack(int a){
        this.arr = new int[size];
    }

    public boolean push(int b) {
        if (isFull()) {
            System.out.println("THe Stack is full...");
            return false;
        }
        else {
            arr[++top] = b;
            return true;
        }
    }
    public int pop() {
        if(isEmpty()){
            System.out.println("THe stack is empty");
        }
            return arr[top--];
        }

   public int peek(){
        return arr[top];
    }

    public boolean isFull() {
       return top==arr.length-1;
    }

        private boolean isEmpty(){
             return top==-1;
        }

        public void display(){
            for (int i = 0; i < top; i++) {
                System.out.print(arr[i]+" ");
            }
        }
}
