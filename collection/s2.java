import java.util.LinkedHashSet;
import java.util.Spliterator;
class TestMain{
    public static void main(String args[]){
      LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
      ts.add(10);
      ts.add(50);
      ts.add(50);
      ts.add(40);
      ts.add(40);
      ts.add(30);
      ts.add(20);
      ts.add(25);
      Spliterator<Integer> itr =  ts.spliterator();
      itr.forEachRemaining((element)->System.out.println(element));
    }
}