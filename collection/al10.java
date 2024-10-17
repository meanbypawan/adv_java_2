/*
  Collections
   sort
    |-----Default Natural Sorting Order [Comparable]
    |-----Customized Sorting Logic [Comparator]
 */
import java.util.ArrayList;
import java.util.Collections;
class TestMain{
   public static void main(String args[]){
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(10);
    al.add(20);
    al.add(40);
    al.add(30);
    al.add(25);
    al.add(40);
    Collections.sort(al); // al must contain  comparable object
    System.out.println(al);
   }
}