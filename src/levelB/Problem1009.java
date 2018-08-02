package levelB;

import java.util.Scanner;

public class Problem1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strs = s.split(" ");
        for (int i = strs.length - 1; i > 0; i--) {
            System.out.print(strs[i]+ " ");
        }
        System.out.print(strs[0]);
    }
}
