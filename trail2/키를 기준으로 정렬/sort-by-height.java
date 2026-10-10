import java.util.Arrays;
import java.util.Scanner;
 class Person implements Comparable<Person>{
    String name;
    int height;
    int weight;

    public Person(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight =  weight;
    }

    public int compareTo(Person other){
        return this.height- other.height;
    }
    public String toString(){
        return name+" "+height+" "+weight+" ";
    }
}
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Person[] p = new Person[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            p[i] = new Person(name, height, weight);
        }

        Arrays.sort(p);

         for (int i = 0; i < n; i++) {
            System.out.println(p[i]);
        }
        
    }
}