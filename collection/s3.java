import java.util.LinkedHashSet;
import java.util.Spliterator;
class TestMain{
    public static void main(String args[]){
      LinkedHashSet<StringBuffer> lhs = new LinkedHashSet<StringBuffer>();
      ts.add(new StringBuffer("A"));
      ts.add(new StringBuffer("B"));
      ts.add(new StringBuffer("C"));
      ts.add(new StringBuffer("A"));
      ts.add(new StringBuffer("B"));
      ts.add(new StringBuffer("C"));
      
      Spliterator<StringBuffer> itr =  ts.spliterator();
      itr.forEachRemaining((element)->System.out.println(element+"  "+element.hashCode()));
    }
}