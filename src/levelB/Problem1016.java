package levelB;


import java.util.Scanner;

public class Problem1016 {
    private static int getPNumber(String N,char DN){
        int cur = 1;
        int sum = 0;
        for (int i = 0; i < N.length(); i++) {
            if(N.charAt(i) == DN){
                sum += cur*(DN - '0');
                cur *= 10;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        char DA = sc.next().charAt(0);
        String B = sc.next();
        char DB = sc.next().charAt(0);
        int PA = getPNumber(A, DA);
        int PB =  getPNumber(B, DB);
        int res = PA + PB;
        System.out.print(res);
    }
}
