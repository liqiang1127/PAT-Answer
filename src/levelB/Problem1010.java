package levelB;

import java.util.Scanner;

public class Problem1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(b == 0)
                break;
            if(!flag)
                System.out.print(" ");
            else
                flag = false;
            int pre = a * b;
            int later = b-1;
            System.out.print(pre + " " + later);
        }
        if(flag)
            System.out.print(0 + " " + 0);
    }
}
