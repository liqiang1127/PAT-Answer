package levelB;

import java.util.Scanner;

public class Problem1007 {
    private static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pre = 2;
        int count = 0;
        for (int i = 3; i <= n ; i++) {
            if(isPrime(i)){
                if(i - pre == 2)
                    count++;
                pre = i;
            }
        }
        System.out.println(count);
    }
}
