/*
  Iterable<--Collection<---List<----ArrayList
  1. ArrayList() :-- 10
  2. ArrayList(int)
  3. ArrayList(Collection)
  -----------------------------
  Make a use of Array Concept
 */
import java.util.ArrayList;
class TestMain{
    public static void main(String args[]){
      ArrayList<Integer> al = new ArrayList<Integer>(); // 10
      al.add(100);
      al.add(200);
      al.add(300);
      al.add(10);
      al.add(20);
      al.add(30);
      System.out.println(al);
      System.out.println("Total Item : "+al.size());
      System.out.println(al.contains(350));
     
    }
}