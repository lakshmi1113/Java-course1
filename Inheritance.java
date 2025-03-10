class Movies{
    void movie(){
        System.out.println("This is the movie class");
    }
}
class Comedy extends Movies{
    void com(){
        System.out.println("you can watch movies like- 3 idiots, Home alone etc.");
    }
}

class Horror extends Movies{
    void horror(){
        System.out.println("You can watch- Conjuring, final destination.");
    }
}

class Inheritance{
    public static void main(String[] args){
        Comedy c = new Comedy();
        c.com();
        Horror h = new Horror();
        h.horror();
    }
}