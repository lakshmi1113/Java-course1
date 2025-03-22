class parent {
    public void area(int s){}
    public void area(int l,int b){}
    public void area(float r){}
}
class child extends parent {
    public void area(int s){
        System.out.println("the area of the square is"+ " "+ (s*s));
    }
    public void area(double r){
        System.out.println("The area of the circle is"+ " " + ((22/7)*r*r));
    }
    public void area(int l, int b){
        System.out.println("The area of the rectangle is"+" "+ (l*b));
    }
}

public class AreaShape{
    public static void main(String[] args){
        child c = new child();
        c.area(4);
        c.area(10.5);
        c.area(4,5);
    }
}
