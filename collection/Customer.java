public class Customer implements Comparable<Customer>{
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
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getId(){
        return id;
    }
    public int compareTo(Customer c){
        return this.id - c.id;
    }
}