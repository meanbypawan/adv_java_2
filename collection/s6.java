import java.util.TreeSet;
import java.util.Spliterator;
class TestMain{
    public static void main(String args[]){
        TreeSet<Customer> ts = new TreeSet<Customer>();
        //TreeSet<Customer> ts = new TreeSet<Customer>(new SortByName());
        //TreeSet<Customer> ts = new TreeSet<Customer>(new SortByAge());
        ts.add(new Customer(100,"A",23));
        ts.add(new Customer(101,"D",24));
        ts.add(new Customer(102,"B",25));
        ts.add(new Customer(102,"C",22));
        ts.add(new Customer(103,"B",24));

        Spliterator<Customer> itr = ts.spliterator();
        itr.forEachRemaining(System.out::println);
    }
}