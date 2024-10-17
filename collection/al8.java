/*
   a. Iterator  ----> Collection
   b. ListIterator---> List
   c. Enumeration ---> Vector
  Iterator :-
  1. Iterator itr = c.iterator();
  2. iterator() is available in Iterable so it is applicable on all
  child classes of Collection[AL,LL,Vec,Stack, HS, LHS, TS....]
  3. Iterator can move in forward direction only

  ListIterator :-
  1.  aa:-  ListIterator lit = l.listIterator();
            ListIterator lit = l.listIteration(2);
  2. listIterator() is available in List so it is applicable on all child classes of List only [Al, LL,Vec, Stack]
  3. It can move in forward as well as backward direction both
  4. ListIterator is child of Iterator
 */
import java.util.ArrayList;
import java.util.Iterator;
class TestMain{
   public static void main(String args[]){
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(10);
    al.add(20);
    al.add(40);
    al.add(30);
    al.add(25);
    al.add(40);
    Iterator<Integer> itr =  al.iterator();   
    while(itr.hasNext()){
        Integer element = itr.next();
        System.out.println(element);
    }
   }
}