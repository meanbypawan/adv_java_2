/*
 Iterable<---Collection<----Set<----HashSet<--LinkedHashSet
 HashSet:- Map [Hashtable]
  |-------It will manage the data uniquness[duplicates are not allowed]
  |-------Doesn't preserve insertion order
 HashSet:-- util package
   |----public HashSet() :-----ic:16 , load-factor : 0.75F
   |----public HashSet(int)
   |----public HashSet(Collection)
   |----public HashSet(int,float)

   ArrayList al = new ArrayList(10); // when 100% capacity full java create new ArrayList behind the scene

   HashSet hs = new HashSet(); // 16, lf: 0.75
   0.75 is 75% of 1
   It means when 75% capacity is full , Java create new HashSet
   behind the scene

   Note:- Load Factor value must be between 0 to 1
   HashSet hs = new HashSet(16,2.5f); // 
*/
import java.util.HashSet;
import java.util.Spliterator;
class TestMain{
    public static void main(String args[]){
       HashSet<Integer> hs = new HashSet<Integer>();
       hs.add(10);
       hs.add(10000);
       hs.add(9);
       hs.add(7);
       hs.add(10000);
       Spliterator<Integer> itr = hs.spliterator();
       itr.forEachRemaining(System.out::println);
    }
}