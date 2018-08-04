package levelB;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Problem1015{
    static class Student{
        public int xue;
        public int de;
        public int cai;
        public int zong;
        public Student(int xue,int de, int cai, int zong) {
            super();
            this.xue = xue;
            this.de = de;
            this.cai = cai;
            this.zong = zong;
        }
        public void toSTring(){
            System.out.println(xue+" "+de +" "+cai );
        }

    }
    static Scanner scan = new Scanner(new BufferedInputStream(System.in));
    public static void main(String[] args) {
        ArrayList<Student> a1=new ArrayList<Student>();
        ArrayList<Student> a2=new ArrayList<Student>();
        ArrayList<Student> a3=new ArrayList<Student>();
        ArrayList<Student> a4=new ArrayList<Student>();
        int N = scan.nextInt();
        int L =scan.nextInt();
        int H =scan.nextInt();
        Comparator<Student > c =new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2){
                if(o1.zong != o2.zong){
                    return o2.zong - o1.zong;
                }else if(o1.de != o2.de ){
                    return o2.de - o1.de;
                }else return o1.xue - o2.xue;
            }
        };
        for(int i=0;i<N;i++){
            int xue,de,cai;
            xue = scan .nextInt();
            de = scan.nextInt();
            cai = scan.nextInt();
            if(de>=L && cai>=L){
                if(de >= H && cai>= H){
                    a1.add(new Student(xue,de, cai, de+cai));
                }else if(cai <H && de>=H){
                    a2.add(new Student(xue,de, cai, de+cai));
                }else if(cai <H && de <H && de>=cai ){
                    a3.add(new Student(xue,de , cai , de+cai));
                }else {
                    a4.add(new Student(xue,de , cai , de + cai));
                }
            }

        }

        Collections.sort(a1,c);
        Collections.sort(a2,c);
        Collections.sort(a3,c);
        Collections.sort(a4,c);
        System.out.println(a1.size()+a2.size()+a3.size()+a4.size());
        for(int i=0;i<a1.size();i++){
            a1.get(i).toSTring();
        }for(int i=0;i<a2.size();i++){
            a2.get(i).toSTring();
        }
        for(int i=0;i<a3.size();i++){
            a3.get(i).toSTring();
        }
        for(int i=0;i<a4.size();i++){
            a4.get(i).toSTring();
        }
    }
}



