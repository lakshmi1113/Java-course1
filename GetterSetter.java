class test{
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

class GetterSetter{
    public static void main(String[] args){
        test t = new test();
        t.setName("abc");
        System.out.println(t.getName());
        System.out.println(name);

    }
}