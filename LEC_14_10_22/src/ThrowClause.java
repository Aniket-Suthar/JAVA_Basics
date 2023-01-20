 class ThrowClause {
     public static void main(String[] args) throws Exception {
         divide(23, 0);
     }
     static void divide(int a, int b) throws Exception {
         System.out.println("The division is:" + (a / b));
         try{
          throw new ArithmeticException();
         }catch(ArithmeticException e){
             System.out.println("Sorry the divison can't be possible");
         }
     }
 }