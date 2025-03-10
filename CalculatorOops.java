import java.util.Scanner;
class Calc{
    int a;
    int b;
    void calc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        a = sc.nextInt();
        System.out.println("Enter number 2:");
        b = sc.nextInt();
    }
}
class Addition extends Calc{
    void add(){
        System.out.println(a+b);
    }
}
class Subtraction extends Calc{
    void sub(){
        System.out.println(a-b);
    }
}
class Multiplication extends Calc{
    void mul(){
        System.out.println(a*b);
    }
}
class Division extends Calc{
    void div(){
        System.out.println(a/b);
    }
}

class CalculatorOops{
    public static void main(String[] args){
        System.out.println("Enter the operation to be performed:- \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4. Division ");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        if(op == 1){
            Addition a = new Addition();
            a.calc();
            a.add();
        }
        else if(op == 2){
            Subtraction s = new Subtraction();
            s.calc();
            s.sub();
        }
        else if(op == 3){
            Multiplication m = new Multiplication();
            m.calc();
            m.mul();
        }
        else if(op == 4){
            Division d = new Division();
            d.calc();
            d.div();
        }
        else{
            System.out.println("other operations are not available. please choose something from the above 4.");
        }
    }
}