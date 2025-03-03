public class FibonacciSeries {
    public static void main(String[] args){
        int n = 0;
        int n2 = 1;
        for(int i = 0; i<15;++i){
            int fn = n + n2;
            n = n2;
            n2 = fn;
            System.out.println(fn);
        }
    }
}