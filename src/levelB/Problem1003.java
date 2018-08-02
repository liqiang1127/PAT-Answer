package levelB;

import java.util.Scanner;

public class Problem1003 {
    private static boolean check(String str){
        int[] pt = {1,1};
        for (int i = 0; i < str.length() ; i++) {
            char c = str.charAt(i);
            if( c != 'P' && c != 'A' && c!= 'T')
                return false;
            if(c == 'P')
                pt[0] --;
            if(c == 'T')
                pt[1] --;
        }
        if(pt[0] != 0 || pt[1] != 0)
            return false;
        String[] temp = str.split("P");
        if(temp[0].contains("T"))
            return false;
        int[] count = new int[3];
        count[0] = temp[0].equals("") ? 0 : temp[0].length();

        //后面肯定有T
        String[] temp2 = temp[1].split("T");
        if(temp2.length == 0)
            return false;
        count[1] = temp2[0].equals("") ? 0 : temp2[0].length();
        if(temp2.length > 1)
            count[2] = temp2[1].length();

        if(count[1] == 1 && count[0] == count[2])
            return true;

        if(count[1] > 1){
            int times = count[1] - 1;
            if(count[0] == 0 && count[2] == 0)
                return true;
            if(count[2] - times * count[0] >= 0)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0){
            String str = sc.next();
            if(check(str))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }


}
