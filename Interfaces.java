interface fruits{
    public void method1();
    public void method2();
}
public class Interfaces implements fruits{
    public void method1(){
        System.out.println("method1");
    }
    public void method2(){
        System.out.println("method2");
    }
    public static void main(String[] args){
        fruits obj = new Interfaces();
        obj.method1();
        obj.method2();
    }
}