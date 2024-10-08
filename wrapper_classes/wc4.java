class TestMain{
    public static void main(String args[]){
        int x = 20;
        Integer obj = x; // Auto-Boxing
        System.out.println(obj);

        Integer i1 = 130; 
        Integer i2 = 130;
        
        System.out.println(i1 == i2); // false
    }
}