import java.util.Arrays;
import java.util.Scanner;
class Student implements Comparable<Student>{
    String name;
    int score1, score2, score3;
    int total;
    Student(String name, int score1, int score2,int score3){
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.total = this.score1+this.score2+this.score3;
    }

    public int compareTo(Student other){
        return this.total - other.total;
    }

    public String toString(){
        return name+" "+score1+" "+score2+" "+score3;
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] s = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();

            s[i] = new Student(name, score1, score2, score3);
        }
        Arrays.sort(s);

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
        
    }
}