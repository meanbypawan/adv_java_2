import java.util.Scanner;
// 
class ValidateData{
    public static boolean isValidName(String data){
      for(int i=0; i<data.length();i++){
         char ch = data.charAt(i);
         if(!(Character.isAlphabetic(ch) || Character.isSpace(ch)))
             return false;
      }
      return true;
    }
    public static boolean isValidMobileNumber(String data){
        try{
          Long.parseLong(data);
          if(data.length()!=10)
            return false;
          return true;  
        }
        catch(Exception e){
           return false;
        }
    }
}
class TestMain{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Mobile Number");
       String mobile = sc.nextLine();
       if(ValidateData.isValidMobileNumber(mobile))
         System.out.println("Valid Mobile Number");
       else
         System.out.println("Invalid Mobile Number");     
    }
}