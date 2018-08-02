package levelB;


import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem1005 {
    // WA
    public static void main(String[] args) {
        int[] memo = new int[101];
        List<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0){
            int number = sc.nextInt();
            list.add(number);
            while (number != 1){
                if(number < 101 && memo[number] == 1){
                    memo[number] += 1;
                    break;
                }
                if(number < 101 )
                    memo[number] ++;
                if(number % 2 == 0){
                    number /= 2;
                }else{
                    number = (number * 3 + 1) / 2;
                }
            }
        }
        list.sort(Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for (int i = 0; i < list.size(); i++) {
            if(memo[list.get(i)] == 1){
                if(!flag)
                    sb.append(" ");
                else
                    flag = false;
                sb.append(list.get(i));
            }
        }
        System.out.println(sb.toString());
    }
}
