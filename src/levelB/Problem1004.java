package levelB;

import java.util.Scanner;

public class Problem1004 {
    private static class Student implements Comparable<Student>{
        String name;
        String course;
        int grade;

        public Student(int grade){
            this.grade = grade;
        }

        public Student(String string){
            String[] strs = string.split(" ");
            this.name = strs[0];
            this.course = strs[1];
            this.grade = Integer.parseInt(strs[2]);
        }
        @Override
        public int compareTo(Student stu) {
            if(this.grade > stu.grade)
                return 1;
            if(this.grade < stu.grade)
                return -1;
            return 0;
        }

        @Override
        public String toString(){
            return this.name + " " +this.course;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        Student best = new Student(-1);
        Student worst = new Student(101);
        while( n-- > 0){
            Student temp = new Student(sc.nextLine());
            if(temp.compareTo(best) > 0)
                best = temp;
            if(temp.compareTo(worst) < 0)
                worst = temp;
        }
        System.out.println(best);
        System.out.println(worst);
    }
}
