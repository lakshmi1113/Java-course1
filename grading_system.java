import java.util.Scanner;
public class grading_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks:");
        int marks = sc.nextInt();
        if(marks>90){
            System.out.println("O");
        }
        else if(marks>80 && marks<=90){
            System.out.println("A+");
        }
        else if(marks>70 && marks<=80){
            System.out.println("A");
        }
        else if(marks>60 && marks<=70){
            System.out.println("B");
        }
        else if(marks>= 50 && marks<60){
            System.out.println("C");
        }
        else{
            System.out.println("F");
        }
    }
}
