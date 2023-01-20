public class TestPrime {
    public class EnterPRime {
        public static void main(String[] args) {
            Prime(6);
        }
        static void Prime(int n){
            int i, j, y = 0;
            int flag = 0;
            int num =3;
            Scanner sc = new Scanner(System.in);
            if(n>=1){
                System.out.println(2);
            }
            for (i = 2; i <=n;) {
                for (j =2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        flag =1;
                        break;
                    }
                }
                if (flag==0) {
                    System.out.println(num);
                    i++;
                }
                flag=0;
                num++;
            }
        }
}
