class Student1{
    int id;
    int stipend;
    String name;
    Student1(){}
    Student1(int id, String name){
        this.id = id;
        this.name = name;
    }
    Student1(int id,String name, int stipend){
        this.id = id;
        this.name = name;
        this.stipend = stipend;
    }

    void display(){
        System.out.println(this.id +"|"+ this.name +"|"+ this.stipend);
    }
}
public class StudentOverloading {
    public static void main(String[] args){
        Student1 s1 = new Student1();
        Student1 s2 = new Student1(12, "lakshmi");
        Student1 s3 = new Student1(10, "xyz", 100000);
        
        s1.display();
        s2.display();
        s3.display();
    }
}
