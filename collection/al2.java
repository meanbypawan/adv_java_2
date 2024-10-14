import java.util.ArrayList;
/*
  Generic

 */
class Addition<T>{
    private T a;
    private T b;
    public Addition(T a, T b){
       this.a = a;
       this.b = b;
    }
    public void add(){
      System.out.println("a : "+a);
      System.out.println("b : "+b);
    }
}
class TestMain{
    public static void main(String args[]){
      Addition<String> obj = new Addition<String>(20.5f,10.3f);
      obj.add();
    }
}