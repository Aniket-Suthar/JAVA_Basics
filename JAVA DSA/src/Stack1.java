public class Stack1 {
    private static final int size=100;
    int top=-1;
    private char [] arr;

    //    public Stack(){
//        this(size);
//    }
    public Stack1(int a){
        this.arr = new char[size];
    }

    public boolean push(char b) {
        if (isFull()) {
            System.out.println("THe Stack is full...");
            return false;
        }
        else {
            arr[++top] = b;
            return true;
        }
    }
    public char pop() {
        if(isEmpty()){
            System.out.println("THe stack is empty");
        }
        return arr[top--];
    }

    public char peek(){
        return arr[top];
    }

    public boolean isFull() {
        return top==arr.length-1;
    }

    private boolean isEmpty(){
        return top==-1;
    }

    public void display(){
        for (int i =this.size;i<0;i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
