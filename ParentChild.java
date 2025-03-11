class Parent {
    public void sayHello(){
        System.out.println("Hello from parent");
    }
}
class Child extends Parent{
    // @Override
    public void sayHello(){
        System.out.println("Hello from child");
    }
}
public class ParentChild{
    public static void main(String[] args){
        Parent p = new Child();
        p.sayHello();
    }
}