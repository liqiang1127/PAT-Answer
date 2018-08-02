package levelB;

import java.util.Scanner;

public class Problem1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m ; i++) {
            int last = arr[n-1];
            for (int j = n - 2; j >= 0 ; j--) {
                arr[j+1] = arr[j];
            }
            arr[0] = last;
        }
        for (int i = 0; i < n - 1 ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[n-1]);
    }
}
