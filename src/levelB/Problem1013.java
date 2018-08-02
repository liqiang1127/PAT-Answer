package levelB;

import java.util.Scanner;

public class Problem1013 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] ans = new int[n];

        int count = 0;
        int num = 1;
        while (true){
            if (count == n)
                break;
            num += 1;
            boolean isPri = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0){
                    isPri = false;
                    break;
                }
            }
            if(isPri)
                ans[count++] = num;
        }
        boolean frist = true;
        int printCount = 0;
        for (int i = m-1; i < n; i++){
            if(printCount % 10 == 0 && printCount != 0){
                System.out.println();
                frist = true;
            }
            if(frist)
                frist = false;
            else
                System.out.print(" ");
            System.out.print(ans[i]);
            printCount++;
        }
    }
}
