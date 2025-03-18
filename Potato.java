abstract class objects {
    abstract void showShape();
    public void shape(){
        System.out.println("This is from class objects.");
    }
}
class sphere extends objects{
    void showShape(){
        System.out.println("this is from class sphere");
    }
}
class cuboid extends objects{
    void showShape(){
        System.out.println("This is from class cuboid");
    }
}
class prism extends objects{
    void showShape(){
        System.out.println("this is from class prism");
    }
}
public class Potato{
    public static void main(String[] args){
        cuboid obj = new cuboid();
        obj.shape();
        obj.showShape();
        sphere obj1 = new sphere();
        obj1.showShape();
        prism obj2 = new prism();
        obj2.showShape();
    }
}