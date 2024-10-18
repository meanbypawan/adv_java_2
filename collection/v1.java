/*
   ArrayList v/s Vector
   Similaraties:---
    1. Array concept
    2. Frequently Reterival
    3. Default Initial Capacity : 10
    4. RandomAccess | Serializable | Clonable
    ---------------------------------------------
    Difference :-
    ArrayList ;-
     1. ArrayList is non-synchronized by default
     2. Not thread safe.
     3. Fast
     4. ArrayList<Integer> al = new ArrayList<Integer>(); // ic:10
        al.add(1);
        ....
        ....
        al.add(10); // Capacity is full
        al.add(11); // 50% [(cc*3)/2 + 1] ==> 16
     5. ArrayList()
        ArrayList(int)
        ArrayList(Collection)
    Vector :-
     1. Vector is synchronized.  
     2. Thread safe
     3. Slow
     4. Vector v = new Vector(); // ic:10
        v.add(1)
        ...
        v.add(10);
        v.add(11); //  cc * 2 ==> 20 
     5. Vector() ---> ic : 10
        Vector(int)-> int : initial capacity
        Vector(Collection)
        Vector(int,int) --> int : ic, int : capacity incrementor
 */
import java.util.Vector;
class TestMain{
   public static void main(String args[]){
     Vector<Integer> v = new Vector<Integer>(3,2);
     v.add(10);
     v.add(20);
     v.add(30);
     System.out.println("Capacity : "+v.capacity()); // 3
     v.add(40);
     System.out.println("Capacity : "+v.capacity()); // 5
     v.add(50);
     v.add(60); // 7
     System.out.println("Capacity : "+v.capacity()); // 7
   }
}