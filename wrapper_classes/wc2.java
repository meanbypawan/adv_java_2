/*
  1. Primitive --> Object
   Process of converting primitive into its corresponding
   compatible object is called Boxing.
 */
class TestMain{
    public static void main(String args[]){
        // -2127483648 to 2147483647
        long x = 3148483650L;
        Long l = new Long(x);
        System.out.println(l);
    }
}