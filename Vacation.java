class hillstation {
    void location(){
        System.out.println("It is located in:");
    }        
    void famousFor(){
        System.out.println("It is famous for:");
    }
}
class Munnar {
    void location(){
        System.out.println("It is located in kerala.");
    }
    void famousFor(){
        System.out.println("Munnar is famous for spices, tea etc.");
    }
}
class Mussourie {
    void location(){
        System.out.println("It is located in Uttarakhand.");
    }
    void famousFor(){
        System.out.println("It is famous for weather.");
    }
}
class Nainital{
    void location(){
        System.out.println("It is located in Uttarakhand.");
    }
    void famousFor(){
        System.out.println("It is famous for temples and lakes.");
    }
}
class kashmir{
    void location(){
        System.out.println("It is located in J&K.");
    }
    void famousFor(){
        System.out.println("It is famous for shawls, snow, etc.");
    }
}
 public class Vacation{
    public static void main(String[] args){
        Munnar hs1 = new Munnar();
        hs1.location();
        hs1.famousFor();
        Mussourie hs2 = new Mussourie();
        hs2.location();
        hs2.famousFor();
        Nainital hs3 = new Nainital();
        hs3.location();
        hs3.famousFor();
        kashmir hs4 = new kashmir();
        hs4.location();
        hs4.famousFor();
    }
 }