class shape{
    public double getArea(){
        return 0;
    }
}
class square extends shape{
    private double s;
    public square(double s){
        this.s = s;
    }    
    public double getArea(){
        double area =(s*s);
        return area;
    }
}
class triangle extends shape{
    private double b;
    private double h;

    public triangle(double b, double h){
        this.b = b;
        this.h = h;
    }

    public double getArea() {
        double area = (0.5 * b * h);
        return area;
    }
}
public class Oops1{
    public static void main(String[] args){
        shape[] sh = new shape[2];
        sh[0] = new square(5);
        sh[1] = new triangle(12,5);

        System.out.println("area of the square is " + sh[0].getArea());
        System.out.println("area of the triange is " + sh[1].getArea());
    }
}
