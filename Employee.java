class Employee {
    int empno;
    float sal;
    String name;

    Employee(){
        System.out.println("******");
        empno = 101;
        sal = 10000f;
        name = "Lakshmi";
    }
    void display(){
            System.out.println(empno + "|" +name+ "|" + sal );
        }
}
class Main{
   public static void main(String[] args){
    Employee emp1 = new Employee();
   Employee emp2 = new Employee();
   Employee emp3 = new Employee();
   
   emp1.display();
   emp2.display();
   emp3.display();
   }
}   