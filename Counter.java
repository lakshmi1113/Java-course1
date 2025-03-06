class Counter {
    int number = 10;

    void increment(){
        number = number+1;
        System.out.println(number);
    }
}

class Main{
    public static void main(String[] args){
    Counter c1 = new Counter();
    Counter c2 = new Counter();
    Counter c3 = new Counter();

    c1.increment();
    c2.increment();
    c3.increment();


}}
