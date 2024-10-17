
import java.util.ArrayList;
import java.util.ListIterator;
class TestMain{
   public static void main(String args[]){
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(10);
    al.add(20);
    al.add(40);
    al.add(30);
    al.add(25);
    al.add(40);
    /*
    ListIterator<Integer> lit = al.listIterator(2); 
    while(lit.hasNext()){
        Integer element = lit.next();
        System.out.println(element);
    }
    */
   ListIterator<Integer> lit = al.listIterator(al.size());
   while(lit.hasPrevious()){
    Integer element = lit.previous();
    System.out.println(element);
   }
   }
}