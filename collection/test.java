interface I{
    void m1();
}
class A{
    public void wish(){
        System.out.println("Good Morning....");
    }
    public static void sayHello(){
        System.out.println("Hello Friends....");
    }
}
class TestMain{
    public static void main(String args[]){
        /*
        A out = new A();
        I obj = out::wish;
        obj.m1();
        */
       I obj = A::sayHello;
       obj.m1();
    }
}