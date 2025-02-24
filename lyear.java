public class lyear{
    public static void main(String[] args){
        System.out.println(leapyear(2020));
        System.out.println(leapyear(2025));
        System.out.println(leapyear(2036));
    }
    public static boolean leapyear(int year){
        boolean leap = (year%4 == 0)?true:false;
        return leap;
    }
}
