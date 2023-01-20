import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int i, j, y = 0;
        int flag = 0;
        int num =3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of prime numbers you want:");
        int n = sc.nextInt();
        if(n>=1){     //eliminating 1 & 0 from prime nos.
            System.out.print(2+" ");
        }
            for (i = 2; i <=n;) {
                for (j =2; j <= Math.sqrt(num); j++) {

                    if (num % j == 0) {      //Checking prime number by dividing
                        flag =1;
                        break;
                    }
                }
                if (flag==0) {       //getting prime numbers
                    System.out.print(num + " ");
                    i++;
                }
                flag=0;     //continuing the loop to check next prime no.
                num++;

            }

        }
    }

