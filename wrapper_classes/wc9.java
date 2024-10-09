/*
  primitive ----> String
  Object ----> String
 */
class TestMain{
    public static void main(String args[]){
      Integer x = 123;
      String s = x.toString();
      s = new StringBuffer(s).reverse().toString();
      System.out.println(s);
    }
}