/*
  Set
   |----HashSet
   |----LinkedHashSet     
  SortedSet
   |--------TreeSet

  Map
   |----HashMap
   |----LinkedHashMap
  SortedMap
   |--------TreeMap
 
 public class HashSet{
    private HashMap map;
    private static finall Object PRESENT=null;
    public HashSet(){
       map = new HashMap();
    }
    public void add(Object o){
      map.put(o,PRESENT);
    }
 }

 HashSet hs = new HashSet();
 hs.add(100)
----------------------------------------------
Map<---HashMap
 Map is group <Key,Value> object
put(key,value)
 */
import java.util.HashMap;
class TestMain{
  public static void main(String ags[]){
    HashMap<Integer,String> hm = new HashMap<Integer,String>();
    hm.put(100,"A");
    hm.put(101,"B");
    hm.put(102,"C");
    hm.put(101,"D");   
    hm.put(103,"D");
    hm.put(104,"D");
    
    System.out.println(hm);
  }
}