import java.util.TreeMap;
import java.util.Map.Entry;
class CustomName implements Comparable<CustomName>{
  private String name;
  private int id;
  public CustomName(String name, int id){
    this.name =  name;
    this.id = id;
  }
  public String getName(){
    return name;
  }
  public int getId(){
    return id;
  }
  public int compareTo(CustomName c){
    return this.name.compareTo(c.name);
  }
}
class TestMain{
    public static void main(String args[]){
      TreeMap<Integer,CustomName> tm = new TreeMap<Integer,CustomName>();
      tm.put(101,new CustomName("A",101));
      tm.put(102,new CustomName("A",102));
      tm.put(103,new CustomName("A",103));
      tm.put(104,new CustomName("A",104));

      for(Entry<Integer,CustomName> e: tm.entrySet()){
        System.out.println(e.getKey()+" "+e.getValue().getName());
      }
    }
}