import java.util.ArrayList;
// int --> Integer
/*
  public E remove(int); // int--> index
  public boolean remove(java.lang.Object);
  al.remove(3);
 */
class TestMain{
    public static void main(String args[]){
       ArrayList<Integer> al = new ArrayList<Integer>();
       al.add(5);
       al.add(3);
       al.add(8);
       al.add(6);
       al.add(1);
       al.add(2);
       al.add(4);
       al.add(3);
       System.out.println(al);
       al.remove(new Integer(3));
       System.out.println(al);
    }
}