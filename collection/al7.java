import java.util.ArrayList;
class TestMain{
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList(3);
        al.add(2);
        al.add(1);
        al.add(3);
        al.add(4);
        
        for(int i=0; i<al.size(); i++)
        {
             Integer element = al.get(i);
             System.out.println(element);
        } 
    }
}