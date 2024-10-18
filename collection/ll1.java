/*
  ArrayList v/s LinkedList
  ArrayList:-
    ArrayList()
    ArrayList(int)
    ArrayList(Collection)
  LinkedList:-
    LinkedList()
    LinkedList(Collection)
 */
import java.util.LinkedList;
import java.util.Spliterator;
/*
  class PrintStream{
    void println(){}
  }
  class System{
    static PrintStream out;
  }
  Syste.out::println
 */
class TestMain{
    public static void main(String args[]){
      LinkedList<String> ll = new LinkedList<String>();
      ll.add("A");
      ll.add("B");
      ll.add("C");
      Spliterator<String> itr =  ll.spliterator();
      itr.forEachRemaining(System.out::println);
    }
}