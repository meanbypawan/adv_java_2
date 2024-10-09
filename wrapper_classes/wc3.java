/*
   Primitive ---> Object
     a. Boxing
     b. Auto-Boxing
   Object -----> Primitive
     a. Un-Boxing  
    byte----> byteValue()
    short --->shortValue()
    int----->intValue()
    long---->longValue
    ----
    ---
 */
class TestMain{
  public static void main(String args[]){
     /*
     Integer obj = new Integer(130);
     //int x = obj.intValue();
     byte x = obj.byteValue();
     System.out.println(x);
     */
    Integer obj = new Integer(100);
    //int x = obj; // Auto- UnBoxing
    byte x = obj;
    System.out.println(x);
  }
}