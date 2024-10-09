// Java-Object---Hibernate(save(c))-----Table
class Customer{
  private Integer id;
  private String name;
  private Integer age;
  public Customer(int id, String name, int age){
    this.id = id;
    this.name = name;
    this.age = age;
  }
  public Customer(){}
  public void setId(int id){
    this.id = id;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public String toString(){
    return id+"  "+name+"  "+age;
  }
}
class TestMain{
   public static void main(String ags[]){
    Customer c = new Customer(); // c :{id:100, name: "ABC", age:0}
    c.setId(100);
    c.setName("ABC");
    System.out.println(c); // c----> database
   }
}