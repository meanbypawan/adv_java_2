import java.util.Comparator;
public class SortByName implements Comparator<Customer>{
  public int compare(Customer o1, Customer o2){
    String o1KaName = o1.getName();
    String o2KaName = o2.getName();
    int diff = o1KaName.compareTo(o2KaName);
    if(diff == 0)
     return 1;
    return diff;
  }
}