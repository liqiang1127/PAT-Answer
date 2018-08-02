package levelB;

import java.util.Scanner;

public class Problem1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cur = 1;
        while(n-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            if(a + b > c)
                System.out.println("Case #"+cur+": true");
            else
                System.out.println("Case #"+cur+": false");

            cur++;
        }
    }
}
