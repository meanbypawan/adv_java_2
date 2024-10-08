/*
  1. Primitive --> Object
   Process of converting primitive into its corresponding
   compatible object is called Boxing.
 */
class TestMain{
    public static void main(String args[]){
        Byte a = 20, b = 10;
        byte c = (byte)(a + b);
        System.out.println(c);
    }
}