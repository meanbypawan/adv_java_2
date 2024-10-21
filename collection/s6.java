/*
  Iterable<--Collection<--Set<--SortedSet<--TreeSet
  TreeSet
    |---TreeSet():=> Responsible to provide default natural sorting order [Comparable]
    |---TreeSet(Collection)
    |---TreeSet(SortedSet)
    |---TreeSet(Comparator)

    class Integer implements Comparable{}
    class String implements Comparable{}
*/
import java.util.TreeSet;
import java.util.Spliterator;
class Customer{
    private int id;
    private String name;
    private int age;
    public Customer(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Customer(){}
    public String toString(){
        return id+"  "+name+"  "+age;
    }
    public int hashCode(){
        return id;
    }
    public boolean equals(Object o){
        Customer c = (Customer)o;
        return (this.id == c.id) && (this.name.equals(c.name));
    }
}
class TestMain{
    public static void main(String args[]){
        TreeSet<Customer> ts = new TreeSet<Customer>();
        ts.add(new Customer(100,"A",23));
        ts.add(new Customer(101,"B",24));
        ts.add(new Customer(102,"C",25));
        ts.add(new Customer(102,"D",26));
        ts.add(new Customer(101,"B",24));

        Spliterator<Customer> itr = ts.spliterator();
        itr.forEachRemaining(System.out::println);
    }
}