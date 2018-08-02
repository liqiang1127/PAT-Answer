package levelB;

import java.util.Scanner;

public class Problem1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cur = 1;
        StringBuilder sb = new StringBuilder();
        while (n != 0){
            int temp = n % 10;
            if(cur == 1){
                for (int i = temp; i > 0; i--)
                    sb.append(i);
            }

            if(cur == 2){
                for (int i = 0; i < temp ; i++)
                    sb.append("S");
            }

            if(cur == 3){
                for (int i = 0; i < temp; i++) {
                    sb.append("B");
                }
            }
            n /= 10;
            cur ++;
        }
        String str = sb.reverse().toString();
        System.out.println(str);
    }
}
