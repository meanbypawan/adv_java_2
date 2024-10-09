/*
  1. primitive --> Object [Boxing]
  2. Object ---> Primitive [UnBoxing]
  3. String ---> primitive
                 parseByte()
                 parseShort()
                 parseInt()
                 parseLong()  -----------> static
                 parseFloat()
                 parseDouble()
    int x = 2147483647;
    x = x + 1; // -2147483648
 */
class TestMain{
    public static void main(String args[]){
        String s = "2147483648";
        //byte x = Byte.parseByte(s);
        //short x = Short.parseShort(s);
        //int x = Integer.parseInt(s);
        long x = Long.parseLong(s);
        System.out.println(x);
    }
}