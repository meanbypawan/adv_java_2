/*
  pulic class Object{
    public String toString(){
      return this.getClass().getName()+"@"+this.hashCode();
    }
  }
  abstract public class Number extends Object{
    
  }
  public class Integer extends Number{
     Integer x;
     public Integer(Integer x){
       this.x = x;
     }
     public int hashCode(){
        return x;
     }
     public String toString(){
       this.hashCode();
     }
  }
 */
class TestMain{
    public static void main(String args[]){
        int x = 20;
        Integer iobj = new Integer(x);
        System.out.println(iobj); // iobj.toString()
        System.out.println(iobj.hashCode()); // 20
    }
}