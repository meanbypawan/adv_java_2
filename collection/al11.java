import java.util.ArrayList;
import java.util.Collections;
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
}
class TestMain{
    public static void main(String ar[]){
        ArrayList<Customer> al = new ArrayList<Customer>();
        al.add(new Customer(100,"A",21));
        al.add(new Customer(102,"D",24));
        al.add(new Customer(101,"B",26));
        al.add(new Customer(104,"C",25));
        al.add(new Customer(103,"E",22));
        //Collections.sort(al);  --> Comparable, Comparator
        for(Customer c : al)
          System.out.println(c);
    }
}