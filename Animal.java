class Animal {
    void eat(){
        System.out.println("animal class -  eat method");
    }
}
class Lion extends Animal {
    void roar(){
        System.out.println("lion class - roar method");
    }
}
class BabyLion extends Lion{
    void weep(){
        System.out.println("BabyLion class - weep method");
    }
}
class Main{
    public static void main(String[] args){
        BabyLion obj = new BabyLion();
        obj.weep();
        obj.roar();
        obj.eat();
    }
}
