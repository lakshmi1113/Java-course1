import java.util.Scanner;
public class Student {
    String name;
    int id;
    int grade;
    String sec;

    void display(){
        System.out.println(name + "|" + id + "|" + grade + "|"+ sec);
    }
}
class StudentDetails {
    public static void main(String[] args){

        for (int i=0; i<10; i++){
            Student s = new Student();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter student's name:");
            s.name = sc.nextLine();
            System.out.println("Enter the student ID:");
            s.id = sc.nextInt();
            System.out.println("Enter the student's grade:");
            s.grade = sc.nextInt();
            System.out.println("Enter the student's section:");
            s.sec = sc.nextLine();
            s.sec = sc.nextLine();
            s.display();
        }
    }
}  
