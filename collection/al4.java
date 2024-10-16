import java.util.ArrayList;
// int arr[] = new int[10];
/*
public void add(int index, Integer E){
   if(index > this.size())
     throw new IndexOutOfBoundsException():
   else{
       // Execute add logic
   }  
}
*/
class TestMain{
    public static void main(String args[]){
       ArrayList<Integer> al = new ArrayList<Integer>();
       al.add(10);
       al.add(20);
       al.add(30);
       al.add(40);
       al.add(50);
       al.add(60);
       System.out.println("Total Item : "+al.size());
       al.add(8,5000);
       System.out.println(al);
    }
}