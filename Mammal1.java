class Mammal {
    void mam() {
        System.out.println("inside mammal class");
    }
}

class Lion1 extends Mammal{
    void roar() {
        System.out.println("inside lion class");
    }
}

class Whale extends Mammal {
    void hum() {
        System.out.println("inside whale class");
    }
}

class Mammal1{
    public static void main(String[] args){
        Whale obj = new Whale();
        obj.hum();
        obj.mam();
        Lion1 obj1 = new Lion1();
        obj1.roar();
        obj1.mam();
    }
}