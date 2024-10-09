class A{
    public void m1(Integer x){
        System.out.println("m1()-executed...");
    }
}
class TestMain{
    public static void main(String args[]){
      A obj = new A();
      //obj.m1(10);
      obj.m1(null);
    }
}