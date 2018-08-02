package levelB;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem1002 {
    public static void main(String[] args) {
        String[] dic = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            sum += c - '0';
        }
        List<String> list = new LinkedList<>();
        while( sum != 0){
            list.add(dic[sum % 10]);
            sum /= 10;
        }

        for (int i = list.size()-1; i > 0; i--){
            System.out.print(list.get(i)+ " ");
        }
        System.out.print(list.get(0));
    }
}
