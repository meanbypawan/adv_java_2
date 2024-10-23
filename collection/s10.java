import java.util.*;
class TestMain{
    public static void main(String args[]){
       TreeMap<String,LinkedHashSet<String>> tm = new TreeMap<String,LinkedHashSet<String>>();

       LinkedHashSet mpList = new LinkedHashSet();
       mpList.add("Indore");
       mpList.add("Jabalpur");

       LinkedHashSet mhList = new LinkedHashSet();
       mhList.add("Mumbai");
       mhList.add("Pune");

       LinkedHashSet upList = new LinkedHashSet();
       upList.add("Agra");
       upList.add("Lucknow");

       tm.put("MP",mpList);
       tm.put("MH",mhList);
       tm.put("UP",upList); 
    
       for(Map.Entry<String, LinkedHashSet<String>>e : tm.entrySet()){
          String stateName = e.getKey();
          LinkedHashSet<String> cityList=  e.getValue();
          System.out.println("State Name : "+stateName);
          for(String city : cityList)
            System.out.println(city);
          System.out.println("===============================");  
       }
    }
}

