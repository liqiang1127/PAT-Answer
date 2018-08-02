package levelB;

import java.util.Scanner;

public class Problem1014 {
    public static void main(String[] args) {
        // 这题时间要求100ms，感觉java是不可能ac的，建议换别的语言
        String[] days = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        Scanner sc = new Scanner(System.in);
        String[] ins = new String[4];
        for (int i = 0; i < 4 ; i++) {
            ins[i] = sc.nextLine();
        }

        //处理Day
        //等待处理的元素的索引
        int p = 0;
        String day = "";
        while(p < ins[0].length() && p < ins[1].length()){
            char a = ins[0].charAt(p);
            char b = ins[1].charAt(p);
            if(a >= 'A' && a <= 'G' && a == b){
                day = days[a - 'A'];
                break;
            }
            p++;
        }

        p++;
        int hour = 0;
        while(p < ins[0].length() && p < ins[1].length()){
            char a = ins[0].charAt(p);
            char b = ins[1].charAt(p);
            if(a >= '0' && a <= '9' && a == b){
                hour = a - '0';
                break;
            }
            if(a >= 'A' && a <= 'N' && a == b){
                hour = a - 'A' + 10;
                break;
            }
            p++;
        }

        p = 0;
        int minute = 0;
        while(p < ins[2].length() && p < ins[3].length()){
            char a = ins[2].charAt(p);
            char b = ins[3].charAt(p);
            if((a >= 'a' && a < 'z')|| (a >= 'A' && a <= 'Z')){
                if( a == b){
                    minute = p;
                    break;
                }
            }
            p ++;
        }
        String minS = minute < 10 ? "0"+minute : minute+"";
        System.out.print(day+" "+hour+":"+minS);
    }
}
