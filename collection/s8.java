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
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;
class TestMain{
  public static void main(String ags[]){
    LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
    hm.put(100,"A");
    hm.put(101,"B");
    hm.put(102,"C");
    hm.put(101,"D");   
    hm.put(103,"D");
    hm.put(104,"D");

    Set<Map.Entry<Integer,String>> s = hm.entrySet();  
    for(Map.Entry<Integer,String> e : s){
      System.out.println(e.getKey()+"  "+e.getValue());
    }
  }
}