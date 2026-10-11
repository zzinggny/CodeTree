
import java.io.*;

import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int korean;
    int english;
    int math;

    Student(String name, int korean, int english, int math){
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public int compareTo(Student other){
        if(this.korean == other.korean){
           if(this.english==other.english){
                return  other.math -this.math;
           }
           return other.english - this.english;
        }
        return other.korean - this.korean;
    }
    public String toString(){
        return name+" "+korean+" "+english+" "+math;
    }
}
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        
    
        Student[] s = new Student[n];
        for(int i =0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            s[i] = new Student(name, korean, english, math);
        }

        Arrays.sort(s);

        
        for(int i =0; i<n; i++){
            System.out.println(s[i]);
        }
    }
}