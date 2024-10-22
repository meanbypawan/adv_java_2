import java.util.Comparator;
public class SortByAge implements Comparator<Customer>{
   public int compare(Customer o1, Customer o2){
    int x =  o1.getAge() - o2.getAge();
    if(x == 0)
      return 1;
    return x;  
   }
}