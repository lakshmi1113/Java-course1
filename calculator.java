public class calculator {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 50;
        System.out.println("the sum of"+a+" and"+b+"="+a+b);
        System.out.println("the difference of"+a+" and"+b+"="+ (a-b));
        System.out.println("the product of"+a+" and"+b+"="+a*b);
        System.out.println("the quotient of"+a+" and"+b+"="+b/a);
        System.out.println("them remainder of "+c+"divided by"+d+ " is"+ (c%d));
        System.out.println(a>b);
        System.out.println(small(5,100,2));
    }
    public static int small(int a, int b, int c){
        int smallest = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
        return smallest;
    }
}
